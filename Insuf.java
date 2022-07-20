
class InsufficientFunds extends Exception
{
    public  InsufficientFunds(String s)
    {
        super(s);
    }
}

public class Insuf {
    public static void main(String[] args) {
        int balance = 1000;
        int withdraw = 2000;
        try
        {
            if(withdraw>balance)
            {
                throw new InsufficientFunds("Insuffient money");
            }
        }
        catch(InsufficientFunds ex)
        {
            ex.printStackTrace();
        }
    }
}
