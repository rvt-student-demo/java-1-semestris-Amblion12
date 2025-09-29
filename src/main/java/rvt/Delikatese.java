package rvt;
import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet preci: ");
        String prece = scanner.nextLine();

        System.out.println("Ievadiet cenas vērtību: ");
        int cena = Integer.parseInt(scanner.nextLine());

        int piegade;
        if (cena < 10) {
            piegade = 2;
        } else {
            piegade = 0;
        }

        int summa = cena + piegade;

        System.out.println(prece + ": " + cena);
        System.out.println("Piegāde: " + piegade);
        System.out.println("Kopā: " + summa);

        scanner.close();
    }
}