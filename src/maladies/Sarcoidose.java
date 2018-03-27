package maladies;

public class Sarcoidose {
    private static double numSymptomes = 0;
    public static double getSymptomes()
    {
        return Sarcoidose.numSymptomes;
    }
    public static void setSymptomes(double rate)
    {
        Sarcoidose.numSymptomes = rate + numSymptomes;
    }
}
