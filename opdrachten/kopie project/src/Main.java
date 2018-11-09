import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static double saldo = 3.00;
    public static double costs;
    public static ArrayList<String> Drank = new ArrayList<>();
    public static ArrayList<String> Drankantw = new ArrayList<>();
    public static ArrayList<String> WarmEten = new ArrayList<>();
    public static ArrayList<String> WarmEtenantw = new ArrayList<>();
    public static ArrayList<String> KoudEten = new ArrayList<>();
    public static ArrayList<String> KoudEtenantwoord = new ArrayList<>();


    public static void main(String[] args) {

        //array voor de frisdranken//
        Drank.add("Coca Cola");//0
        Drank.add("Fanta");//1
        Drank.add("Sprite");//2
        Drank.add("7-Up");//3
        Drank.add("Mountain Due");//4

        Drankantw.add("1.Coca Cola €1.50");//0
        Drankantw.add("2.Fanta €1.50");//1
        Drankantw.add("3.Sprite €1.00");//2
        Drankantw.add("4.7-Up €1.00");//3
        Drankantw.add("5.Mountain Due €1.25");//4

        //Array's voor het eten//
        WarmEten.add("Pannenkoeken");//0
        WarmEten.add("Hamburger");//1
        WarmEten.add("Patat");//2

        WarmEtenantw.add("1.Pannenkoeken €2.50");//0
        WarmEtenantw.add("2.Hamburger €2.50");//1
        WarmEtenantw.add("3.Patat €1.50");//2

        KoudEten.add("Salade");//0
        KoudEten.add("Sandwich");//1
        KoudEten.add("Seizoenen bord");//2

        KoudEtenantwoord.add("1.Salade €2.00");//0
        KoudEtenantwoord.add("2.Sandwich €2.50");//1
        KoudEtenantwoord.add("3.Seizoenen bord €3.00");//2
        ietsmain();
    }
    public static void ietsmain() {
        Scanner scanner = new Scanner(System.in);


        ietsEerder();
    }

    public static void ietsEerder(){
        System.out.println("Uw saldo is: €" + saldo);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wilt u wat te eten?");
        String choice111 = scanner.next();
        switch (choice111){
            case "ja":
                Eten();

            case "nee":
                iets();
        }
    }

    public static void Eten(){
        System.out.println("Uw saldo is: €" + saldo);
        System.out.println("Wit u iets warm eten?");
        Scanner scanner = new Scanner(System.in);
        String Eten1 = scanner.next();

        switch (Eten1) {
            case "ja":
                Warm1();
            case "nee":
                Koud1();

        }
    }


    public static void Warm1(){

        System.out.println("Uw saldo is: €" + saldo);
        System.out.println("Maak een keuze:");
        for (String HHH : WarmEtenantw){
            System.out.println(HHH);
        }
        EtenAntw();

    }

    public static void EtenAntw() {
        Scanner scanner = new Scanner(System.in);
        String ChoiceEten = scanner.next();
        switch (ChoiceEten) {
            case "1":
                costs = 2.50;
                saldo = saldo - costs;
                if (saldo < 0.00 && saldo > -10.00) {
                    System.out.println("Niet genoeg saldo. Aankoop geannuleerd.");
                }
                //else statements
                else {
                    System.out.println("Oke, hier is uw " + WarmEten.get(0));
                    System.out.println("Uw saldo is nu: €" + (saldo));
                    System.out.println("Was dat alles?");

                    iets6();
                }
                break;

            case "2":
                costs = 2.50;
                saldo = saldo - costs;
                if (saldo < 0.00 && saldo > -10.00) {
                    System.out.println("Niet genoeg saldo. Aankoop geannuleerd.");
                }
                //else statements
                else {
                    System.out.println("Oke, hier is uw " + WarmEten.get(1));
                    System.out.println("Uw saldo is nu: €" + (saldo));
                    System.out.println("Was dat alles?");

                    iets6();
                }
                break;
            case "3":
                costs = 1.50;
                saldo = saldo - costs;
                if (saldo < 0.00 && saldo > -10.00) {
                    System.out.println("Niet genoeg saldo. Aankoop geannuleerd.");
                }
                //else statements
                else {
                    System.out.println("Oke, hier is uw " + WarmEten.get(2));
                    System.out.println("Uw saldo is nu: €" + (saldo));
                    System.out.println("Was dat alles?");

                    iets6();
                }
                break;
        }
    }

    public static void Koud1(){
        System.out.println("Uw saldo is: €" + saldo);
        System.out.println("Maak een keuze:");
        for (String H3 : KoudEtenantwoord){
            System.out.println(H3);
        }
        KoudetenAntw();
    }

    public static void KoudetenAntw() {
        Scanner scanner = new Scanner(System.in);

        String KoudEEten = scanner.next();
        switch (KoudEEten) {
            case "1":
                costs = 2.00;
                saldo = saldo - costs;
                if (saldo < 0.00 && saldo > -10.00) {
                    System.out.println("Niet genoeg saldo. Aankoop geannuleerd.");
                }
                //else statements
                else {
                    System.out.println("Oke, hier is uw " + KoudEten.get(0));
                    System.out.println("Uw saldo is nu: €" + (saldo));
                    System.out.println("Was dat alles?");

                    iets6();
                }
                break;

            case "2":
                costs = 2.50;
                saldo = saldo - costs;
                if (saldo < 0.00 && saldo > -10.00) {
                    System.out.println("Niet genoeg saldo. Aankoop geannuleerd.");
                }
                //else statements
                else {
                    System.out.println("Oke, hier is uw " + KoudEten.get(1));
                    System.out.println("Uw saldo is nu: €" + (saldo));
                    System.out.println("Was dat alles?");

                    iets6();
                }
                break;

            case "3":
                costs = 3.00;
                saldo = saldo - costs;
                if (saldo < 0.00 && saldo > -10.00) {
                    System.out.println("Niet genoeg saldo. Aankoop geannuleerd.");
                }
                //else statements
                else {
                    System.out.println("Oke, hier is uw " + KoudEten.get(2));
                    System.out.println("Uw saldo is nu: €" + (saldo));
                    System.out.println("Was dat alles?");

                    iets6();
                }
                break;
        }
    }
    public static void iets() {


        //eerste vraag//
        System.out.println("Uw saldo is: €" + saldo);
        System.out.println("Wat wilt u te drinken?");
        System.out.println("Wilt u frisdrank?");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        //choice 1
        switch (choice) {
            case "ja":
                System.out.println("Oke!");
                System.out.println("Maak een keuze:");
                for (String H1:Drankantw){
                    System.out.println(H1);
                }
                //refereerd naar 2e choice
                iets2();
                break;

            case "nee":
                System.out.println("Warm?");

                iets3(); // refereerd naar de 3e choice
                break;
        }
    }
    public static void iets2() {


        Scanner scanner = new Scanner(System.in);
        String choice2 = scanner.next();
        //choice 2 en antwoorden choice 1
        switch (choice2) {

            case "1":
                costs = 1.50;
                saldo = saldo - costs;
                if (saldo <= -0.01 && saldo > -10.00) {
                    System.out.println("Niet genoeg saldo. Aankoop geannuleerd.");
                }
                //else statements
                else {
                    System.out.println("Oke, hier is uw " + Drank.get(0));
                    System.out.println("Uw saldo is nu: €" + (saldo));
                    System.out.println("Was dat alles?");

                    iets6();
                }
                break;

            case "2":
                costs = 1.50;
                saldo = saldo - costs;
                System.out.println(saldo);
                if (saldo <= -0.01 && saldo > -10.00) {
                    System.out.println("Niet genoeg saldo. Aankoop geannuleerd.");
                    break;
                } else{
                    System.out.println("Oke, hier is uw " + Drank.get(1));
                    System.out.println("Uw saldo is nu: €" + (saldo));
                    System.out.println("Was dat alles?");


                    iets6();
                }
                break;

            case "3":
                costs = 1.00;
                saldo = saldo - costs;
                if (saldo <= -0.01 && saldo > -10.00) {
                    System.out.println("Niet genoeg saldo. Aankoop geannuleerd.");
                } else{
                    System.out.println("Oke, hier is uw " + Drank.get(2));
                    System.out.println("Uw saldo is nu: €" + (saldo));
                    System.out.println("Was dat alles?");


                    iets6();
                }
                break;

            case "4":
                costs = 1.00;
                saldo = saldo - costs;
                if (saldo <= -0.01 && saldo > -10.00) {
                    System.out.println("Niet genoeg saldo. Aankoop geannuleerd.");
                    System.exit(0);
                } else{
                    System.out.println("Oke, hier is uw " + Drank.get(3));
                    System.out.println("Uw saldo is nu: €" + (saldo));
                    System.out.println("Was dat alles?");


                    iets6();
                }
                break;

            case "5":
                costs = 1.25;
                saldo = saldo - costs;
                if (saldo <= -0.01 && saldo > -10.00) {
                    System.out.println("Niet genoeg saldo. Aankoop geannuleerd.");
                } else{
                    System.out.println("Oke, hier is uw " + Drank.get(4));
                    System.out.println("Uw saldo is nu: €" + (saldo));
                    System.out.println("Was dat alles?");


                    iets6();
                }
                break;


        }
    }
    public static void iets3(){}
    public static void iets6(){}

}