package userinterface;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ResourceBundle;

import dataprocessing.Fileread;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;

public class tableviewerController {




    @FXML private ResourceBundle resources;

    @FXML private URL location;

    @FXML private TextArea textArea;

    @FXML
    void initialize() throws IOException {
        assert textArea != null : "fx:id=\"textArea\" was not injected: check your FXML file 'tableviewer.fxml'.";
        System.out.println(Fileread.fileReader());

        Path path = Path.of("db/AvengersMeetingLog.txt");
        List<String> meetings = Files.readAllLines(path);
        String alleTekst = Files.readString(path);

        List tlist = Fileread.fileReader();
        for (Object l:tlist) {
            textArea.appendText(l+"\n");
        }
    }




}
