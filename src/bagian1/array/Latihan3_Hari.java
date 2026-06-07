
package bagian1.array;

public class Latihan3_Hari {
    public static void main(String[] args) {
 
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        System.out.print("Hari yang memiliki lebih dari 5 huruf: ");
        for (String hari : namaHari) {
            if (hari.length() > 5) {
                System.out.println(hari);
            }
        }
    }
}

