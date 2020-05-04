public class Exercise_12_01 {
    public static void main(String[] args) {
        if (args.length != 3){
            System.exit(1);
        }

        try{
            Integer.parseInt(args[0]);
        }
        catch (Exception e){
            System.out.println("Wrong input: " + args[0]);
        }

        try{
            Integer.parseInt(args[2]);
        }
        catch (Exception e){
            System.out.println("Wrong input: " + args[2]);
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        int result = 0;

        switch (args[1].charAt(0)){
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
        }

        System.out.println(a + " " + args[1] + " " + b + " = " + result);
    }
}
