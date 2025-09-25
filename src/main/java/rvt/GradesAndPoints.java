package rvt;

import java.util.Scanner;

public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ievadiet ballus: ");
    String myNum = myObj.nextLine();
    int num = Integer.parseInt(myNum);
    if (num <= 0 && num >= 49) {
        System.out.println("Failed");
            } else if (num <= 50 && num >= 59) {
        System.out.println("1");
            } else if (num <= 60 && num >= 69) {
        System.out.println("2");
            } else if (num <= 70 && num >= 79) {
        System.out.println("3");
            } else if (num <= 80 && num >= 89) {
        System.out.println("4");
            } else if (num <= 90 && num >= 100) {
        System.out.println("5");
    } else if (num > 100) {
        System.out.println("Incredible.");
    }
        else {
            System.out.println("Impossible!");
        }
    myObj.close();
  }
}