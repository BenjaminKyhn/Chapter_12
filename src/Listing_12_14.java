import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Listing_12_14 {
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            output.print("John T Smith ");
            output.print(90);
            output.print("Eric K Jones ");
            output.print(85);
        }
    }
}
