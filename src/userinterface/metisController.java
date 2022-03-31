package userinterface;

/**
 * Sample Skeleton for 'metis.fxml' Controller Class
 */

import com.sun.tools.javac.Main;
import dataprocessing.Filewriter;
import dataprocessing.Meeting;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class metisController {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    String nowTime = dtf.format(LocalTime.now());


    private final ArrayList<String> meetingTypeList = new ArrayList(Arrays.asList("Scrum", "Daily Standup", "Sprint Review", "Projecturen"));
    private final ObservableList<String> observableMeetingTypeList = FXCollections.observableList(meetingTypeList);

    private final ArrayList<String> sprintNumList = new ArrayList(Arrays.asList("Sprint 0", "Sprint 1", "Sprint 2", "Sprint 3"));
    private final ObservableList<String> observableSprintNumList = FXCollections.observableList(sprintNumList);

    private final ArrayList<String> teamList = new ArrayList(Arrays.asList("The Avengers"));
    private final ObservableList<String> observableTeamList = FXCollections.observableList(teamList);


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
        // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
        assert DatePicker != null : "fx:id=\"DatePicker\" was not injected: check your FXML file 'metis.fxml'.";
        assert TeamComboBox != null : "fx:id=\"TeamComboBox\" was not injected: check your FXML file 'metis.fxml'.";
        assert baianCheckBox != null : "fx:id=\"baianCheckBox\" was not injected: check your FXML file 'metis.fxml'.";
        assert meesCheckBox != null : "fx:id=\"meesCheckBox\" was not injected: check your FXML file 'metis.fxml'.";
        assert mohamedCheckBox != null : "fx:id=\"mohamedCheckBox\" was not injected: check your FXML file 'metis.fxml'.";
        assert mohamedCheckBox != null : "fx:id=\"thijsCheckBox\" was not injected: check your FXML file 'metis.fxml'.";
        assert onderwerpTextField != null : "fx:id=\"onderwerpTextField\" was not injected: check your FXML file 'metis.fxml'.";
        assert oussamaCheckBox != null : "fx:id=\"oussamaCheckBox\" was not injected: check your FXML file 'metis.fxml'.";
        assert ryanCheckBox != null : "fx:id=\"ryanCheckBox\" was not injected: check your FXML file 'metis.fxml'.";
        assert timeTextField != null : "fx:id=\"timeTextField\" was not injected: check your FXML file 'metis.fxml'.";
        assert textArea != null : "yooyoyoo";

        DatePicker.setValue(LocalDate.now());
        timeTextField.setText(nowTime);
        ryanCheckBox.setSelected(true);

        TeamComboBox.setItems(observableTeamList);
        sprintComboBox.setItems(observableSprintNumList);
        meetingTypeComboBox.setItems(observableMeetingTypeList);
        imageView.setImage(new Image("metis.jpg"));
    }

    public void opslaanButtonPressed(ActionEvent actionEvent) throws IOException {
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
    }

    public void clearButtonPressed(ActionEvent actionEvent) {
        System.out.println("TODO clearbutton programming needed");

    }

    public void dbButtonPressed(ActionEvent actionEvent) throws IOException {
        System.out.println("TODO dbButtonPressed programming needed");

        String fxmlDB = "tableviewer.fxml";
        FXMLLoader loady = new FXMLLoader(getClass().getResource(fxmlDB));
        Parent loadup = loady.load();
        Stage dbStage = new Stage();

        dbStage.setTitle("Overview");
        dbStage.centerOnScreen();
        dbStage.initModality(Modality.APPLICATION_MODAL);
        dbStage.setScene(new Scene(loadup));

        dbStage.showAndWait();

    }

    public void afsluitButtonPressed(ActionEvent actionEvent) {
        System.out.println("TODO Afsluitbutton programming needed");
    }
//
//    public void popup() throws IOException {
//        String fxmlPopup = "popup.fxml";
//        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPopup));
//        Parent popup = loader.load();
//        Stage popupStage = new Stage();
//
//        popupStage.getIcons().add(new Image("metis.jpg"));
//        popupStage.setTitle("Metis - Goddess of good counsel, planning, cunning and wisdom. ~ grants you your wish.");
//        popupStage.setScene(new Scene(popup));
//        popupStage.initModality(Modality.APPLICATION_MODAL);
//        popupStage.showAndWait();
//    }

}
