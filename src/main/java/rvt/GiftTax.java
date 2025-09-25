package rvt;

import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ievadiet naudu summu: ");
        String myNum = myObj.nextLine();
        int num = Integer.parseInt(myNum);
        if (num >= 5000 && num <= 25000) {
            System.out.println(100 + (num - 5000) * 0.08);
        }
        else if (num >= 25000 && num <= 55000) {
            System.out.println(1700 + (num - 25000) * 0.1);
        }
        else if (num >= 55000 && num <= 200000) {
            System.out.println(4700 + (num - 55000) * 0.12);
        }
        else if (num >= 200000 && num <= 1000000) {
            System.out.println(22100 + (num - 20000) * 0.15);
        }
        else if (num >= 1000000) {
            System.out.println(142100 + (num - 1000000) * 0.17);
        }
        else {
            System.out.println("NNN");
        }
        myObj.close();
    }
}