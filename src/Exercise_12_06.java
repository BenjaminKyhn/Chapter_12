import java.util.Scanner;

public class Exercise_12_06 {
    /** Main method */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number " + hex + " is " + hex2Dec(hex.toUpperCase()));
    }

    public static int hex2Dec(String hexString) {
        int decimalValue = 0;
        for (int i = 0; i < hexString.length(); i++) {
            char hexChar = hexString.charAt(i);
            if (!(hexChar >= 'A' && hexChar <= 'F') && !(hexChar >= '0' && hexChar <= '9'))
                throw  new NumberFormatException();
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch){
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else // ch is '0', '1', ... or '9'
            return ch - '0';
    }
}
