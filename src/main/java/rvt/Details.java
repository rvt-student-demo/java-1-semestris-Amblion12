package rvt;
import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        // Izveido Scanner objektu, lai nolasītu skrūvu skaitu
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Ievadiet skrūvu skaitu: ");
        String myNum1 = myObj1.nextLine();

        // Izveido Scanner objektu, lai nolasītu uzgriežņu skaitu
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Ievadiet uzgriežņu skaitu: ");
        String myNum2 = myObj2.nextLine();

        // Izveido Scanner objektu, lai nolasītu paplakšņu skaitu
        Scanner myObj3 = new Scanner(System.in);
        System.out.println("Ievadiet paplakšņu skaitu: ");
        String myNum3 = myObj3.nextLine();

        // Konvertē ievadītos datus uz int tipu
        int num1 = Integer.parseInt(myNum1);
        int num2 = Integer.parseInt(myNum2);
        int num3 = Integer.parseInt(myNum3);

        // Pārbauda, kurš no elementiem ir vismazākajā skaitā
        if (num1 < num2 && num1 < num3) {
            System.out.println("Pārbaudi pasūtījumu: par maz skrūvu ");
        }
        else if (num2 < num1 && num2 < num3) {
            System.out.println("Pārbaudi pasūtījumu: par maz uzgrižņu ");
        }
        else if (num3 < num1 && num3 < num2) {
            System.out.println("Pārbaudi pasūtījumu: par maz paplakšņu");
        }

        // Aprēķina kopējo summu pēc dotajām cenām
        int summa = ((num1 * 5) + (num2 * 3) + (num3 * 1));
        System.out.println(summa);

        // Aizver visus Scanner objektus
        myObj1.close();
        myObj2.close();
        myObj3.close();
    }
}
