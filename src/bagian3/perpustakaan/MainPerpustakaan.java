
package bagian3.perpustakaan;


public class MainPerpustakaan {
    public static void main(String[] args) {
        
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();
        
        // Membuat objek Buku lalu memasukkannya ke koleksi
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));   //("Laskar Pelangi", "Andrea Hirata"));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));         //("Bumi Manusia", "Pramoedya"));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));    //("Negeri 5 Menara", "Ahmad Fuadi"));
        
        // Tampilkan koleksi awal
        perpus.tampilkanKoleksi();
        System.out.println();
        
        // Simulasi peminjaman pertama dan kedua (kondisi double pinjam)
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); 
        System.out.println();
        
        // Tampilkan koleksi akhir dan sisa buku tersedia
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        
        //Tampilkan pencarian penulis
        perpus.cariPenulis("Andrea Hirata");
        System.out.println();
        
        //Tampilkan pengembalian buku
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println();
        
    }
}
