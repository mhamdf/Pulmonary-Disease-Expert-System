package couplage;

import maladies.*;
import org.jpl7.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class couple {
    public static LinkedList<String> selection;
    
    public static void requete(Query q, double rate)
    {
        java.util.Map<String, Term>[] solution;
        solution = q.allSolutions();
        for(Map<String, Term> terme : solution )
        {
            Iterator iter = terme.keySet().iterator();
            while(iter.hasNext())
            {
                Object key = iter.next();
                System.out.println(terme.get(key).toString());
                selectionnerMaladie(terme.get(key).toString(),rate);
            }
        }
     }
    
    public static void selectionnerMaladie(String maladie,double rate)
    {
        if(maladie.equals("tuberculose")) {maladies.Tuberculose.setSymptomes(rate);}
        if(maladie.equals("pneumonie")) {maladies.Pneumonie.setSymptomes(rate);}
        if(maladie.equals("byssinose")) {maladies.Byssinose.setSymptomes(rate);}
        if(maladie.equals("coqueluche")) {maladies.Coqueluche.setSymptomes(rate);}
        if(maladie.equals("pneumoconiose")) {maladies.Pneumoconiose.setSymptomes(rate);}
        if(maladie.equals("sarcoidose")) {maladies.Sarcoidose.setSymptomes(rate);}
        if(maladie.equals("asbestose")) {maladies.Asbestose.setSymptomes(rate);}
        if(maladie.equals("asthme")) {maladies.Asthme.setSymptomes(rate);}
        if(maladie.equals("bronchiolite")) {maladies.Bronchiolite.setSymptomes(rate);}
        if(maladie.equals("grippe")) {maladies.Grippe.setSymptomes(rate);}
        if(maladie.equals("cancer")) {maladies.Cancer.setSymptomes(rate);}
    }
    public static boolean noAnswer()
    {
        return (Tuberculose.getSymptomes() == 0) && ( Pneumonie.getSymptomes() == 0 ) && ( Byssinose.getSymptomes() == 0) 
                && (Coqueluche.getSymptomes() == 0) && ( Pneumoconiose.getSymptomes() == 0 ) && ( Sarcoidose.getSymptomes() == 0)
                && (Asbestose.getSymptomes() == 0) && ( Asthme.getSymptomes() == 0 ) && ( Bronchiolite.getSymptomes() == 0)
                && (Grippe.getSymptomes() == 0) && (Cancer.getSymptomes() == 0);
    }
    public static String rates()
    {   
        double tuberculose = Tuberculose.getSymptomes();
        double pneumonie = Pneumonie.getSymptomes();
        double byssinose = Byssinose.getSymptomes();
        double cqueluche = Coqueluche.getSymptomes();
        double pneumoconiose = Pneumoconiose.getSymptomes();
        double sarcoidose = Sarcoidose.getSymptomes();
        double asbestose = Asbestose.getSymptomes();
        double asthme = Asthme.getSymptomes();
        double bronchiolite = Bronchiolite.getSymptomes();
        double grippe = Grippe.getSymptomes();
        double cancer = Cancer.getSymptomes();
        
        double pourt = tuberculose*100 - ((10%Math.random()+1));
        String a = String.format("%.2f", pourt);
        
        double pourp = pneumonie*100 -((10%Math.random()+1));
        String b = String.format("%.2f", pourp);
        
        double pourby = byssinose*100 - ((10%Math.random()+1));
        String c = String.format("%.2f", pourby);
        
        double pourpn = pneumoconiose*100 - ((10%Math.random()+1));
        String d = String.format("%.2f", pourpn);
        
        double pourcq = cqueluche*100 -((10%Math.random()+1));
        String e = String.format("%.2f", pourcq);
        
        double pours = sarcoidose*100 - ((10%Math.random()+1));
        String f = String.format("%.2f", pours);
        
        double pourasb = asbestose*100 - ((10%Math.random()+1));
        String g = String.format("%.2f", pourasb);
        
        double pourast = asthme*100 -((10%Math.random()+1));
        String h = String.format("%.2f", pourast);
        
        double pourbr = bronchiolite*100 - ((10%Math.random()+1));
        String i = String.format("%.2f", pourbr);
        
        double pourg = grippe*100 -((10%Math.random()+1));
        String j = String.format("%.2f", pourg);
        
        double pourc = cancer*100 - ((10%Math.random()+1));
        String k = String.format("%.2f", pourc);
        
        
        System.out.println("tuberculose  "+pourt+"\n"+"pneumonie  "+pourp+"\n"+"byssinose  "+pourby+"\n"+ "pneumoconiose  "+pourpn+"\n"+"cqueluche  "
        +pourcq+"\n"+"sarcoidose  "+pours+"\n" +"asbestose  "+pourasb+"\n"+"asthme  "+pourast+"\n"+"bronchiolite  "+pourbr+"\n" +"grippe  "+pourg+"\n"+"cancer  "+pourc +"\n");
        String pour = moreRated();
        if(pour == "tuberculose")
        { 
            return "La probalibilité est :  "+ a +" %";
        } 
        else 
            if(pour == "pneumonie")
        { 
            return "La probalibilité est :  "+ b +" %";
        } 
        else
        if(pour == "byssinose")
        { 
            return "La probalibilité est :  "+ c +" %";
        } 
        else 
            if(pour == "pneumoconiose")
        { 
            return "La probalibilité est :  "+ d +" %";
        } 
        else
        if(pour == "cqueluche")
        { 
            return "La probalibilité est :  "+ e +" %";
        } 
        else 
            if(pour == "sarcoidose")
        { 
            return "La probalibilité est :  "+ f +" %";
        }
        else 
            if(pour == "asbestose")
        { 
            return "La probalibilité est :  "+ g +" %";
        }
        else 
         if(pour == "asthme")
        { 
            return "La probalibilité est :  "+ h +" %";
        } 
        else
        if(pour == "bronchiolite")
        { 
            return "La probalibilité est :  "+ i +" %";
        } 
        else 
            if(pour == "grippe")
        { 
            return "La probalibilité est :  "+ j +" %";
        }
        else
        { 
            return "La probalibilité est :  "+ k +" %";
        } 
         
    }
    public static String moreRated()
    {
        double tuberculose = Tuberculose.getSymptomes();
        double pneumonie = Pneumonie.getSymptomes();
        double byssinose = Byssinose.getSymptomes();
        double cqueluche = Coqueluche.getSymptomes();
        double pneumoconiose = Pneumoconiose.getSymptomes();
        double sarcoidose = Sarcoidose.getSymptomes();
        double asbestose = Asbestose.getSymptomes();
        double asthme = Asthme.getSymptomes();
        double bronchiolite = Bronchiolite.getSymptomes();
        double grippe = Grippe.getSymptomes();
        double cancer = Cancer.getSymptomes();
        
        if(tuberculose > pneumonie && tuberculose > byssinose && tuberculose > cqueluche
                && tuberculose > pneumoconiose && tuberculose > sarcoidose && tuberculose > asbestose
                && tuberculose > asthme && tuberculose > bronchiolite && tuberculose > grippe
                && tuberculose > cancer)
            return "tuberculose";
        else if(pneumonie > tuberculose && pneumonie > byssinose && pneumonie > cqueluche
                && pneumonie > pneumoconiose && pneumonie > sarcoidose && pneumonie > asbestose
                && pneumonie > asthme && pneumonie > bronchiolite && pneumonie > grippe
                && pneumonie > cancer)
            return "pneumonie";
        else if(byssinose > pneumonie && byssinose > tuberculose && byssinose > cqueluche
                && byssinose > pneumoconiose && byssinose > sarcoidose && byssinose > asbestose
                && byssinose > asthme && byssinose > bronchiolite && byssinose > grippe
                && byssinose > cancer)
            return "byssinose"; 
        else if(cqueluche > pneumonie && cqueluche > byssinose && cqueluche > tuberculose
                && cqueluche > pneumoconiose && cqueluche > sarcoidose && cqueluche > asbestose
                && cqueluche > asthme && cqueluche > bronchiolite && cqueluche > grippe
                && cqueluche > cancer)
            return "cqueluche"; 
        else if(pneumoconiose > pneumonie && pneumoconiose > byssinose && pneumoconiose > cqueluche
                && pneumoconiose > tuberculose && pneumoconiose > sarcoidose && pneumoconiose > asbestose
                && pneumoconiose > asthme && pneumoconiose > bronchiolite && pneumoconiose > grippe
                && pneumoconiose > cancer)
            return "pneumoconiose"; 
        else if(sarcoidose > pneumonie && sarcoidose > byssinose && sarcoidose > cqueluche
                && sarcoidose > pneumoconiose && sarcoidose > tuberculose && sarcoidose > asbestose
                && sarcoidose > asthme && sarcoidose > bronchiolite && sarcoidose > grippe
                && sarcoidose > cancer)
            return "sarcoidose"; 
        else if(asbestose > pneumonie && asbestose > byssinose && asbestose > cqueluche
                && asbestose > pneumoconiose && asbestose > sarcoidose && asbestose > tuberculose
                && asbestose > asthme && asbestose > bronchiolite && asbestose > grippe
                && asbestose > cancer)
            return "asbestose"; 
        else if(asthme > pneumonie && asthme > byssinose && asthme > cqueluche
                && asthme > pneumoconiose && asthme > sarcoidose && asthme > asbestose
                && asthme > tuberculose && asthme > bronchiolite && asthme > grippe
                && asthme > cancer)
            return "asthme"; 
        else if(bronchiolite > pneumonie && bronchiolite > byssinose && bronchiolite > cqueluche
                && bronchiolite > pneumoconiose && bronchiolite > sarcoidose && bronchiolite > asbestose
                && bronchiolite > asthme && bronchiolite > tuberculose && bronchiolite > grippe
                && bronchiolite > cancer)
            return "bronchiolite"; 
        else if(grippe > pneumonie && grippe > byssinose && grippe > cqueluche
                && grippe > pneumoconiose && grippe > sarcoidose && grippe > asbestose
                && grippe > asthme && grippe > bronchiolite && grippe > tuberculose
                && grippe > cancer)
            return "grippe"; 
        else 
            return "cancer"; 
    }     
    public static LinkedList<String> selected()
    {
        return selection;
    }

}
