//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class functionQuestion6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        int radius = input.nextInt();
        double answer1 = circumference(radius);
        double answer2 = area(radius);
        System.out.println("Circumference and area of the circle are "+ answer1+" and "+answer2);
    }

    static double circumference(int radius){
        double result = 2*Math.PI*radius;
        return result;
    }

    static double area(int radius){
        double result = Math.PI*radius*radius;
        return result;
    }
}
