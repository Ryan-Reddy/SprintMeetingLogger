package userinterface;

import dataprocessing.Fileread;
import dataprocessing.Filewriter;
import dataprocessing.Meeting;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class metisController {
    private ArrayList<String> meetingTypeList = new ArrayList(Arrays.asList("Scrum", "Daily Standup Sprint 1", "Daily Standup Sprint 2", "Daily Standup Sprint 3", "Sprint Review", "Projecturen"));
    private ObservableList<String> observableMeetingTypeList = FXCollections.observableList(meetingTypeList);
    private ArrayList<String> sprintNumList = new ArrayList(Arrays.asList("Sprint 0", "Sprint 1", "Sprint 2", "Sprint 3"));
    private ObservableList<String> observableSprintNumList = FXCollections.observableList(sprintNumList);
    private ArrayList<String> teamList = new ArrayList(Arrays.asList("The Avengers"));
    private ObservableList<String> observableTeamList = FXCollections.observableList(teamList);
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
        try {
            dbREFRESH();
        } catch (IOException e) {
            System.out.println("The database cannot be loaded:\n"+e);
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
        try {
            Filewriter.filewriter(new Meeting(
                    ryanCheckBox.isSelected(),
                    baianCheckBox.isSelected(),
                    oussamaCheckBox.isSelected(),
                    meesCheckBox.isSelected(),
                    mohamedCheckBox.isSelected(),
                    thijsCheckBox.isSelected(),
                    "sprint 1 scrum",
                    DatePicker.getValue(),
                    timeTextField.getText(),
                    endTimeTextField.getText(),
                    textArea.getText()).toString(), saveAsTextField.getText());

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
        statusLabel.setTextFill(Color.CYAN);
        statusLabel.setText("Clearing.");
        wait(1500);
        initialize();
    }

    public void dbButtonPressed(ActionEvent actionEvent) throws IOException {
        dbREFRESH();
        }


    public void dbREFRESH() throws IOException {
        List tlist = Fileread.fileReader();
        for (Object l : tlist) {
            textArea1.appendText(l + "\n");
        }
    }

    public void afsluitButtonPressed(ActionEvent actionEvent) {
        System.out.println("TODO Afsluitbutton programming needed");
    }
}
