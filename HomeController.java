package Library;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
    @FXML
    public void goQLS(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ManageMember.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setTitle("Member");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void goQLTT(ActionEvent actionEvent) {
    }

    public void goQLMS(ActionEvent actionEvent) {
    }
}
