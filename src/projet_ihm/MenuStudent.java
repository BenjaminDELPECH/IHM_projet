package projet_ihm;

import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;


/**
 * @author Amandine
 */
public class MenuStudent extends Parent{
 
public MenuStudent(formAddStudent formAdd, formUpdateStudent formUpdate, listStudent tabListStudent) {  
Button btn1 = new Button("Liste d'étudiants");

Button btn2 = new Button("Ajouter un étudiant");

Button btn3 = new Button("Quitter");

ImageView listEtuImage = new ImageView(new Image(formAddStudent.class.getResourceAsStream("images/students.png")));
listEtuImage.setFitHeight(50);
listEtuImage.setPreserveRatio(true);
        
ImageView AddEtuImage = new ImageView(new Image(formAddStudent.class.getResourceAsStream("images/add.png")));
AddEtuImage.setFitHeight(50);
AddEtuImage.setPreserveRatio(true);
        
ImageView exitImage = new ImageView(new Image(formAddStudent.class.getResourceAsStream("images/exit.png")));
exitImage.setFitHeight(50);
exitImage.setPreserveRatio(true);


HBox hbox = new HBox(listEtuImage, btn1, AddEtuImage, btn2, exitImage, btn3);

this.getChildren().add(hbox);



 btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
               tabListStudent.setVisible(true);
               formAdd.setVisible(false);
               formUpdate.setVisible(false);
               
            }

            // force the field to be numeric only
        });
 
  btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
               tabListStudent.setVisible(false);
               formAdd.setVisible(true);
               formUpdate.setVisible(false);
            }

            // force the field to be numeric only
        });
  
  
   btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
               exit();
            }

            // force the field to be numeric only
        });





 }
}
