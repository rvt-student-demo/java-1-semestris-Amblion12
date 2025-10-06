package rvt;

public class Chapter19 {

    public static void main(String[] args) {
        ex1();
        ex2();
    }

    public static void ex1() {
        int x = 0;
        while (x < 5) {
            System.out.println(x);
            x++;
        }
    }

    public static void ex2() {
        int x = 5;
        while (x > 0) {
            System.out.println(x);
            x--;
        }
    }
}
