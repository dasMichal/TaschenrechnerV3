import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Thread.sleep;

class MathCore
{


    public static void addition(double zahl1, double zahl2, double ergebnis, Scanner input) {
        System.out.print("Sie haben + gewählt\n");
        System.out.println("Geben Sie die beiden Zahlen getrent duch [ENTER] ein ");
        zahl1 = input.nextDouble();
        System.out.println(" + ");
        zahl2 = input.nextDouble();
        ergebnis = zahl1 + zahl2;
        //int Izahl1 = checkDoub(zahl1);
        //int Izahl2 = checkDoub(zahl2);
        if ((ergebnis % 1) == 0)
        {
         int ergebnisI = (int) ergebnis;
         System.out.print(zahl1+" + "+zahl2+" = "+ergebnisI);
        }
    else {
            //d.intValue();
            System.out.print(zahl1+" + "+zahl2+" = "+ergebnis);
            System.out.print("\n");
            //System.out.println(+zahl1 + " + " + zahl2 + " = " + ergebnis);
        }
    }

    public static void substraktion(double zahl1, double zahl2, double ergebnis, Scanner input) {
        System.out.println("Sie haben - gewählt");
        System.out.println("Geben Sie die beiden Zahlen getrent duch [ENTER] ein ");
        zahl1 = input.nextDouble();
        System.out.println(" - ");
        zahl2 = input.nextDouble();
        ergebnis = zahl1 - zahl2;
        System.out.print("\n");
        System.out.println(+zahl1 + " - " + zahl2 + " = " + ergebnis);

    }

    public static void multiplikation(double zahl1, double zahl2, double ergebnis, Scanner input) {
        System.out.println("Sie haben - gewählt");
        System.out.println("Geben Sie die beiden Zahlen getrent duch [ENTER] ein ");
        zahl1 = input.nextDouble();
        System.out.println(" * ");
        zahl2 = input.nextDouble();
        ergebnis = zahl1 * zahl2;
        System.out.print("\n");
        System.out.println(+zahl1 + " - " + zahl2 + " = " + ergebnis);


    }

    public static void division(double zahl1, double zahl2, double ergebnis, Scanner input) throws NullPointerException, InterruptedException {
        System.out.println("Sie haben / gewählt");
        System.out.print("Geben Sie die erste Zahl ein: ");
        zahl1 = input.nextDouble();
        System.out.print("Geben Sie die zweite Zahl ein: ");
        zahl2 = input.nextDouble();
        System.out.print("\n");
        if (zahl2 == 0)
        {
            //throw new NullPointerException("FOR FUCKS SAKE");
            System.out.println("BITTE NICHT DURCH NULL DIVIDIREN");
            sleep(1000);
            division(zahl1,zahl2,ergebnis, input);
        }
        else {
            ergebnis = zahl1 / zahl2;

            System.out.println(+zahl1 + " / " + zahl2 + " = " + ergebnis);
        }
    }

    public static void wurzelFunk(double zahl1, double ergebnis, Scanner input)throws InterruptedException
    {

        System.out.print("Geben sie die Zahl ein: ");
        zahl1 = input.nextDouble();
        if (zahl1<0) {     //Test auf Negative Zahl
            System.out.println("Die Wurzel kann nur aus positiven Zahlen gebildet werden");
            System.out.println("Geben Sie bitte eine POSITIVE Zahl ein");
            sleep(1000);
            TaschenrechnerV3.wurzelFunk(zahl1, ergebnis, input); //Wenn negative Zahl Gefunden --> Neustart Funktion
        } else {
            ergebnis = Math.sqrt(zahl1);
            System.out.print("\n");
            System.out.println("Die Wurzel von " + zahl1 + " ist " + ergebnis);
            //Math.round(zahl1);
            DecimalFormat formatter = new DecimalFormat("#.##");
            System.out.print("Gerundet: "+formatter.format(ergebnis));
        }
    }

    public static void pow(double zahl1, double zahl2, double ergebnis, Scanner input) {

        System.out.print("Geben sie die Zahl ein:  ");
        zahl1 = input.nextDouble();
        System.out.print("Geben sie den Exponenten an:   ");
        zahl2 = input.nextDouble();
        System.out.print("\n");
        ergebnis = Math.pow(zahl1, zahl2);
        System.out.print(zahl1 + "^" + zahl2 + " = " + ergebnis);
    }

    public static void random(Scanner input) {
        int zahl1, zahl2, ergebnis;
        System.out.print("Geben Sie die erste Zahl ein: ");
        zahl1 = input.nextInt();
        System.out.print("Geben Sie die zweite Zahl ein: ");
        zahl2 = input.nextInt();
        System.out.print("\n");
        ergebnis = ThreadLocalRandom.current().nextInt(zahl1, zahl2 + 1);
        System.out.println(ergebnis);
    }

    public static void poly(double zahl1, double zahl2, double zahl3) {
    }


    /* public static int checkDoub(double d1)
    {
        if ((d1 % 1) == 0)
        {
            AtomicInteger I1 = d1.intValue();

        }
       return I1;
    } **/
}