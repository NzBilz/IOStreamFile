package tugas;

public class MainTugas {

    public static void main(String[] args) {
        String berkasData = "barang.txt";

        // =========================================================================
        // Poin Tambahan 1: Menyimpan & menampilkan kategori dalam array String tetap
        // =========================================================================
        System.out.println("=== KATEGORI TOKO ===");
        String[] kategori = {"Elektronik", "Pakaian", "Makanan & Minuman", "Peralatan Rumah"};
        for (int i = 0; i < kategori.length; i++) {
            System.out.println("- Kategori " + (i + 1) + ": " + kategori[i]);
        }
        System.out.println();

        // =========================================================================
        // Poin Utama 3 & Tambahan 2: Membuat gudang awal & tambah minimal 5 barang
        // =========================================================================
        System.out.println("=== PROSES GUDANG UTAMA ===");
        Gudang gudangUtama = new Gudang(berkasData);
        
        gudangUtama.tambahBarang(new Barang("Laptop ASUS Vibe", 8500000, 5));
        gudangUtama.tambahBarang(new Barang("Mouse Wireless Logi", 250000, 15));
        gudangUtama.tambahBarang(new Barang("Keyboard Mekanik", 450000, 8));
        gudangUtama.tambahBarang(new Barang("Monitor 24 Inch", 1750000, 4));
        gudangUtama.tambahBarang(new Barang("Headset Gaming Rgb", 350000, 10));

        System.out.println("Menampilkan data gudang utama:");
        gudangUtama.tampilkanSemua();
        
        // Menyimpan data barang ke berkas teks
        gudangUtama.simpanKeBerkas();
        System.out.println();

        // =========================================================================
        // Poin Tambahan 3: Membuat objek Gudang baru untuk membuktikan data tersimpan
        // =========================================================================
        System.out.println("=== PROSES VALIDASI GUDANG BARU ===");
        Gudang gudangBaru = new Gudang(berkasData);
        
        // Memuat data dari berkas yang diisi oleh gudangUtama sebelumnya
        gudangBaru.muatDariBerkas();
        
        System.out.println("\nMenampilkan data pada gudang baru (Hasil Load):");
        gudangBaru.tampilkanSemua();
        
        // Menampilkan total nilai persediaan
        System.out.println("-------------------------------------------------");
        System.out.println("Total Nilai Persediaan Barang : Rp" + gudangBaru.totalNilai());
        System.out.println("-------------------------------------------------");
    }
}