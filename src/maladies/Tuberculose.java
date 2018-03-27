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
public class Tuberculose {
    private static double Symptomes;
    public static double getSymptomes()
    {
        return Tuberculose.Symptomes;
    }
    public static void setSymptomes(double rate)
    {
        Tuberculose.Symptomes = Symptomes + rate;
    }
}
