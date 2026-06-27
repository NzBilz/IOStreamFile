package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiriBacaTulis {

    public static void main(String[] args) {
        String namaBerkas = "hari.txt";

        // =========================================================================
        // 1. Menulis 5 nama hari awal ke hari.txt, lalu membaca dan menampilkannya
        // =========================================================================
        System.out.println("--- SOAL 1: Menulis & Membaca 5 Hari Awal ---");
        
        // Menulis data (akan menimpa/membuat baru berkas)
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))) {
            penulis.println("Senin");
            penulis.println("Selasa");
            penulis.println("Rabu");
            penulis.println("Kamis");
            penulis.println("Jumat");
            System.out.println("Berhasil menulis 5 hari awal ke " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        // Membaca kembali data yang baru ditulis
        System.out.println("\nIsi berkas " + namaBerkas + " saat ini:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println("- " + baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
        System.out.println();


        // =========================================================================
        // 2. Menambahkan (append) 2 nama hari lagi, lalu menampilkan seluruh isi
        // =========================================================================
        System.out.println("--- SOAL 2: Menambahkan (Append) 2 Hari Baru ---");
        
        // Append data menggunakan parameter true pada FileWriter
        try (PrintWriter penulisAppend = new PrintWriter(new FileWriter(namaBerkas, true))) {
            penulisAppend.println("Sabtu");
            penulisAppend.println("Minggu");
            System.out.println("Berhasil menambah hari Sabtu dan Minggu.");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        // Membaca ulang seluruh isi berkas setelah di-append
        System.out.println("\nIsi berkas " + namaBerkas + " setelah ditambahkan:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println("- " + baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
        System.out.println();


        // =========================================================================
        // 3. Membaca hari.txt dan menghitung total baris di dalamnya
        // =========================================================================
        System.out.println("--- SOAL 3: Menghitung Jumlah Baris ---");
        int jumlahBaris = 0;
        
        try (BufferedReader pembacaHitung = new BufferedReader(new FileReader(namaBerkas))) {
            // Setiap kali readLine() tidak null, artinya ada baris yang terbaca
            while (pembacaHitung.readLine() != null) {
                jumlahBaris++;
            }
            System.out.println("Total jumlah baris di dalam berkas " + namaBerkas + " adalah: " + jumlahBaris + " baris.");
        } catch (IOException e) {
            System.out.println("Gagal menghitung baris: " + e.getMessage());
        }
    }
}