package restservice;

/**
 * Created by Roy on 23-6-2017.
 */
public class BMI {
    double bmi;

    public double getBmi(double leeftijd, double gewicht){
        bmi = leeftijd * gewicht;
        return bmi;
    }

}
