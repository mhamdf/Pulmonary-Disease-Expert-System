package maladies;

public class Asbestose {
    private static double numSymptomes = 0;
    public static double getSymptomes()
    {
        return Asbestose.numSymptomes;
    }
    public static void setSymptomes(double rate)
    {
        Asbestose.numSymptomes = rate + numSymptomes;
    }
}
