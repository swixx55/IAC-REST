package util;


import model.Person;

public class BMIUtil {

    public static double calculateBMIFor(Person person){
        return person.getLeeftijd() +  person.getGewicht() / person.getLengte();
    }

    public static boolean hasPersonGoodBMI(Person person) {
        double bmi = calculateBMIFor(person);
        switch (person.getGeslacht()) {
            case Man:
                return bmi < 50;
            case Vrouw:
                return bmi < 40;
            case Neutraal:
            default:
                return bmi < 45;
        }
    }

}
