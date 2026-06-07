
/*  Nama : Ahmad Aldy Noor Fadhillah
    NPM  : 2410010305
*/

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Basis Data", "Struktur Data"};
        
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(new Mahasiswa("Aldi", "2410010305", 85.5)); 
        kelas.tambahMahasiswa(new Mahasiswa("Budiono Siregar", "2410010306", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Cihuy", "2410010307", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dedi Korbuzzer", "2410010308", 45.5));
        kelas.tambahMahasiswa(new Mahasiswa("Eka Gustiwana", "2410010309", 75.0));

        System.out.println("=== DATA MAHASISWA ===");
        kelas.tampilkanSemua();

        System.out.println("Rata-rata Nilai Kelas : " + String.format("%.2f", kelas.hitungRataRata()));
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println("Total Mahasiswa       : " + kelas.getJumlahMahasiswa());
        System.out.println();

        System.out.println(">>> Menambahkan 1 mahasiswa baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Febri", "2410010404", 68.0));
        
        System.out.println("\n=== DATA MAHASISWA === (updated)");
        kelas.tampilkanSemua();
        System.out.println("Total Mahasiswa Sekarang: " + kelas.getJumlahMahasiswa());
        System.out.println("Jumlah Mahasiswa Lulus  : " + kelas.jumlahLulus());
    }
}