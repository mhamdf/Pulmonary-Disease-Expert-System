package maladies;

public class Asthme {
    private static double numSymptomes = 0;
    public static double getSymptomes()
    {
        return Asthme.numSymptomes;
    }
    public static void setSymptomes(double rate)
    {
        Asthme.numSymptomes = rate + numSymptomes;
    }
}
