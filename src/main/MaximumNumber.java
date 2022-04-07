package main;

public class MaximumNumber {
    public static void main(String[] args) {
        MaximumNumber maximumNumber = new MaximumNumber();
        System.out.println("The maximum value is "+maximumNumber.maximumTest(1,2,3));
    }
    public Integer maximumTest(Integer x, Integer y, Integer z){
        Integer max=x;
        if(y.compareTo(max)>0)
            max=y;
        if(z.compareTo(max)>0)
            max=z;
        return max;
    }
}
