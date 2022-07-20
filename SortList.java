import java.util.Scanner;

public class SortList {
    public static void main(String[] args) {
        String s[] = {"ball","apple","zebra","cat"};

        String t;

       for(int i=0;i<s.length;i++)
       {
           for(int j=i+1;j<s.length;j++)
           {
               if(s[i].compareTo(s[j])>0)
               {
                   t=s[i];
                   s[i]=s[j];
                   s[j]=t;
               }
           }
       }
        for(String z : s)
        {
            System.out.print(z+"\t");
        }
    }
}
