/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_ihm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javax.swing.JPanel;

/**
 *
 * @author benja
 */
public class Projet_IHM extends Application {

    @Override
    public void start(Stage primaryStage) {
        formAddStudent form = new formAddStudent();
        
        Scene scene = new Scene(form.grid, 800, 450);
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
