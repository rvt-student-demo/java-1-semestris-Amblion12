package rvt;

public class function {
    public static void main(String[] args) {
        printUntilNumbers(10);
    }
    public static void printUntilNumbers(int n) {
        for (int i = 0; i <= n; i +=1) {
            System.out.println(i);
        }
    }
}