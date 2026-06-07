
package bagian2.arraylist;

import java.util.ArrayList;

public class DaftarBelanja {
    public static void main(String[] args) {
        
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        daftarBelanja.add("Monitor");
        daftarBelanja.add("Keyboard");
        daftarBelanja.add("Mouse");
        daftarBelanja.add("Mic");
        
        daftarBelanja.remove(1);
        
        System.out.println("Isi list     : " + daftarBelanja);
        System.out.println("Jumlah akhir : " + daftarBelanja.size());
        
    }
}
