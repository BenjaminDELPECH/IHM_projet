package projet_ihm;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javax.swing.text.html.ImageView;

/**
 * @author Amandine
 */
public class MenuStudent {
    
Button btn1 = new Button("Liste d'étudiants");

Button btn2 = new Button("Ajouter un étudiant");

Button btn3 = new Button("Quitter");

ImageView listEtuImage = new ImageView(new Image(formAddStudent.class.getResourceAsStream("images/liste_etu.png")));
listEtuImage.setFitHeight(50);
listEtuImage.setPreserveRatio(true);
        
ImageView AddEtuImage = new ImageView(new Image(formAddStudent.class.getResourceAsStream("images/ajout_etu.png")));
AddEtuImage.setFitHeight(50);
AddEtuImage.setPreserveRatio(true);
        
ImageView exitImage = new ImageView(new Image(formAddStudent.class.getResourceAsStream("images/exit.png")));
exitImage.setFitHeight(50);
exitImage.setPreserveRatio(true);


HBox hbox = new HBox(listEtuImage, btn1, AddEtuImage, btn2, exitImage, btn3);
}
