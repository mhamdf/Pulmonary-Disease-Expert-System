package maladies;

public class Grippe {
    private static double numSymptomes = 0;
    public static double getSymptomes()
    {
        return Grippe.numSymptomes;
    }
    public static void setSymptomes(double rate)
    {
        Grippe.numSymptomes = rate + numSymptomes;
    }
}
