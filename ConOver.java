
class cons
{
    cons()
    {
        System.out.println("hi");
    }
    cons(String s)
    {
        System.out.println(s);
    }
    cons(String s,String q)
    {
        System.out.println(s+" "+q);
    }
}
public class ConOver {
    public static void main(String[] args) {
        cons c=new cons();
        cons c1 = new cons("hello");
        cons c2 = new cons("how are","you");
    }
}


