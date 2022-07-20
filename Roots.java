import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d =b*b-4*a*c;
        if(d>0)
        {
            double r1  = (-b+Math.sqrt(d))/(2*a);
            double r2  = (-b-Math.sqrt(d))/(2*a);
            System.out.println((int)r1+"   "+(int)r2);

        }
        else if (d==0)
        {
            System.out.println("roots are equal");
        }
        else
        {
            System.out.println("Imaginary");
        }
    }
}

