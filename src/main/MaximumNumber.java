package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumNumber<E extends Comparable> {
    public static void main(String[] args) {
        MaximumNumber maximumNumberInt = new MaximumNumber(5, 10, 20,30);
        MaximumNumber maximumNumberFloat = new MaximumNumber(5f, 10f, 20f,30f);
        MaximumNumber maximumNumberString = new MaximumNumber("Apple", "Banana", "Peach","Orange");

        System.out.println("The maximum value is " + maximumNumberInt.maximumTest());
        System.out.println("The maximum value is " + maximumNumberFloat.maximumTest());
        System.out.println("The maximum value is " + maximumNumberString.maximumTest());
    }

    E x, y, z, t;

    public MaximumNumber(E x, E y, E z, E t) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }

    public E maximumTest() {
        return maximumTest(this.x, this.y, this.z, this.t);
    }

    public static <E extends Comparable> E maximumTest(E x, E y, E z, E t) {
        List<E> list=new ArrayList<E>(Arrays.asList(x,y,z,t));
        Collections.sort(list,Collections.reverseOrder());
        E max = list.get(0);
        return max;
    }
}
