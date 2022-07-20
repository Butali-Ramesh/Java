public class VarLEngth {
    static void display(String ... str)
    {
        for (String s:str)
        {
            System.out.print(s+" ");

        }
    }

    public static void main(String[] args) {
        display();
        display("hello");
        display("hello","ramesh");
    }
}
