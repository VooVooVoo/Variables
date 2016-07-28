package it.morfoza.java101;

/**
 * Created by Wojt on 2016-07-28.
 */
public class Conditionals {



    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        int wiek = 16;
        boolean jestWGimbazie = wiek >=13 && wiek <=16;

        if (jestWGimbazie) {
        System.out.println("Jest w gimbazie");
        }
        boolean nieJestWGimbazie = wiek < 13 || wiek > 16;

        if (nieJestWGimbazie) {
            System.out.println("Nie jest w gimbazie");
        }

        boolean JestWLiceum = wiek > 16 && wiek < 20;

        if(wiek > 16 && wiek < 20) {
            System.out.println("Jest w liceum");
        }

        boolean NieJestWLiceum = !JestWLiceum;

        if (NieJestWLiceum) {
            System.out.println("Nie jest w liceum");
        }
    }
}
