import java.io.*;
import java.util.*;    //im not really sure about this part, teacher
//but at least i tried to do smth

class hash {
    public static void main(String args[])
    {
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();
        ht1.put(1, "1");
        ht1.put(2, "2");
        ht1.put(3, "3");

        ht2.put(4, "4");
        ht2.put(5, "5");
        ht2.put(6, "6");

        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
    }
}

