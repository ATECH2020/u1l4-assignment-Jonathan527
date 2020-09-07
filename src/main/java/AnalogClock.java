import java.util.Scanner;
 
class AnalogClock {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads ints from user
       int hourDegree = scanner.nextInt();
       int mintueDegree;
       int degreePerHour;
       int degreePerMinute;
       /*
        *  your code goes here
        */
       degreePerHour = 360 / 12;
       degreePerMinute = 360 / 60;
       mintueDegree = ((hourDegree % degreePerHour) * degreePerMinute) * 2;
       System.out.print(mintueDegree);
       // closing the scanner object
       scanner.close();
   }
}
