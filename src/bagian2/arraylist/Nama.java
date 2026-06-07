
package bagian2.arraylist;

import java.util.ArrayList;

public class Nama {
   public static void main(String[] args) {
        
        ArrayList<String> nama = new ArrayList<>();
        
        String[] data = {"Aldi", "Budi", "Ahmad", "Ciregar", "Alam", "DimasKanjeng"};
        
        for (String d : data) {
            nama.add(d);
        }
        
        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
        
    } 
}
