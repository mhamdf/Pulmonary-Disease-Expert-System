/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maladie.pulmonaire;

import couplage.couple;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hamou
 */
public class FXMLResController implements Initializable {



    @FXML   
    private Label maladie;
    @FXML   
    private Text description;
    @FXML   
    private Label pourcentage;
    
    public void ponerImagen()
    {
       String aux = couplage.couple.moreRated();
       if(aux.equals("tuberculose")){
         // CampoImagen.setImage(imagenZika);
          description.setText("La tuberculose est une maladie contagieuse qui s’attaque habituellement aux poumons, mais parfois aussi à d’autres parties du corps, comme les reins, les ganglions et les os. Autrefois, la tuberculose était souvent mortelle et on lui donnait le nom de « consomption ».");
          
          pourcentage.setText(couple.rates());
          maladie.setText("La tuberculose");
       }
       if(aux.equals("pneumonie")){
          //CampoImagen.setImage(imagenDengue);
          description.setText("La pneumonie est une inflammation des poumons habituellement causée par une infection. Les pneumonies peuvent également être provoquées par l'inhalation d'irritants comme les vomissures, des liquides ou des produits chimiques.");
          pourcentage.setText(couple.rates());
          maladie.setText("La Pneumonie");
       }
       
       if(aux.equals("byssinose")){
          //CampoImagen.setImage(imagenChikun);
          pourcentage.setText(couple.rates());
          description.setText("a byssinose est une forme d'hyperréactivité bronchique et des voies respiratoires caractérisée par une bronchoconstriction chez les travailleurs travaillant le coton, le chanvre et le lin. L'agent étiologique est une endotoxine bactérienne présente dans la poussière de coton.");
          maladie.setText("La Byssinose");
       }
       if(aux.equals("coqueluche")){
          //CampoImagen.setImage(imagenChikun);
          pourcentage.setText(couple.rates());
          description.setText("La coqueluche est une maladie respiratoire due à une bactérie appelée Bordetella Pertussis. Très contagieuse pour les personnes non immunisées, la coqueluche peut être grave chez les nourrissons et les personnes fragiles.");
          maladie.setText("Cqueluche");
       }
       if(aux.equals("pneumoconiose")){
          //CampoImagen.setImage(imagenChikun);
          pourcentage.setText(couple.rates());
          description.setText("Les pneumoconioses sont des affections pulmonaires liées à l’inhalation de poussières minérales de l’environnement.\n" +
        "La pneumoconiose est la deuxième cause de maladie professionnelle reconnue. C'est l'inhalation de poussières minérales ou inorganiques au cours de l'exposition professionnelle qui en est responsable .");
          maladie.setText("La Pneumoconiose");
       }
       if(aux.equals("sarcoidose")){
          //CampoImagen.setImage(imagenChikun);
          pourcentage.setText(couple.rates());
          description.setText("La sarcoïdose est une maladie inflammatoire qui provoque la formation d’amas de cellules dans les organes, préférentiellement dans les poumons. Elle est aussi désignée comme la maladie de Besnier-Boeck-Schaumann ou par l’acronyme BBS.");
          maladie.setText("La Sarcoidose");
       }
       if(aux.equals("asbestose")){
          //CampoImagen.setImage(imagenChikun);
          pourcentage.setText(couple.rates());
          description.setText("L'asbestose, une affection pulmonaire grave, touche les personnes qui ont inhalé de la poussière d'amiante. Après l'inhalation de cette poussière, les fibres d'amiante microscopiques se déposent dans les poumons où elles peuvent causer des lésions permanentes, en plus de symptômes respiratoires chroniques.");
          maladie.setText("Asbestos");
       }
       if(aux.equals("asthme")){
          //CampoImagen.setImage(imagenChikun);
          pourcentage.setText(couple.rates());
          description.setText("L'asthme est une maladie inflammatoire des bronches. Il s'agit d'une maladie chronique qui apparaît par crises au cours desquelles la personne éprouve des difficultés à respirer, s'essouffle, et a une respiration sifflante. Entre deux crises, la respiration est normale chez la plupart des asthmatiques.");
          maladie.setText("Asthme");
       }
       if(aux.equals("bronchiolite")){
          //CampoImagen.setImage(imagenChikun);
          pourcentage.setText(couple.rates());
          description.setText("La bronchiolite est une maladie virale très contagieuse qui touche, chaque hiver, environ 30 % des nourrissons avant 2 ans, la moitié des enfants contaminés ayant moins de 6 mois. Les garçons représentent environ 60 % des bébés atteints de bronchiolite. Il s’agit d’une inflammation aiguë des bronchioles (petites bronches), qui évolue souvent vers une détresse respiratoire.\n" +
            "Le virus respiratoire syncitial (VRS) est le principal agent infectieux de cette maladie.");
          maladie.setText("Bronchiolite");
       }
       if(aux.equals("grippe")){
          //CampoImagen.setImage(imagenChikun);
          pourcentage.setText(couple.rates());
          description.setText("La grippe, ou influenza, est une maladie due à des virus influenzae de la famille des Orthomyxoviridae, virus à ARN. Maladie contagieuse, a grippe touche tout d’abord le système respiratoire et  peut se compliquer ou présenter des formes graves.");
          maladie.setText("La Grippe");
       }
       if(aux.equals("cancer")){
          //CampoImagen.setImage(imagenChikun);
          pourcentage.setText(couple.rates());
          description.setText("Le cancer du poumon prend naissance dans les cellules du poumon. La tumeur cancéreuse (maligne) est un groupe de cellules cancéreuses qui peuvent envahir et détruire le tissu voisin. Elle peut aussi se propager (métastases) à d’autres parties du corps. Quand le cancer débute dans les cellules du poumon, il est appelé cancer primitif du poumon.");
          maladie.setText("Cancer des poumons");
       }
       
    }
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ponerImagen();
        
    }   
    
    @FXML private javafx.scene.control.Button closeButton;

    @FXML
    private void closeButtonAction(){
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
    
 
}
