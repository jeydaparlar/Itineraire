package c5_sae.c5.ihm;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import java.io.IOException;

public class saeController {
    @FXML
    ComboBox ecologyButton;
    @FXML
    ComboBox villeDepartButton;
    @FXML
    ComboBox villeArriveButton;
    @FXML
    ComboBox typeTransportButton;

    @FXML
    Button researchButton;

    public void initialize() {
        ecologyButton.getItems().add("Ecologie");
        ecologyButton.getItems().add("Temps de trajet");
        ecologyButton.getItems().add("Prix");

        villeArriveButton.getItems().add("Amstredam");
        villeArriveButton.getItems().add("Paris");
        villeArriveButton.getItems().add("Luton");

        villeDepartButton.getItems().add("Amstredam");
        villeDepartButton.getItems().add("Paris");
        villeDepartButton.getItems().add("Luton");

        typeTransportButton.getItems().add("Bus");
        typeTransportButton.getItems().add("Avion");
        typeTransportButton.getItems().add("Train");
    }

    @FXML
    private void researchClicked(ActionEvent event) {
        try {
            // Load the new FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/result.fxml"));
            Parent root = loader.load();

            // Get the current stage (window)
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

            // Set the new scene
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
