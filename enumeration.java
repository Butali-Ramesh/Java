import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class enumeration {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(15);
        Collections.sort(al);
        Enumeration<Integer> enu = Collections.enumeration(al);
        while (enu.hasMoreElements())
        {
            System.out.println(enu.nextElement());
        }
    }
}
