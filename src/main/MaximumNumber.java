package main;

public class MaximumNumber {
    public static void main(String[] args) {
        MaximumNumber maximumNumber = new MaximumNumber();
        System.out.println("The maximum value is " + maximumNumber.maximumTest(1f, 2f, 3f));
    }

    public static Float maximumTest(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
}
