import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;


import java.io.IOException;


public class Main extends Application {
    public static void main(String[] args)  {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        try {
            String fxmlMetis = ".\\userinterface\\metis.fxml";
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlMetis));
            Parent root = loader.load();

            stage.getIcons().add(new Image("metis.jpg"));
            stage.setTitle("Metis - Goddess of good counsel, planning, cunning and wisdom.");
            stage.setScene(new Scene(root));
            stage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("_Main.java_IOException_");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.toString());
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("_Main.java_Exception_");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            String s = e.toString();
            alert.setContentText(s);
            alert.showAndWait();
        }
    }
}
