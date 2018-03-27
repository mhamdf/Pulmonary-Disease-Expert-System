package maladies;

public class Byssinose {
    private static double numSymptomes = 0;
    public static double getSymptomes()
    {
        return Byssinose.numSymptomes;
    }
    public static void setSymptomes(double rate)
    {
        Byssinose.numSymptomes = rate + numSymptomes;
    }
}
