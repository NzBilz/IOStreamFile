package bagian3.kontak;

public class MainKontak {

    public static void main(String[] args) {
        // 1. Membuat objek pengelola dan mengisinya (menyertakan argumen email)
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@email.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@email.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@email.com"));
        
        System.out.println("--- MENAMPILKAN & MENYIMPAN DATA AWAL ---");
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();

        // 2. Menguji Method cariKontak (Soal 1)
        System.out.println("--- PENGUJIAN METODE CARI KONTAK ---");
        buku.cariKontak("Budi");  // Skenario: Ada
        buku.cariKontak("Dewi");  // Skenario: Tidak ada
        System.out.println();

        // 3. Menguji Method hapusKontak (Soal 3)
        System.out.println("--- PENGUJIAN METODE HAPUS KONTAK ---");
        buku.hapusKontak("Andi"); // Menghapus Andi dan otomatis update berkas teks
        System.out.println();

        // 4. Memuat kembali dari berkas ke objek baru untuk pembuktian integritas data
        System.out.println("--- MEMUAT ULANG DARI BERKAS UNTUK VALIDASI ---");
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak saat ini: " + bukuLain.jumlahKontak());
    }
}