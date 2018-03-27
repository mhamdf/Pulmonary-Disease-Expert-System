/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maladie.pulmonaire;

import couplage.couple;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.jpl7.Query;

/**
 * FXML Controller class
 *
 * @author hamou
 */
public class FXMLMaladieController implements Initializable {

    @FXML private RadioButton buttonPdp;
    @FXML private RadioButton buttonMp;
    @FXML private RadioButton buttonToux;
    @FXML private RadioButton buttonTouxp;
    @FXML private RadioButton buttonTs;
    @FXML private RadioButton buttonFrissons;
    @FXML private RadioButton buttonEssoufflement;
    @FXML private RadioButton buttonNc;
    @FXML private RadioButton buttonLf;
    @FXML private RadioButton buttonFc;
    @FXML private RadioButton buttonRs;
    @FXML private RadioButton buttonOt;
    @FXML private RadioButton buttonPb;
    @FXML private RadioButton buttonTouxs;
    
    
    @FXML private RadioButton buttonDtl;
    @FXML private RadioButton buttonTse;
    @FXML private RadioButton buttonTc;
    @FXML private RadioButton buttonBrsj;
    @FXML private RadioButton buttonRr;
    @FXML private RadioButton buttonMt;  
    @FXML private RadioButton buttonSn;
    @FXML private RadioButton buttonDt;
    @FXML private RadioButton buttonCg;
    @FXML private RadioButton buttonYi;
    @FXML private RadioButton buttonEs;
    @FXML private RadioButton buttonF;
    @FXML private RadioButton buttonCn;
    @FXML private RadioButton buttonGi;
    @FXML private RadioButton buttonE;
    @FXML private Button suivant;
    public LinkedList<String> selection = new LinkedList<String>();
    
    
    @FXML private void sendAction(ActionEvent event){
        if(buttonPdp.isSelected())
        {
            String t4 = "symptome(perte_de_poids,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);      
            System.out.println(couple.rates());
        }
        if(!buttonPdp.isSelected())
        {
            String t4 = "symptome(perte_de_poids,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);     
            System.out.println(couple.rates());
        }
    };
    
    @FXML private void sendAction2(ActionEvent event){
        if(buttonMp.isSelected())
        {
            String t4 = "symptome(manque_dappetit,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);      
            System.out.println(couple.rates());
            
        }
        if(!buttonMp.isSelected())
        {
            String t4 = "symptome(manque_dappetit,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    };  
    
    @FXML private void sendAction3(ActionEvent event){
        if(buttonToux.isSelected())
        {
            String t4 = "symptome(toux,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);             
            System.out.println(couple.rates());
        }
        if(!buttonToux.isSelected())
        {
            String t4 = "symptome(toux,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    };
    
    @FXML private void sendAction4(ActionEvent event){
        if(buttonTouxp.isSelected())
        {
            String t4 = "symptome(toux_persistante,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);     
            System.out.println(couple.rates());
        }
        if(!buttonTouxp.isSelected())
        {
            String t4 = "symptome(toux_persistante,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());

        }
    };
    
    @FXML private void sendAction5(ActionEvent event){
        if(buttonTs.isSelected())
        {
            String t4 = "symptome(toux_saigient,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);      
            System.out.println(couple.rates());
          
        }
        if(!buttonTs.isSelected())
        {
            String t4 = "symptome(toux_saigient,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    };
    
    @FXML private void sendAction6(ActionEvent event){
        if(buttonFrissons.isSelected())
        {
            String t4 = "symptome(frissons,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);   
            System.out.println(couple.rates());
            

        }
        if(!buttonFrissons.isSelected())
        {
            String t4 = "symptome(frissons,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());

        }
    };
    
    @FXML private void sendAction7(ActionEvent event){
        if(buttonEssoufflement.isSelected())
        {
            String t4 = "symptome(essoufflement,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);         
            System.out.println(couple.rates());

        }
        if(!buttonEssoufflement.isSelected())
        {
            String t4 = "symptome(essoufflement,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());

        }
    };
    
    @FXML private void sendAction8(ActionEvent event){
        if(buttonNc.isSelected())
        {
            String t4 = "symptome(nez_coulant,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);      
            System.out.println(couple.rates());
 
        }
        if(!buttonNc.isSelected())
        {
            String t4 = "symptome(nez_coulant,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
            

        }
    };
    
    @FXML private void sendAction9(ActionEvent event){
        if(buttonLf.isSelected())
        {
            String t4 = "symptome(legere_fievre,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);      
            System.out.println(couple.rates());

        }
        if(!buttonLf.isSelected())
        {
            String t4 = "symptome(legere_fievre,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());

        }
    };
 
    @FXML private void sendAction10(ActionEvent event){
        if(buttonFc.isSelected())
        {
            String t4 = "symptome(fatigue_constante,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());

        }
        if(!buttonFc.isSelected())
        {
            String t4 = "symptome(fatigue_constante,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
            

        }
    };
    
    @FXML private void sendAction11(ActionEvent event){
        if(buttonRs.isSelected())
        {
            String t4 = "symptome(respiration_sifflante,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());

        }
        if(!buttonRs.isSelected())
        {
            String t4 = "symptome(respiration_sifflante,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
            

        }
    };
 
    @FXML private void sendAction12(ActionEvent event){
        if(buttonOt.isSelected())
        {
            String t4 = "symptome(opression_thoracique,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());

        }
        if(!buttonOt.isSelected())
        {
            String t4 = "symptome(opression_thoracique,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
            

        }
    };

    @FXML private void sendAction13(ActionEvent event){
        if(buttonPb.isSelected())
        {
            String t4 = "symptome(peau_bleue,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonPb.isSelected())
        {
            String t4 = "symptome(peau_bleue,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    };    
    
    @FXML private void sendAction14(ActionEvent event){
        if(buttonTouxs.isSelected())
        {
            String t4 = "symptome(toux_du_sang,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonTouxs.isSelected())
        {
            String t4 = "symptome(toux_du_sang,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    }; 
    
    @FXML private void sendAction15(ActionEvent event){
        if(buttonDtl.isSelected())
        {
            String t4 = "symptome(douleur_thoracique_legere,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonDtl.isSelected())
        {
            String t4 = "symptome(douleur_thoracique_legere,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    }; 

    @FXML private void sendAction16(ActionEvent event){
        if(buttonTse.isSelected())
        {
            String t4 = "symptome(toux_seche,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonTse.isSelected())
        {
            String t4 = "symptome(toux_seche,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    };  
    
    @FXML private void sendAction17(ActionEvent event){
        if(buttonTc.isSelected())
        {
            String t4 = "symptome(toux_chronique,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonTc.isSelected())
        {
            String t4 = "symptome(toux_chronique,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    }; 

    @FXML private void sendAction18(ActionEvent event){
        if(buttonBrsj.isSelected())
        {
            String t4 = "symptome(bosses_rouges_sur_les_jambes,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonBrsj.isSelected())
        {
            String t4 = "symptome(bosses_rouges_sur_les_jambes,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    }; 
 
    @FXML private void sendAction19(ActionEvent event){
        if(buttonRr.isSelected())
        {
            String t4 = "symptome(respiration_rapide,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonRr.isSelected())
        {
            String t4 = "symptome(respiration_rapide,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    }; 

    @FXML private void sendAction20(ActionEvent event){
        if(buttonMt.isSelected())
        {
            String t4 = "symptome(maux_de_tete,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonMt.isSelected())
        {
            String t4 = "symptome(maux_de_tete,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    }; 
    
    @FXML private void sendAction21(ActionEvent event){
        if(buttonSn.isSelected())
        {
            String t4 = "symptome(sueurs_nocturnes,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonSn.isSelected())
        {
            String t4 = "symptome(sueurs_nocturnes,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    }; 

    @FXML private void sendAction22(ActionEvent event){
        if(buttonDt.isSelected())
        {
            String t4 = "symptome(douleur_thoracique,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonDt.isSelected())
        {
            String t4 = "symptome(douleur_thoracique,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    }; 

    @FXML private void sendAction23(ActionEvent event){
        if(buttonCg.isSelected())
        {
            String t4 = "symptome(chevilles_gonflees,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonCg.isSelected())
        {
            String t4 = "symptome(chevilles_gonflees,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    };  

    @FXML private void sendAction24(ActionEvent event){
        if(buttonYi.isSelected())
        {
            String t4 = "symptome(yeux_irrites,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonYi.isSelected())
        {
            String t4 = "symptome(yeux_irrites,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    }; 

    @FXML private void sendAction25(ActionEvent event){
        if(buttonEs.isSelected())
        {
            String t4 = "symptome(eruption_squameuse,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonEs.isSelected())
        {
            String t4 = "symptome(eruption_squameuse,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    }; 

    @FXML private void sendAction26(ActionEvent event){
        if(buttonF.isSelected())
        {
            String t4 = "symptome(fievre,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonF.isSelected())
        {
            String t4 = "symptome(fievre,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    };     

    @FXML private void sendAction27(ActionEvent event){
        if(buttonCn.isSelected())
        {
            String t4 = "symptome(congestion_nasale,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonCn.isSelected())
        {
            String t4 = "symptome(congestion_nasale,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    };     

    @FXML private void sendAction28(ActionEvent event){
        if(buttonGi.isSelected())
        {
            String t4 = "symptome(gorge_irritee,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonGi.isSelected())
        {
            String t4 = "symptome(gorge_irritee,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    };     

    @FXML private void sendAction29(ActionEvent event){
        if(buttonE.isSelected())
        {
            String t4 = "symptome(enrouement,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,0.2);        
            System.out.println(couple.rates());
        }
        if(!buttonE.isSelected())
        {
            String t4 = "symptome(enrouement,X)";
            Query q4 = new Query(t4);
            couple.requete(q4,-0.2);
            System.out.println(couple.rates());
        }
    };  
    
    private void newWindow() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLMaladie1.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Partie 2");
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
        //stage.setResizable(false);
    }
    
    @FXML 
    private void suivant(ActionEvent event) throws IOException
    {
        if(couple.noAnswer()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("Sélectionnez au moins un symptôme");
            alert.showAndWait();    
        }
        else
        {
            couplage.couple.selection = selection;
            newWindow();    
             
        }
    }
    
    
    @FXML 
    private void terminer(ActionEvent event) throws IOException
    {
        if(couple.noAnswer()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("Sélectionnez au moins un symptôme");
            alert.showAndWait();    
        }
        else
        {
            couplage.couple.selection = selection;
            newTermine();    
             
        }
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     @FXML private javafx.scene.control.Button closeButton;

    @FXML
    private void closeButtonAction(){
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

    private void newTermine() throws IOException {
        
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLRes.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Résultat");
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
        //stage.setResizable(false);
        
    }
}
