/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maladie.pulmonaire;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.jpl7.Query;
import org.jpl7.Variable;

/**
 *
 * @author hamou
 */
public class MaladiePulmonaire extends Application {
    
    //  @FXML private ImageView ZonaImagen;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLHome.fxml"));    
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("Diagnostic Maladie Pulmonaire");
        stage.show();
        stage.setResizable(false);
        
        Variable X = new Variable();
        String t1 = "consult('C:/Users/hamou/Documents/NetBeansProjects/maladie pulmonaire/src/maladies_pulmonaires.pl')";
        Query q1 = new Query(t1);
        System.out.println(t1 + " " + (q1.hasSolution() ? "succeeded" : "failed"));
    }
    
   @FXML 
   private javafx.scene.control.Button closeButton;

    @FXML
    private void closeButtonAction(){
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
    
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
