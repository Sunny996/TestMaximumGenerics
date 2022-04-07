package main;

public class MaximumNumber {
    public static void main(String[] args) {
        MaximumNumber maximumNumber = new MaximumNumber();
        System.out.println("The maximum value is " + maximumNumber.maximumTest("Apple", "Banana", "Peach"));
    }

    public static String maximumTest(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
}
