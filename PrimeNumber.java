import java.util.Scanner;

public class PrimeNumber {
    static int Prime(int n) {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }

        return 1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(Prime(i)==1)
            {
                System.out.print(i+" ");
            }
        }

    }
}
