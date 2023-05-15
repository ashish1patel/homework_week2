package homework;
//7. Write a program to insert any temperature value in degree Fahrenheit and
//convert to degree Celsius ((F − 32) × 5/9 = 0°C).

import java.util.Scanner;

public class RediusValue {
    public static void r1(){
        System.out.println("Formula of Area A= ");
    }
    public static void r2(double r){
        double ans = Math.PI * r * r;
        System.out.println("The area of the circle is = " + ans);
    }

    public static void main(String[] args) {

        r1();
        Scanner input = new Scanner(System.in);
        double r = input.nextByte();
        r2(r);
    }
}
