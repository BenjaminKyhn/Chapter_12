package Exercise_12_05;

public class Exercise_12_05 {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(1, 1, 5);
        }
        catch (IllegalTriangleException ex){
            System.out.println(ex.getMessage());
        }
    }
}
