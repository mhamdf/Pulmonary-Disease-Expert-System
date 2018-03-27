/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maladies;

/**
 *
 * @author Cálcifer
 */
public class Pneumonie {
    private static double Symptomes;
    public static double getSymptomes()
    {
        return Pneumonie.Symptomes;
    }
    public static void setSymptomes(double rate)
    {
        Pneumonie.Symptomes = Symptomes + rate;
    }
}
