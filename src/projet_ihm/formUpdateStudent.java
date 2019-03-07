/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_ihm;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author benja
 */
public class formUpdateStudent extends GridPane {

   

    public formUpdateStudent(String myFirstName, String mySurName, int myYearOfBirth, String myPromotion) {
       

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Modifier un étudiant");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 3, 1);

        // NOM
        Label nomLabel = new Label("Nom:");
        grid.add(nomLabel, 0, 1);
        TextField nomTextField = new TextField();
        grid.add(nomTextField, 1, 1);
        final Text nomError = new Text();
        nomError.setFill(Color.FIREBRICK);
        grid.add(nomError, 2, 1);

        //Prenom
        Label prenomLabel = new Label("Prénom:");
        grid.add(prenomLabel, 0, 2);
        TextField prenomTextField = new TextField();
        grid.add(prenomTextField, 1, 2);
        final Text prenomError = new Text();
        prenomError.setFill(Color.FIREBRICK);
        grid.add(prenomError, 2, 2);

        //Date Naissance
        Label dateNaissanceLabel = new Label("Date de naissance:");
        grid.add(dateNaissanceLabel, 0, 3);
        TextField dateNaissanceField = new TextField();
        grid.add(dateNaissanceField, 1, 3);
        final Text dateError = new Text();
        dateError.setFill(Color.FIREBRICK);
        grid.add(dateError, 2, 3);

        //Promotion
        Label selectPromotionLabel = new Label("Promotion:");
        grid.add(selectPromotionLabel, 0, 4);

        ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.getItems().add("L3");
        choiceBox.getItems().add("M1");
        choiceBox.getItems().add("M2");
        choiceBox.getStyleClass().add("test");
        grid.add(choiceBox, 1, 4);

        Button btn = new Button("Modifier");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 5);
        final Text actiontarget = new Text("");
        grid.add(actiontarget, 1, 6);
        
        this.getChildren().add(grid);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {

                nomError.setText(nomTextField.getText());
                prenomError.setText(prenomTextField.getText());
            }

            // force the field to be numeric only
        });

        dateNaissanceField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                     String newValue
            ) {
                if (!newValue.matches("\\d*")) {
                    dateNaissanceField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        }
        );

    }
}
