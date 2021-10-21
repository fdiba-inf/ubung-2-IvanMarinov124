package exercise2;

import java.util.Scanner;

public class SumOfDigits{
  public static void main(String[] args ){
    Scanner input = new Scanner(System.in);
    int value = input.nextInt();

    int A = value%10;
    int B = (value/10)%10;
    int C = (value/100)%10;
    int Sum = A + B + C;
  
    System.out.println("Sum of digits: " + Sum);





  }
}