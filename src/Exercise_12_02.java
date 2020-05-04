import java.util.Scanner;

public class Exercise_12_02 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April",
                "May", "June","July", "August", "September", "October",
                "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number between 1 and 12: ");
        int month = input.nextInt();

        try{
            System.out.println(months[month - 1] + " has " + dom[month - 1] + " days");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Wrong number");
        }
    }
}
