import java.util.Scanner;

public class Fib {
    static  int fib(int n)
    {   int res ;
            if(n==0)
            {
                return 1;
            }
            if(n==1||n==1)
            {
                return 1;
            }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n; i++)
        {
            System.out.print(fib(i)+" ");
        }
        System.out.println();
        int a=0,b=1;
        System.out.print((a+1)+" ");

        for(int i = 0;i < n-1; i++)
        {
          int   c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
