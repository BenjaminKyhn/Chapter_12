import java.io.File;
import java.util.Scanner;

public class Listing_12_15 {
    public static void main(String[] args) throws Exception{
        File file = new File("Scores.txt");

        Scanner input = new Scanner(file);

        while(input.hasNext()){
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }

        input.close();
    }
}
