import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class calculate {

    public static long multiplication(long a , long b){
        long c = a * b;

        return c;
    }

    public static long minus (long a , long b){
        long c = a - b;

        return c;
    }

public static long sum( long a , long b){
        long c = a + b;

        return c;
}


public static long division(long a , long b){
        long c = a / b;

        return c;
}
    public static void main(String[] args) {

//        minus();
//        multiplication();
//        division();
//        sum();
//
//

        System.out.println("pls choice number" +
                "     " +
                "1.multiplication " +
                "   " +
                "" +
                "    " +
                "2.minus" +
                "       " +
                "3.sum" +
                "        " +
                "4.division");


        Scanner scanner = new Scanner(System.in);

        long calculate = scanner.nextLong();
        System.out.println("Enter the first and second numbers");
        if (calculate == 1) {
            System.out.println(multiplication(scanner.nextLong(), scanner.nextLong()));
        }
        if (calculate == 2) {
            System.out.println(minus(scanner.nextLong(), scanner.nextLong()));
        }
        if (calculate == 3) {
            System.out.println(sum(scanner.nextLong(), scanner.nextLong()));
        }
        if (calculate == 4) {
            System.out.println(division(scanner.nextLong(), scanner.nextLong()));
        }
    }}

