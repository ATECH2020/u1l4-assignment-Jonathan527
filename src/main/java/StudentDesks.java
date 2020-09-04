import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int classA = scanner.nextInt();
        int classB = scanner.nextInt();
        int classC = scanner.nextInt();
        int deskA;
        int deskB;
        int deskC;
        int totalDesks;

        /*
         *  your code goes here
         */
          deskA = (classA + 1) / 2;
          deskB = (classB + 1) / 2;
          deskC = (classC + 1) / 2;
          totalDesks = deskA + deskB + deskC;
          System.out.print(totalDesks);

        // closing the scanner object
        scanner.close();
    }
}