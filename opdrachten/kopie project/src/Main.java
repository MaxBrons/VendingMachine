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

    public static void Eten(){}
    public static void iets(){}

}