package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiriStreamDanFile {

    public static void main(String[] args) {
        
        // ==========================================
        // 1. Memeriksa keberadaan dan ukuran laporan.txt
        // ==========================================
        System.out.println("--- SOAL 1: Informasi berkas laporan.txt ---");
        File laporan = new File("laporan.txt");
        
        if (laporan.exists()) {
            System.out.println("Berkas laporan.txt ditemukan.");
            System.out.println("Ukuran berkas: " + laporan.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt TIDAK ditemukan.");
        }
        System.out.println(); // Baris kosong untuk kerapian

        // ==========================================
        // 2. Membuat folder baru 'arsip'
        // ==========================================
        System.out.println("--- SOAL 2: Membuat folder 'arsip' ---");
        File folderArsip = new File("arsip");
        
        if (folderArsip.mkdir()) {
            System.out.println("Berhasil: Folder 'arsip' telah dibuat.");
        } else {
            System.out.println("Gagal: Folder 'arsip' gagal dibuat atau sudah ada.");
        }
        System.out.println();

        // ==========================================
        // 3. Membuat dan menghapus sementara.txt
        // ==========================================
        System.out.println("--- SOAL 3: Manajemen berkas sementara.txt ---");
        File berkasSementara = new File("sementara.txt");
        
        try {
            // Membuat berkas baru
            if (berkasSementara.createNewFile()) {
                System.out.println("Berkas sementara.txt berhasil dibuat.");
            } else {
                System.out.println("Berkas sementara.txt sudah ada.");
            }
            
            // Cek status sebelum dihapus
            System.out.println("Status keberadaan sebelum dihapus: " + berkasSementara.exists());
            
            // Menghapus berkas
            if (berkasSementara.delete()) {
                System.out.println("Berkas sementara.txt berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus berkas sementara.txt.");
            }
            
            // Cek status sesudah dihapus
            System.out.println("Status keberadaan sesudah dihapus: " + berkasSementara.exists());
            
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan I/O: " + e.getMessage());
        }
    }
}