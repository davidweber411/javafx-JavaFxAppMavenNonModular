package your.groupid.javafxappnonmodular.views;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    @FXML
    private Label welcomeTextLabel;

    private boolean buttonClicked = false;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String welcomeText = """
                Welcome to the non modular JavaFX Application!

                Instructions (if not done yet):
                    - change the package names from "your.groupId.javafxappnonmodular" to your group id with your application name
                      (don't forget the controller in your fxml file)
                            
                    - in your pom.xml file:
                        - edit "groupId"
                        - edit "artifactId"
                        - edit "version"
                        - edit "mainclassnameparam"
                    
                To create an executable jar file execute the maven goal "package" in your project root.""";
        welcomeTextLabel.setText(welcomeText);
    }

    @FXML
    protected void onClickmeButtonClick() {
        if (buttonClicked) {
            welcomeTextLabel.setTextFill(Color.BLACK);
        } else {
            welcomeTextLabel.setTextFill(Color.RED);
        }
        buttonClicked = !buttonClicked;
    }

}