
class outer
{
   static class inner
    {
        public  void display()
            {
                System.out.println("hi");

            }
    }
}

public class innerclass {
    public static void main(String[] args) {
        outer.inner obj = new outer.inner();
        obj.display();
    }
}
