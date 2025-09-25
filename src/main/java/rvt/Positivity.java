package rvt;

public class Positivity {

    public enum Result {
        POSITIVE,
        NEGATIVE,
        ZERO
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(byOperator(5));   // POSITIVE
        System.out.println(byOperator(-3));  // NEGATIVE
        System.out.println(byOperator(0));   // ZERO
    }

    public static Result byOperator(Integer integer) {
        if (integer > 0) {
            return Result.POSITIVE;
        } else if (integer < 0) {
            return Result.NEGATIVE;
        }
        return Result.ZERO;
    }
}