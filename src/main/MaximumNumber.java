package main;

public class MaximumNumber<E extends Comparable> {
    public static void main(String[] args) {
        MaximumNumber maximumNumberInt = new MaximumNumber(5, 10, 20);
        MaximumNumber maximumNumberFloat = new MaximumNumber(5f, 10f, 20f);
        MaximumNumber maximumNumberString = new MaximumNumber("Apple", "Banana", "Peach");

        System.out.println("The maximum value is " + maximumNumberInt.maximumTest());
        System.out.println("The maximum value is " + maximumNumberFloat.maximumTest());
        System.out.println("The maximum value is " + maximumNumberString.maximumTest());
    }

    E x, y, z;

    public MaximumNumber(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public E maximumTest() {
        return maximumTest(this.x, this.y, this.z);
    }

    public static <E extends Comparable> E maximumTest(E x, E y, E z) {
        E max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
}
