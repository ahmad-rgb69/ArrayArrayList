
package bagian2.arraylist;


import java.util.ArrayList;

public class Latihan3 {

    public static void main(String[] args) {
        
        ArrayList<String> mahasiswa = new ArrayList<>();
        
        mahasiswa.add("Aldi");
        mahasiswa.add("Budiono");
        mahasiswa.add("Ciregar");
        
        System.out.println("Isi list : " + mahasiswa);
        System.out.println("Jumlah   : " + mahasiswa.size());
        System.out.println("Index 1  : " + mahasiswa.get(1));
        
    }

}