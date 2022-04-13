package userinterface;

import dataprocessing.Fileread;
import dataprocessing.Filewriter;
import dataprocessing.Meeting;
import dataprocessing.MeetingDataModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class metisController {
    private final ArrayList<String> meetingTypeList = new ArrayList(Arrays.asList("Scrum", "Daily Standup Sprint 1", "Product Owner Meeting", "Sprint Review", "Projecturen"));
    private final ObservableList<String> observableMeetingTypeList = FXCollections.observableList(meetingTypeList);

    private final ArrayList<String> sprintNumList = new ArrayList(Arrays.asList("Sprint 0", "Sprint 1", "Sprint 2", "Sprint 3"));
    private final ObservableList<String> observableSprintNumList = FXCollections.observableList(sprintNumList);

    private final ArrayList<String> teamList = new ArrayList(Arrays.asList("The Avengers"));
    private final ObservableList<String> observableTeamList = FXCollections.observableList(teamList);

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
    public TableView<MeetingDataModel> tableView;
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
    private ArrayList<Meeting> alleMeetingsUitLogList;




    @FXML        // This method is called by the FXMLLoader when initialization is complete
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
        c12.setCellValueFactory(new PropertyValueFactory<>(""));

        try {
            dbREFRESH();
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("The database cannot be loaded:\n" + e);
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
        bgtabPane.setStyle("-fx-background-color: #ff0120; -fx-border-width: 5px;");

        try {
            Filewriter.filewriter(new Meeting(ryanCheckBox.isSelected(), baianCheckBox.isSelected(), oussamaCheckBox.isSelected(), meesCheckBox.isSelected(), mohamedCheckBox.isSelected(), thijsCheckBox.isSelected(), "sprint 1 scrum", DatePicker.getValue(), timeTextField.getText(), endTimeTextField.getText(), textArea.getText()).toString(), saveAsTextField.getText());

            statusLabel.setTextFill(Color.GREEN);
            statusLabel.setFont(new Font("Arial", 15));
            statusLabel.setText("Save Completed!");
            try {
                wait(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                initialize();
            }
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

    public void dbButtonPressed(ActionEvent actionEvent) throws IOException, ParseException {
        dbREFRESH();
        fillDataList();
    }


    public void dbREFRESH() throws IOException {
        List tlist = Fileread.fileReader();
        for (Object l : tlist) {
            System.out.println(l+"+++++++++++++++++++++++++++++++++++++++++++");
//            String[] parts = l.toString().split(",");
//            System.out.println(l);
//            System.out.println(parts[0]);
//            System.out.println(parts[1]);

//            alleMeetingsUitLogList.add((new Meeting()) l);
            textArea1.appendText(l + "\n");
        }
    }

    private void fillDataList() throws ParseException {
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


//
//        for (Meeting les : ingelogde.getKlas().getAlleLessenVanDezeKlas()) {
//                if (les.getTijd().getHour() == uur) {
//                    if (weekNummerVanDatum(les.getDatum()) == weekNummer) {
//                        DayOfWeek day = les.getDatum().getDayOfWeek();
//                        switch (day) {
//                            case MONDAY -> {
//                                if (maandag.equals("")) {
//                                    maandag = les.getTijd().toString() + "\n" + les.getVak().toString() + "\n" + les.getDatum().toString();
//                                    lesuur = true;
//                                } else {
//                                    maandag2 = les.getTijd().toString() + "\n" + les.getVak().toString() + "\n" + les.getDatum().toString();
//                                    duplicate = true;
//                                }
//                            }
//                            case TUESDAY -> {
//                                if (dinsdag.equals("")) {
//                                    dinsdag = les.getTijd().toString() + "\n" + les.getVak().toString() + "\n" + les.getDatum().toString();
//                                    lesuur = true;
//                                } else {
//                                    dinsdag2 = les.getTijd().toString() + "\n" + les.getVak().toString() + "\n" + les.getDatum().toString();
//                                    duplicate = true;
//                                }
//                            }
//                            case WEDNESDAY -> {
//                                if (woensdag.equals("")) {
//                                    woensdag = les.getTijd().toString() + "\n" + les.getVak().toString() + "\n" + les.getDatum().toString();
//                                    lesuur = true;
//                                } else {
//                                    woensdag2 = les.getTijd().toString() + "\n" + les.getVak().toString() + "\n" + les.getDatum().toString();
//                                    duplicate = true;
//                                }
//                            }
//                            case THURSDAY -> {
//                                if (donderdag.equals("")) {
//                                    donderdag = les.getTijd().toString() + "\n" + les.getVak().toString() + "\n" + les.getDatum().toString();
//                                    lesuur = true;
//                                } else {
//                                    donderdag2 = les.getTijd().toString() + "\n" + les.getVak().toString() + "\n" + les.getDatum().toString();
//                                    duplicate = true;
//                                }
//                            }
//                            case FRIDAY -> {
//                                if (vrijdag.equals("")) {
//                                    vrijdag = les.getTijd().toString() + "\n" + les.getVak().toString() + "\n" + les.getDatum().toString();
//                                    lesuur = true;
//                                } else {
//                                    vrijdag2 = les.getTijd().toString() + "\n" + les.getVak().toString() + "\n" + les.getDatum().toString();
//                                    duplicate = true;
//                                }
//                            }
//                            case SATURDAY -> {
//                                if (zaterdag.equals("")) {
//                                    zaterdag = les.getTijd().toString() + "\n" + les.getVak().toString() + "\n" + les.getDatum().toString();
//                                    lesuur = true;
//                                } else {
//                                    zaterdag2 = les.getTijd().toString() + "\n" + les.getVak().toString() + "\n" + les.getDatum().toString();
//                                    duplicate = true;
//                                }
//                            }
//                            case SUNDAY -> {
//                                if (zondag.equals("")) {
//                                    zondag = les.getTijd().toString() + "\n" + les.getVak().toString() + "\n" + les.getDatum().toString();
//                                    lesuur = true;
//                                } else {
//                                    zondag2 = les.getTijd().toString() + "\n" + les.getVak().toString() + "\n" + les.getDatum().toString();
//                                    duplicate = true;
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//            if (lesuur) {
//                dataModel = new StudentSchermDataModel(maandag, dinsdag, woensdag, donderdag, vrijdag, zaterdag, zondag);
//                dataList.add(dataModel);
//                if (duplicate) {
//                    dataModel2 = new StudentSchermDataModel(maandag2, dinsdag2, woensdag2, donderdag2, vrijdag2, zaterdag2, zondag2);
//                    dataList.add(dataModel2);
//                }
//            }
//            maandag = "";
//            maandag2 = "";
//            dinsdag = "";
//            dinsdag2 = "";
//            woensdag = "";
//            woensdag2 = "";
//            donderdag = "";
//            donderdag2 = "";
//            vrijdag = "";
//            vrijdag2 = "";
//            zaterdag = "";
//            zaterdag2 = "";
//            zondag = "";
//            zondag2 = "";
//        }
    tableView.getItems().setAll(dataList);
//    }
    }
    public void afsluitButtonPressed(ActionEvent actionEvent) {
        bgtabPane.setStyle("-fx-background-color: #ff0648; -fx-border-width: 5px;");
        System.out.println("TODO Afsluitbutton programming needed");
    }

}
