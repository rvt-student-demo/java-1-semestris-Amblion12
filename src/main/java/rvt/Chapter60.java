package rvt;

public class Chapter60 {
    static int[] skaitli = {6, 8, 10, 2, 6, 4, 12, 0, 14};
    public static void main(String[] args) {
        for (int i = 0; i < skaitli.length; i++) {
            System.out.println(skaitli[i]);
        }
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }
    public static void ex1() {
        System.out.println(skaitli[3] + 7);
    }
    public static void ex2() {
        System.out.println(skaitli[3] - skaitli[6] * 3);
    }
    public static void ex3() {
        System.out.println(skaitli[3] - skaitli[1] / 2);
    }
    public static void ex4() {
        System.out.println(skaitli[3] ^ 2);
    }
    public static void ex5() {
        System.out.println(skaitli[3] ^ (2-4));
    }
}
