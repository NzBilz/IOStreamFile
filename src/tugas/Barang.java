package tugas;

public class Barang {
    // Atribut barang
    private String nama;
    private double harga;
    private int stok;

    // Constructor untuk inisialisasi objek Barang
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter untuk mengakses atribut dari luar kelas
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Mengubah objek menjadi baris teks dengan pemisah ";" untuk disimpan ke berkas
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    // Mengembalikan informasi detail barang untuk ditampilkan ke layar
    public String info() {
        return nama + " | Harga: Rp" + harga + " | Stok: " + stok;
    }
}