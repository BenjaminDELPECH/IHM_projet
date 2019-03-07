/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_ihm;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
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
public class formAddStudent extends GridPane{
    GridPane grid;
    public formAddStudent(){
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        
        Text scenetitle = new Text("Ajouter un étudiant");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 3, 1);

        Label nomLabel = new Label("Nom:");
        grid.add(nomLabel, 0, 1);

        TextField nomTextField = new TextField();
        grid.add(nomTextField, 1, 1);
        
        final Text nomError = new Text("");
        grid.add(nomError, 2, 1);

        Label prenomLabel = new Label("Prénom:");
        grid.add(prenomLabel, 0, 2);

        TextField prenomTextField = new TextField();
        grid.add(prenomTextField, 1, 2);
        
        final Text prenomError = new Text("");
        grid.add(prenomError, 2, 2);
        
        Label dateNaissanceLabel = new Label("Date de naissance:");
        grid.add(dateNaissanceLabel, 0, 3);

        DatePicker dateNaissanceField = new DatePicker();
        grid.add(dateNaissanceField, 1, 3);
        
        Label selectPromotionLabel = new Label("Promotion:");
        grid.add(selectPromotionLabel, 0, 4);

        ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.getItems().add("L3");
        choiceBox.getItems().add("M1");
        choiceBox.getItems().add("M2");
        choiceBox.getStyleClass().add("test");
        grid.add(choiceBox, 1, 4);
        
        
        
        Button btn = new Button("Valider");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 5);
        final Text actiontarget = new Text("");
        grid.add(actiontarget, 1, 6);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                nomError.setFill(Color.FIREBRICK);
                prenomError.setFill(Color.FIREBRICK);
                nomError.setText(nomTextField.getText());
                prenomError.setText(prenomTextField.getText());
            }
        });
    }
}
