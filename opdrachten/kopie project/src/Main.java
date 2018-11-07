import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> WarmEten = new ArrayList<>();
    public static ArrayList<String> WarmEtenantw = new ArrayList<>();
    public static double saldo = 3.00;
    public static double costs;



    public static void main(String[] args) {

        WarmEten.add("Pannenkoeken");//0
        WarmEten.add("Hamburger");//1
        WarmEten.add("Patat");//2

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

    public static void EtenAntw() {}

    public static void Koud1(){}
    public static void iets(){}

}