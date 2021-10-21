package exercise2;

import java.util.Scanner;

public class Circle{
  public static void main(String[] args ){
    Scanner input = new Scanner(System.in);

    double r;
    double C;
    double A;
    double pi;
pi = 4.0*(1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/11.0 - 1.0/13.0 + 1.0/17.0 - 1.0/19.0 + 1.0/23.0 );
System.out.println("Enter a radius: ");
r = input.nextDouble();

C = 2.0*pi*r;
A = pi*r*r;

System.out.println("Circumference: "+ C);
System.out.println("Area: " + A);
input.close();
  }
}