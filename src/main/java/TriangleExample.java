import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter edge a of the Triangle: ");
        double a = sc.nextDouble();
        System.out.println("Enter edge b of the Triangle: ");
        double b = sc.nextDouble();
        System.out.println("Enter edge c of the Triangle: ");
        double c = sc.nextDouble();
        TriangleExample triangleExample = new TriangleExample();
        triangleExample.triangle(a, b, c);
    }

    private void triangle (double a, double b, double c) throws Exception{
        try {
            if(a <= 0 || b <= 0 || c <= 0) throw new Exception();
            else if (a + b <= c || a + c <= b || b + c <= a) throw new Exception();
            else
                System.out.println("This is Triangle");
        } catch (Exception e) {
            System.err.println("Error!");
        }
    }
}
