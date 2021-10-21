package exercise2;

import java.util.Scanner;

public class BasicInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        double squareRoot = Math.sqrt(num);

        System.out.println("You entered: " + num + ". Its square root is " + squareRoot);
    }

}

