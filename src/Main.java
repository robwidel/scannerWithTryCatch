import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Give me an INT number: ");
        String str = scan.nextLine();
        Scanner scanner = new Scanner(str);
        int x;

        try {
            x = scanner.nextInt();
            System.out.println("Takie dales int: " + x);
        }
         catch(Exception e) {
             e.printStackTrace();
        } finally {
            System.out.println("The 'try catch' is finished.");
        }


    }


}