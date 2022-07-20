

public class TwinPrime {
    static int CheckPrime(int num)
    {

        for(int j = 2;j<num;j++)
        {
            if (num%j==0)
            {
                return 0;
            }

        }
           return 1;
    }
    public static void main(String[] args) {
        for(int i = 3;i<1000;i++)
        {

            if (CheckPrime(i)==1 && CheckPrime(i+2)==1)
            {
                System.out.println("( "+i+" , "+(i+2)+" )");
            }
        }
    }
}

