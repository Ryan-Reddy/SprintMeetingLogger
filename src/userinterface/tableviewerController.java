package userinterface;

import dataprocessing.Fileread;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class tableviewerController {


    @FXML private TableColumn<?, ?> c1;
    @FXML private TableColumn<?, ?> c10;
    @FXML private TableColumn<?, ?> c11;
    @FXML private TableColumn<?, ?> c12;
    @FXML private TableColumn<?, ?> c2;
    @FXML private TableColumn<?, ?> c3;
    @FXML private TableColumn<?, ?> c4;
    @FXML private TableColumn<?, ?> c5;
    @FXML private TableColumn<?, ?> c6;
    @FXML private TableColumn<?, ?> c7;
    @FXML private TableColumn<?, ?> c8;
    @FXML private TableColumn<?, ?> c9;

    @FXML private ResourceBundle resources;

    @FXML private URL location;

    @FXML private TextArea textArea;

    @FXML
    void initialize() throws IOException {
        assert textArea != null : "fx:id=\"textArea\" was not injected: check your FXML file 'tableviewer.fxml'.";
                System.out.println(Fileread.fileReader());

        List tlist = Fileread.fileReader();
        for (Object l:tlist) {
            textArea.appendText(l+"\n");
        }
    }

}
