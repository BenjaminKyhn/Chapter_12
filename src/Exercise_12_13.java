import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise_12_13 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise_12_11 " + "file name");
            System.exit(1);
        }

        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("File not found");
            System.exit(2);
        }

        int chars = 0;
        int words = 0;
        int lines = 0;

        // Count chars and words
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String s = input.next();
                chars += s.length();
                words++;
            }
        }

        // Count lines
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String s = input.nextLine();
                lines++;
            }
        }

        System.out.println("Characters: " + chars);
        System.out.println("Word: " + words);
        System.out.println("Lines: " + lines);
    }
}
