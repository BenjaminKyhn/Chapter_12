import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_12_03 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April",
                "May", "June","July", "August", "September", "October",
                "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number between 1 and 12: ");

        int month = -1;

        try {
            month = input.nextInt();
        }
        catch (InputMismatchException ex1){
            System.out.println("Wrong input type");
            System.exit(1);
        }


        try{
            System.out.println(months[month - 1] + " has " + dom[month - 1] + " days");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Wrong number");
            System.exit(2);
        }
    }
}
