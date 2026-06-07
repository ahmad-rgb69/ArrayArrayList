package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int hitung = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                hitung++;
            }
        }
        return hitung;
    }

    public int getJumlahMahasiswa() {
        return daftarMahasiswa.size();
    }

    public void tampilkanSemua() {
        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s %-15s %-10s %-10s\n", "NPM", "Nama", "Nilai", "Status");
        System.out.println("--------------------------------------------------");
        for (Mahasiswa mhs : daftarMahasiswa) {
            String status = mhs.lulus() ? "LULUS" : "TIDAK LULUS";
            System.out.printf("%-15s %-15s %-10.2f %-10s\n", 
                mhs.getNpm(), mhs.getNama(), mhs.getNilai(), status);
        }
        System.out.println("--------------------------------------------------");
    }
}