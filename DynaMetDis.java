


class DMD {
    void bark() {
        System.out.println("1");
    }
}
    class demo1 extends DMD
    {
        void bark()
        {
            System.out.println("2");
        }
    }
    class demo2 extends DMD
    {
        void bark()
        {
            System.out.println("3");
        }
    }

public class DynaMetDis {
    public static void main(String[] args) {
        DMD d = new DMD();
        d.bark();
        DMD d1 = new demo1();
        d1.bark();
        DMD d2 = new demo2();
        d2.bark();



    }
}
