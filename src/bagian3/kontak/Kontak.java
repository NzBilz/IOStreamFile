package bagian3.kontak;

public class Kontak {
    // Atribut: data yang dimiliki setiap kontak
    private String nama;
    private String nomor;
    private String email; // Tambahan Atribut Email (Soal 2)

    // Constructor yang disesuaikan (Soal 2)
    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    // Getter (Soal 2)
    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    public String getEmail() {
        return email;
    }

    // Mengubah objek menjadi satu baris teks dengan pemisah 3 bagian (Soal 2)
    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }

    // Mengembalikan keterangan lengkap kontak (Soal 2)
    public String info() {
        return nama + " - " + nomor + " (" + email + ")";
    }
}