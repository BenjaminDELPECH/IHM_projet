package projet_ihm;

import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
/**
 *
 * @author Amandine
 */
public class listStudent extends Parent{
    
    public listStudent(ObservableList<StudentV2> observableStudents) {
        TableView table = new TableView();
        GridPane grid = new GridPane();
        Button delete = new Button("delete");
        Button update = new Button("update");
        
        GridPane grid2 = new GridPane();
        grid2.add(update, 0, 0);
        grid2.add(delete, 1, 0);
        
        
        final Label label = new Label("Voici la liste des étudiants : ");
        label.setFont(new Font("Arial", 20));
 
        table.setEditable(true);
 
        TableColumn prenomCol = new TableColumn("Prénom");
        prenomCol.setCellValueFactory(
                new PropertyValueFactory<Student, String>("fName"));
        TableColumn nomCol = new TableColumn("Nom");
        nomCol.setCellValueFactory(
                new PropertyValueFactory<Student, String>("lName"));
        TableColumn naissanceCol = new TableColumn("Année de naissance");
        naissanceCol.setCellValueFactory(
                new PropertyValueFactory<Student, String>("dateOfBirth"));
        TableColumn promotionCol = new TableColumn("Promotion");
        promotionCol.setCellValueFactory(
                new PropertyValueFactory<Student, String>("promotion"));
        
        
        
        table.setItems(observableStudents);
        table.getColumns().addAll(prenomCol, nomCol, naissanceCol, promotionCol);
        table.setMinWidth(600);
        grid.add(table, 0, 0);
        grid.add(grid2, 1, 0);
        
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(40);
        grid.setVgap(10);
        grid.setPadding(new Insets(15, 15, 15, 15));
        
        this.getChildren().add(grid);
      
    }
}
