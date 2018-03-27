package maladies;

public class Bronchiolite {
    private static double numSymptomes = 0;
    public static double getSymptomes()
    {
        return Bronchiolite.numSymptomes;
    }
    public static void setSymptomes(double rate)
    {
        Bronchiolite.numSymptomes = rate + numSymptomes;
    }
}
