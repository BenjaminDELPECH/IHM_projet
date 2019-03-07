/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_ihm;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author benja
 */
public class Projet_IHM extends Application {
 
final static ObservableList<StudentV2> observableStudents=  FXCollections.observableArrayList(
);
 
 
 
 
    @Override
    public void start(Stage primaryStage) {
        
   
       
       
      formAddStudent formAdd = new formAddStudent(observableStudents);
        
        listStudent tabListStudent = new listStudent(observableStudents);
       
        formUpdateStudent formUpdate = new formUpdateStudent("Benjamin", "DELPECH", 1996, "M1");
        
        
        MenuStudent myMenu = new MenuStudent(formAdd, formUpdate, tabListStudent);
        
        GridPane screen = new GridPane();
        screen.setAlignment(Pos.CENTER);
        screen.setPadding(new Insets(25, 25, 25, 25));
        
        
        
        screen.add(myMenu, 0, 0);
        screen.add(formAdd, 0, 1);
        screen.add(formUpdate, 0, 1);
        screen.add(tabListStudent, 0, 1);
        formAdd.setVisible(true);
        formUpdate.setVisible(false);
        tabListStudent.setVisible(false);
        
        
       Group root = new Group();
       root.getChildren().add(screen);
     
       Scene scene = new Scene(root, 700, 700, Color.WHITE );
       
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
