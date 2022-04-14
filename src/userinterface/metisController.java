package userinterface;

import dataprocessing.Fileread;
import dataprocessing.Filewriter;
import dataprocessing.Meeting;
import dataprocessing.MeetingDataModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.round;

public class metisController {
    private final ArrayList<String> meetingTypeList = new ArrayList(Arrays.asList("Scrum",
                                                                                  "Daily Standup Sprint 1",
                                                                                  "Product Owner Meeting",
                                                                                  "Sprint Review",
                                                                                  "Projecturen"));
    private final ObservableList<String> observableMeetingTypeList = FXCollections.observableList(meetingTypeList);
    private final ArrayList<String> sprintNumList = new ArrayList(Arrays.asList("Sprint 0",
                                                                                "Sprint 1",
                                                                                "Sprint 2",
                                                                                "Sprint 3"));
    private final ObservableList<String> observableSprintNumList = FXCollections.observableList(sprintNumList);
    private final ArrayList<String> teamList = new ArrayList(Arrays.asList("The Avengers"));
    private final ObservableList<String> observableTeamList = FXCollections.observableList(teamList);
    @FXML
    private AnchorPane anchorPaneALLmeetis;
    @FXML
    public TableView<MeetingDataModel> tableView;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    String nowTime = dtf.format(LocalTime.now());
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;
    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    @FXML // fx:id="DatePicker"
    private DatePicker DatePicker; // Value injected by FXMLLoader
    @FXML // fx:id="TeamComboBox"
    private ComboBox<String> TeamComboBox; // Value injected by FXMLLoader
    @FXML // fx:id="afsluitButton"
    private Button afsluitButton; // Value injected by FXMLLoader
    @FXML //
    private Button dbButton; // Value injected by FXMLLoader
    @FXML // fx:id="baianCheckBox"
    private CheckBox baianCheckBox; // Value injected by FXMLLoader
    @FXML // fx:id="clearButton"
    private Button clearButton; // Value injected by FXMLLoader
    @FXML // fx:id="imageView"
    private ImageView imageView; // Value injected by FXMLLoader
    @FXML // fx:id="endTimeTextField"
    private TextField endTimeTextField; // Value injected by FXMLLoader
    @FXML // fx:id="meesCheckBox"
    private CheckBox meesCheckBox; // Value injected by FXMLLoader
    @FXML // fx:id="meetingTypeComboBox"
    private ComboBox<String> meetingTypeComboBox; // Value injected by FXMLLoader
    @FXML // fx:id="mohamedCheckBox"
    private CheckBox mohamedCheckBox; // Value injected by FXMLLoader
    @FXML // fx:id="onderwerpTextField"
    private TextField onderwerpTextField; // Value injected by FXMLLoader
    @FXML // fx:id="opslaanButton"
    private Button opslaanButton; // Value injected by FXMLLoader
    @FXML // fx:id="oussamaCheckBox"
    private CheckBox oussamaCheckBox; // Value injected by FXMLLoader
    @FXML // fx:id="ryanCheckBox"
    private CheckBox ryanCheckBox; // Value injected by FXMLLoader
    @FXML // fx:id="thijsCheckBox"
    private CheckBox thijsCheckBox; // Value injected by FXMLLoader
    @FXML // fx:id="saveAsTextField"
    private TextField saveAsTextField; // Value injected by FXMLLoader
    @FXML // fx:id="sprintComboBox"
    private ComboBox<String> sprintComboBox; // Value injected by FXMLLoader
    @FXML // fx:id="textArea"
    private TextArea textArea; // Value injected by FXMLLoader
    @FXML // fx:id="timeTextField"
    private TextField timeTextField; // Value injected by FXMLLoader
    @FXML
    private Label statusLabel;
    @FXML
    private TextArea textArea1;
    @FXML
    private AnchorPane bgMLanchorPane;
    @FXML
    private Tab bgTab;
    @FXML
    private TabPane bgtabPane;
    @FXML
    private TableColumn<MeetingDataModel, String> c1;
    @FXML
    private TableColumn<MeetingDataModel, String> c2;
    @FXML
    private TableColumn<MeetingDataModel, String> c3;
    @FXML
    private TableColumn<MeetingDataModel, String> c4;
    @FXML
    private TableColumn<MeetingDataModel, String> c5;
    @FXML
    private TableColumn<MeetingDataModel, String> c6;
    @FXML
    private TableColumn<MeetingDataModel, String> c7;
    @FXML
    private TableColumn<MeetingDataModel, String> c8;
    @FXML
    private TableColumn<MeetingDataModel, String> c9;
    @FXML
    private TableColumn<MeetingDataModel, String> c10;
    @FXML
    private TableColumn<MeetingDataModel, String> c11;
    @FXML
    private TableColumn<MeetingDataModel, String> c12;

    @FXML
    private Label varLabelBayan;

    @FXML
    private Label varLabelMees;

    @FXML
    private Label varLabelMohamed;

    @FXML
    private Label varLabelOussama;

    @FXML
    private Label varLabelRyan;

    @FXML
    private Label varLabelThijs;

    @FXML
    private Label varLabelTotMeetings;
    @FXML
    private boolean style=false;


    private ArrayList<Meeting> alleMeetingsUitLogList;


    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        System.out.println("~|~|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~|~");
        System.out.println("_INIT_");
        assert DatePicker != null : "fx:id=\"DatePicker\" was not injected: check your FXML file 'metis.fxml'.";
        assert TeamComboBox != null : "fx:id=\"TeamComboBox\" was not injected: check your FXML file 'metis.fxml'.";
        assert baianCheckBox != null : "fx:id=\"baianCheckBox\" was not injected: check your FXML file 'metis.fxml'.";
        assert meesCheckBox != null : "fx:id=\"meesCheckBox\" was not injected: check your FXML file 'metis.fxml'.";
        assert mohamedCheckBox != null : "fx:id=\"mohamedCheckBox\" was not injected: check your FXML file 'metis.fxml'.";
        assert thijsCheckBox != null : "fx:id=\"thijsCheckBox\" was not injected: check your FXML file 'metis.fxml'.";
        assert onderwerpTextField != null : "fx:id=\"onderwerpTextField\" was not injected: check your FXML file 'metis.fxml'.";
        assert oussamaCheckBox != null : "fx:id=\"oussamaCheckBox\" was not injected: check your FXML file 'metis.fxml'.";
        assert ryanCheckBox != null : "fx:id=\"ryanCheckBox\" was not injected: check your FXML file 'metis.fxml'.";
        assert timeTextField != null : "fx:id=\"timeTextField\" was not injected: check your FXML file 'metis.fxml'.";
        assert textArea != null : "yooyoyoo";

        assert textArea != null : "fx:id=\"textArea\" was not injected: check your FXML file 'tableviewer.fxml'.";

        c1.setCellValueFactory(new PropertyValueFactory<>("MeetingNaam"));
        c2.setCellValueFactory(new PropertyValueFactory<>("Datum"));
        c3.setCellValueFactory(new PropertyValueFactory<>("Starttijd"));
        c4.setCellValueFactory(new PropertyValueFactory<>("Eindtijd"));
        c5.setCellValueFactory(new PropertyValueFactory<>("Ryan"));
        c6.setCellValueFactory(new PropertyValueFactory<>("Bayan"));
        c7.setCellValueFactory(new PropertyValueFactory<>("Oussama"));
        c8.setCellValueFactory(new PropertyValueFactory<>("Mees"));
        c9.setCellValueFactory(new PropertyValueFactory<>("Mohamed"));
        c10.setCellValueFactory(new PropertyValueFactory<>("Thijs"));
        c11.setCellValueFactory(new PropertyValueFactory<>("Note"));

        try {
            dbREFRESH();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("The database cannot be loaded:\n" + e);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        statusLabel.setTextFill(Color.BLACK);
        statusLabel.setText("Status Ok!");
        DatePicker.setValue(LocalDate.now());
        timeTextField.setText(nowTime);
        ryanCheckBox.setSelected(true);

        TeamComboBox.setItems(observableTeamList);
        sprintComboBox.setItems(observableSprintNumList);
        meetingTypeComboBox.setItems(observableMeetingTypeList);
        imageView.setImage(new Image("metis.jpg"));

    }

    public void opslaanButtonPressed(ActionEvent actionEvent) throws IOException, InterruptedException {
        bgtabPane.setStyle("-fx-background-color: #5dc7dc; -fx-border-width: 5px;");

        try {
            Filewriter.filewriter(new Meeting(ryanCheckBox.isSelected(),
                                              baianCheckBox.isSelected(),
                                              oussamaCheckBox.isSelected(),
                                              meesCheckBox.isSelected(),
                                              mohamedCheckBox.isSelected(),
                                              thijsCheckBox.isSelected(),
                                              "sprint 1 scrum",
                                              DatePicker.getValue(),
                                              timeTextField.getText(),
                                              endTimeTextField.getText(),
                                              textArea.getText()).toString(),
                                  saveAsTextField.getText());

            statusLabel.setTextFill(Color.GREEN);
            statusLabel.setFont(new Font("Arial",
                                         15));
            statusLabel.setText("Save Completed!");

            initialize();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void clearButtonPressed(ActionEvent actionEvent) throws InterruptedException {
        bgMLanchorPane.setStyle("-fx-background-color: #ff0000; -fx-border-width: 5px;");

        statusLabel.setTextFill(Color.CYAN);
        statusLabel.setText("Clearing.");
        wait(1500);
        initialize();
    }

    @FXML
    public boolean darkModeButtonPressed(ActionEvent event) {
        Scene s = anchorPaneALLmeetis.getScene();
            s.setUserAgentStylesheet("userinterface/newDarkMode.css");
            return style=true;
    }
    @FXML
    public boolean lightModeButtonPressed(ActionEvent event) {
        Scene s = anchorPaneALLmeetis.getScene();
        s.setUserAgentStylesheet("userinterface/normalModeStyle.css");
        return style=false;
    }

    public void dbButtonPressed(ActionEvent actionEvent) throws IOException, ParseException {
        dbREFRESH();
    }


    public void dbREFRESH() throws IOException, ParseException {
        fillDataList();
    }

    private void fillDataList() throws ParseException, IOException {
        ObservableList<MeetingDataModel> dataList = FXCollections.observableArrayList();
        MeetingDataModel dataModel;
        String meetingNaam = "";
        String datum = "";
        String starttijd = "";
        String eindtijd = "";
        String ryan = "";
        String bayan = "";
        String oussama = "";
        String mees = "";
        String mohamed = "";
        String thijs = "";
        String note = "";

        List tlist = Fileread.fileReader(); //read file per line
        String listString = String.join("\n",
                                        tlist); //concatenate entire file to one string

        Pattern p = Pattern.compile("\\{(.*?)\\}"); //pattern to split file
        Matcher m = p.matcher(listString);
        while (m.find()) {
            String meetingUitLogString = m.group(1);                    //is your string. do what you want
            textArea1.appendText(meetingUitLogString + "\n");
            String[] meetParts = meetingUitLogString.split(";");

            meetingNaam = meetParts[0];
            datum = meetParts[1];
            starttijd = meetParts[2];
            eindtijd = meetParts[3];
            ryan = meetParts[4];
            bayan = meetParts[5];
            oussama = meetParts[6];
            mees = meetParts[7];
            mohamed = meetParts[8];
            thijs = meetParts[9];
            note = meetParts[10];

            dataModel = new MeetingDataModel(meetingNaam,
                                             datum,
                                             starttijd,
                                             eindtijd,
                                             ryan,
                                             bayan,
                                             oussama,
                                             mees,
                                             mohamed,
                                             thijs,
                                             note);
            dataList.add(dataModel);
        }
        tableView.getItems().setAll(dataList);
        labelPercentageFiller();
    }

    public void labelPercentageFiller() {
        List<String> columnTot = new ArrayList<>();
        int totalCount = 0;
        List<String> columnDataRyan = new ArrayList<>();
        int RyanCount = 0;
        List<String> columnDataBayan = new ArrayList<>();
        int BayanCount = 0;
        List<String> columnDataOussama = new ArrayList<>();
        int OussamaCount = 0;
        List<String> columnDataMees = new ArrayList<>();
        int MeesCount = 0;
        List<String> columnDataMo = new ArrayList<>();
        int MoCount = 0;
        List<String> columnDataThijs = new ArrayList<>();
        int ThijsCount = 0;
        for (MeetingDataModel item : tableView.getItems()) {
            columnTot.add(c2.getCellObservableValue(item).getValue());
            columnDataRyan.add(c5.getCellObservableValue(item).getValue());
            columnDataBayan.add(c6.getCellObservableValue(item).getValue());
            columnDataOussama.add(c7.getCellObservableValue(item).getValue());
            columnDataMees.add(c8.getCellObservableValue(item).getValue());
            columnDataMo.add(c9.getCellObservableValue(item).getValue());
            columnDataThijs.add(c10.getCellObservableValue(item).getValue());
        }

        for (String b : columnTot) {
            totalCount++;
        }
        for (String b : columnDataRyan) {
            System.out.println(b);
            if (b.equals("true")) {
                RyanCount++;
            }
        }
        for (String b : columnDataBayan) {
            if (b.equals("true")) {
                BayanCount++;
            }
        }
        for (String b : columnDataOussama) {
            if (b.equals("true")) {
                OussamaCount++;
            }
        }
        for (String b : columnDataMees) {
            if (b.equals("true")) {
                MeesCount++;
            }
        }
        for (String b : columnDataMo) {
            if (b.equals("true")) {
                MoCount++;
            }
        }
        for (String b : columnDataThijs) {
            if (b.equals("true")) {
                ThijsCount++;
            }
        }
        varLabelTotMeetings.setText(String.valueOf(totalCount));
        varLabelRyan.setText(round((RyanCount/(double)totalCount)*100)+"%");
        varLabelBayan.setText(round((BayanCount/(double)totalCount)*100)+"%");
        varLabelOussama.setText(round((OussamaCount/(double)totalCount)*100)+"%");
        varLabelMees.setText(round((MeesCount/(double)totalCount)*100)+"%");
        varLabelMohamed.setText(round((MoCount/(double)totalCount)*100)+"%");
        varLabelThijs.setText(round((ThijsCount/(double)totalCount)*100)+"%");
    }

    public void afsluitButtonPressed(ActionEvent actionEvent) {
        bgtabPane.setStyle("-fx-background-color: #ff0648; -fx-border-width: 5px;");
        System.out.println("TODO Afsluitbutton programming needed");
    }


}
