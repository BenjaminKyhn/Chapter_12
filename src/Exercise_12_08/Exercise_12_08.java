package Exercise_12_08;

import java.util.Scanner;

public class Exercise_12_08 {
    /** Main method */
    public static void main(String[] args) throws HexFormatException {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number " + hex + " is " + hex2Dec(hex.toUpperCase()));
    }

    public static int hex2Dec(String hexString) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hexString.length(); i++) {
            char hexChar = hexString.charAt(i);
            if (!(hexChar >= 'A' && hexChar <= 'F') && !(hexChar >= '0' && hexChar <= '9'))
                throw new HexFormatException("Not a hex string");
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
