import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_12_12 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise_12_12 " + "file name");
            System.exit(1);
        }

        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("File not found");
            System.exit(2);
        }

        String s = "";

        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()){
                s += input.nextLine() + "\n";
            }
            s = s.replaceAll("\n\\s*\\{", " {");
        }

        try (
                PrintWriter output = new PrintWriter(file);
        ){
            output.print(s);
        }
    }
}
