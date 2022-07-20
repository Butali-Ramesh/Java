import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int r = sc.nextInt();
        System.out.println("enter column");
        int c = sc.nextInt();
        System.out.println("enter matrix a");
        int a[][]= new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print( a[i][j]+"\t");
            }
            System.out.println();
        }
        int b[][]=new int[r][c];
        System.out.println("enter matrix b");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]= sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print( b[i][j]+"\t");
            }
            System.out.println();
        }

        int s[][] = new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j = 0; j<c; j++)
            {
                for(int k=0;k<r;k++)
                {
                    s[i][j]+=a[i][k]*b[k][j];
                }
            }
            System.out.println();
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print( s[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
