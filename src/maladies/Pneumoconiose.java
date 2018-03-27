package maladies;

public class Pneumoconiose {
    private static double numSymptomes = 0;
    public static double getSymptomes()
    {
        return Pneumoconiose.numSymptomes;
    }
    public static void setSymptomes(double rate)
    {
        Pneumoconiose.numSymptomes = rate + numSymptomes;
    }
}
