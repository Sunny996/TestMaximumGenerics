package main;

public class MaximumNumber {
    public static void main(String[] args) {
        MaximumNumber maximumNumber = new MaximumNumber();
        System.out.println("The maximum value is " + maximumNumber.maximumTest(5, 10, 20));
        System.out.println("The maximum value is " + maximumNumber.maximumTest(5f, 10f, 20f));
        System.out.println("The maximum value is " + maximumNumber.maximumTest("Apple", "Banana", "Peach"));
    }

    public <E extends Comparable>  E maximumTest(E x, E y, E z) {
        E max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
}
