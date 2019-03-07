package projet_ihm;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Amandine
 */
public class listStudent {
    private TableView table = new TableView();

    public listStudent() {
        final Label label = new Label("Voici la liste des étudiants : ");
        label.setFont(new Font("Arial", 20));
 
        table.setEditable(true);
 
        TableColumn prenomCol = new TableColumn("Prénom");
        TableColumn nomCol = new TableColumn("Nom");
        TableColumn naissanceCol = new TableColumn("Année de naissance");
        TableColumn promotionCol = new TableColumn("Promotion");
        TableColumn modifCol = new TableColumn("Modification");
        TableColumn supprCol = new TableColumn("Suppression");
        
        table.getColumns().addAll(prenomCol, nomCol, naissanceCol, promotionCol, modifCol, supprCol);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);
    }
}
