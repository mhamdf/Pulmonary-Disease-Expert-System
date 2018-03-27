package maladies;

public class Coqueluche {
    private static double numSymptomes = 0;
    public static double getSymptomes()
    {
        return Coqueluche.numSymptomes;
    }
    public static void setSymptomes(double rate)
    {
        Coqueluche.numSymptomes = rate + numSymptomes;
    }
}
