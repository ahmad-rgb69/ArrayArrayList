
package bagian2.arraylist;

import java.util.ArrayList;

public class NilaiTerbesar {
    public static void main(String[] args) {

        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(25);
        angka.add(47);
        angka.add(12);
        angka.add(89);
        angka.add(34);
        
        int max = angka.get(0);
        
        for (int n : angka) {
            if (n > max) {
                max = n;
            }
        }
        
        System.out.println("Data angka     : " + angka);
        System.out.println("Nilai terbesar : " + max);
        
    }
}
