package model;

/**
 * Created by RoyH- on 08-6-2018.
 */

public class Person {
    int  leeftijd;
    double gewicht;
    double lengte;
    Geslacht geslacht;

    public Person(double gewicht, double lengte, Geslacht geslacht, int leeftijd) {
        this.gewicht = gewicht;
        this.lengte = lengte;
        this.geslacht = geslacht;
        this.leeftijd = leeftijd;
    }

    public double getGewicht() {
        return gewicht;
    }

    public double getLengte() {
        return lengte;
    }

    public Geslacht getGeslacht() {
        return geslacht;
    }

    public int getLeeftijd() {
        return leeftijd;
    }
}
