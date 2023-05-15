package homework;

import java.util.Scanner;

//Write a program to convert the upper case to lower case.
public class UpperLower {
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        System.out.println("Enter Text here:  ");
        String txt1 = txt.next();
        String lowercase = txt1.toLowerCase();
        System.out.println("The lowercase equivalent is:" +lowercase);

    }

}
