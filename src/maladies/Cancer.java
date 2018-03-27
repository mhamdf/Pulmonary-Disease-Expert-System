package maladies;

public class Cancer {
    private static double numSymptomes = 0;
    public static double getSymptomes()
    {
        return Cancer.numSymptomes;
    }
    public static void setSymptomes(double rate)
    {
        Cancer.numSymptomes = rate + numSymptomes;
    }
}
