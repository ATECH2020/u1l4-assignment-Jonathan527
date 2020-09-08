import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int deltaHour;
        int deltaMins;
        int deltaSecs;
        int secondsDeltaH;
        int secondsDeltaM;
        int secondsTimestamp;
        /*
         *  your code goes here
         */
        deltaHour = hours2 - hours1;
        deltaMins = minutes2 - minutes1;
        deltaSecs = seconds2 - seconds1;
        secondsDeltaH = deltaHour * 3600;
        secondsDeltaM = deltaMins * 60;
        secondsTimestamp = secondsDeltaH + secondsDeltaM + deltaSecs;
        System.out.print(secondsTimestamp);
        
        // closing the scanner object
        scanner.close();
    }
}