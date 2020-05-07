import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise_12_14 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Names List.txt");
        System.out.println(readInFile("Benjamin", file));
    }

    public static int
    readInFile(String line, File file) throws FileNotFoundException {

        int count = 0;
        int lineNumber = -1;

        // Count chars and words
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNextLine()) {
                String s = input.nextLine();
                if (line.equals(s))
                    lineNumber = count;
                count++;
            }
        }

        return lineNumber;
    }
}
