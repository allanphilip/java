package newpack1;

import java.util.Vector;

public class Enumeration {

public static void main(String[] args) {
   
    Vector<Integer> count = new Vector<>();
    count.add(1);
    count.add(2);
    count.add(2);

    
    java.util. Enumeration<Integer> enumeration = count.elements();

   
    System.out.println("Fruits list:");
    while (enumeration.hasMoreElements()) {
        System.out.println(enumeration.nextElement());
    }
}
}


