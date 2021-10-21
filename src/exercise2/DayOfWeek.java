package exercise2;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;
        string mon = "Monday";
        string tue = "Tuesday";
        string wed = "Wednesday";
        string thu = "Thursday";
        string fri = "Friday";
        string sat = "Saturday";
        string sun = "Sunday";
        string inv = "Invalid day";


        day = input.nextInt();
        switch(day)
        {
          case 1:
          System.out.println("Day of week: " + mon);
          break;
          case 2:
         System.out.println("Day of week: " + tue);
          break;
          case 3:
          System.out.println("Day of week: " + wed );
          break;
          case 4:
          System.out.println("Day of week: " + thu);
          break;
          case 5:
          System.out.println("Day of week: " + fri);
          break;
          case 6:
          System.out.println("Day of week: " + sat);
          break;
          case 7:
          System.out.println("Day of week: " + sun);
          break;
          default:
          System.out.println("Day of week: " + inv);
          break;
        }
        input.close();

        
    }

}