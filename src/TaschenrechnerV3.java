import java.io.IOException;
import java.util.*;
import java.lang.ArithmeticException;
@SuppressWarnings("unused")
public class TaschenrechnerV3 extends MathCore
{

    //private static final String String = null;

    public static void main(String[] argv)throws IOException, InterruptedException, ArithmeticException
    {
        //Variablen innitiren
        double zahl1 = 0;
        double zahl2 =0;
        int zahl_i1,zahl_i2;
        double ergebnis = 0;
        int auswahl;


        do {
            //Gui R1 = new Gui( "Thread-1");
            //R1.start();
            System.out.print("\r\n" +
                    "\r\n" +
                    " ___                 _                        \r\n" +
                    "|  _`\\              ( )                       \r\n" +
                    "| (_) )   __     ___| |__    ___     __  _ __ \r\n" +
                    "| ,  /  /'__`\\ /'___)  _ `\\/' _ `\\ /'__`( '__)\r\n" +
                    "| |\\ \\ (  ___/( (___| | | || ( ) |(  ___/ |   \r\n" +
                    "(_) (_)`\\____)`\\____|_) (_)(_) (_)`\\____|_)   \r\n" +
                    "                                              \r\n" +
                    "                                              \r\n" +
                    "\r\n" +
                    "");
            Scanner input = new Scanner(System.in);
            /* Rechenmoglichkeit    Hauptmenue */
            System.out.print("\n");
            System.out.print("-----------------------------------------------\n");
            System.out.print("1.  Addition\n");
            System.out.print("2.  Subtraktion\n");
            System.out.print("3.  Multiplikation\n");
            System.out.print("4.  Division\n");
            System.out.print("5.  Wurzel\n");
            System.out.print("6.  Hochzahl\n");
            System.out.print("10. Algebra\n");
            System.out.print("9.  Exit\n");
            System.out.print("-----------------------------------------------\n\n");
            System.out.print("Enter Your Choice :  ");
            auswahl = input.nextInt();

            //input.close();


            //leitet den Wert an die Berechnungsfunktion weiter
            berechnung(auswahl,ergebnis,zahl1,zahl2, input);
            //input.close();
        }while (auswahl !=9);



        //System.out.print("\n\n\n\n\n\n\n");
        //System.out.print("Exiting......");
        //System.out.print("\n-----------------------------------------------\n");
        System.exit(0);



        //IDEE: https://www.java-tutorial.org/jcombobox.html
        //https://stackoverflow.com/questions/3059333/validating-input-using-java-util-scanner

        /*System.gc();
         System.exit(0);
          @return **/
    }//ende Main

    public static void berechnung(int auswahl, double ergebnis, double zahl1, double zahl2, Scanner input) throws InterruptedException, ArithmeticException, IOException
    {

        switch (auswahl)
        {
            case 1: //addition

                addition(zahl1, zahl2, ergebnis, input);
                Thread.sleep(3000);
                ack();
                break;
            case 2:	//substraktion

                substraktion(zahl1, zahl2, ergebnis, input);
                Thread.sleep(3000);
                ack();
                break;
            case 3:	//Multiplikation

                multiplikation(zahl1,zahl2,ergebnis, input);
                Thread.sleep(3000);
                ack();
                break;
            case 4:	//Division

                division(zahl1,zahl2,ergebnis, input);
                Thread.sleep(3000);
                ack();
                break;
            case 5:
                MathCore.wurzelFunk(zahl1, ergebnis, input);
                Thread.sleep(3000);
                ack();
                break;
            case 6:
                System.out.print("\n");
                pow(zahl1,zahl2,ergebnis, input);
                Thread.sleep(3000);
                ack();
                break;
            case 10:







                break;
            case 11:
                System.out.print("\n");
                System.out.println("*                                         *");
                System.out.println("*                                         *");
                System.out.println("*            Experimental                 *");
                System.out.println("*                                         *");
                System.out.println("               (╯°□°)╯︵ ┻━┻ ︵ ╯(°□° ╯)          ");
                System.out.println("*                                         *");
                System.out.println("*                                         *");

                MathCore.random(input);
                Thread.sleep(3000);
                ack();
                break;
            case 9:
                exit();
                break;
            default: System.out.println("\n Ouuuups!!\n\n Nothing to see here.... well exept dinosaurs\n");
                unknwFunk();
                Thread.sleep(3000);
        }//Ende Switch

    }

//Recheninstruktionen

    private static void unknwFunk() throws InterruptedException

    {
        System.out.print("           boing         boing         boing              \r\n" +
                " e-e           . - .         . - .         . - .          \r\n" +
                "(\\_/)\\       '       `.   ,'       `.   ,'       .        \r\n" +
                " `-'\\ `--.___,         . .           . .          .       \r\n" +
                "    '\\( ,_.-'                                             \r\n" +
                "       \\\\               \"             \"            a:f    \r\n" +
                "       ^'");
        System.out.print("\n\n\n\n\n");
        Thread.sleep(3000);
        System.out.print("");
        System.out.flush();
    }


    public static void ack() throws IOException
    {
        System.out.println("\n");
        System.out.println("Zum Fortfahren [ENTER] drücken");
        System.in.read();


    }
    private static void exit()
    {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("               (╯°□°)╯︵ ┻━┻ ︵ ╯(°□° ╯)          ");
        System.out.print("            ╔════════════════════════════╗\r\n" +
                "\r\n" +
                "             Created by Michal Sznurczak\r\n" +
                "\r\n" +
                "            ╚════════════════════════════╝");
        System.out.print("\r\n\n Exiting......\n");
        System.out.print("\n-----------------------------------------------\n");
    }

}//ProgrammEnde