/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maladie.pulmonaire;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

/**
 *
 * @author hamou
 */
public class HomeController implements Initializable {
    
    @FXML private Button start;
    /**
     * Initializes the controller class.
     */
    
    private void newWindow() throws IOException {
        
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLMaladie.fxml"));
        stage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Diagnostic Poumon");
        stage.show();
        stage.setResizable(false);
    }
    
    private void newMaladie() throws IOException {
        
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDoc.fxml"));
        //stage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Maladies");
        stage.show();
        //stage.setResizable(false);
    }
    

    @FXML 
    private void start(ActionEvent event) throws IOException
    {
        newWindow(); 
       // Window stage = start.getScene().getWindow();
        //stage.hide();  
    }
    
    @FXML 
    private void documentation(ActionEvent event) throws IOException
    {
        newMaladie(); 
        //Window stage = start.getScene().getWindow();
        //stage.hide();  
    }
    

    
     @FXML private javafx.scene.control.Button closeButton;

    @FXML
    private void closeButtonAction(){
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }     
    
}
