package exercise.whileloop;

public class Fibonacci {
    public static void main(String[] args){
        int n = 1;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        double average;

        System.out.println("The first " + nMax + " Fibonaci numbers are:");
        while (n <= nMax){
            System.out.print(fnMinus1 + " ");
            sum = fnMinus1 + fnMinus2;
            fnMinus1 = fnMinus2;
            fnMinus2 = sum;
            n++;
        }
        average = sum/nMax;
        System.out.println("\n The average is " + average);
    }
}
