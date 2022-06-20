// ================================================================================ //
//                                                                                  //
// Tugas ini merupakan bagian dari Tugas Kelompok Praktik Struktur Data yaitu       //
// implementasi Stack melalui program stack sederhana.                              //
//                                                                                  //
// Nama Anggota :                                                                   //
// - Zaky Muhammad Iqbal                ( 21537141004 )                             //
// - Muhammad Hanif Annafi'             ( 21537141009 )                             //  
// - Dimas Rizky Wibowo                 ( 21537141013 )                             // 
// - Mufidha Zulfulansyah Putra Suparno ( 21537141014 )                             //
// - Samuel Adi Saut Puryanto           ( 21537141018 )                             //
//                                                                                  //
// Kelas :                                                                          //
// I.1 - S1 Teknologi Informasi, Universitas Negeri Yogyakarta                      //
//                                                                                  //
// Dosen :                                                                          //
// Bonita Destiana, S.Pd., M.Pd.                                                    //
//                                                                                  //
// ================================================================================ //

// Import Java Library
import java.util.*;

// Main Class
public class main {
    static public Scanner input = new Scanner(System.in);           // Scanner Method
    static LinkStack susunan = new LinkStack();                     // LinkStack connected to LinkStack.java to build new Stack
    public static void main(String[] args) {                        // Main Method
        int pilihan;
        do {                                                        // Do - While
            System.out.println();
            System.out.println("============= Opsi Menu =============");
            System.out.println("1. Buat Stack Baru");
            System.out.println("2. Tambah Data Stack");
            System.out.println("3. Tampilkan Data Stack Teratas");
            System.out.println("4. Ambil Data Stack Teratas");
            System.out.println("5. Tampilkan Data Stack Keseluruhan");
            System.out.println("6. Hapus Data dan Buat Stack Baru");
            System.out.println("7. Keluar Program");
            System.out.print("Pilih Menu < 1 - 7 > : ");
            pilihan = input.nextInt();
            System.out.println("=====================================");
            System.out.println();
            
            switch(pilihan) {
                case 1:
                buat();
                break;

                case 2:
                tambah();
                break;

                case 3:
                tampilTeratas();
                break;

                case 4:
                ambilTeratas();
                break;

                case 5:
                tampil();
                break;

                case 6:
                hapus();
                break;

                case 7:
                keluar();
                break;
            }
        } while (pilihan != 8);
        System.out.println("Mohon Untuk Memilih Menu < 1 - 7 >\nTerima Kasih!");
    }

    // Method membuat Stack baru
    public static void buat() {
        System.out.print("Jumlah Data dalam Stack yang ingin dibuat : ");
        int n = input.nextInt();
            for (int i = n; i < 0; i++) {
                System.out.print("Data ke-" + i + " : ");
                double data = input.nextDouble();
                susunan.push(data);
            }
        System.out.println("\nData berhasil dimasukkan.");
        susunan.displayStack();
    }

    // Method menambah data pada Stack
    public static void tambah() {
        System.out.println("Masukkan Data yang ingin dimasukkan : ");
        double data = input.nextDouble();
        susunan.push(data);
    }

    // Method menampilkan data teratas pada Stack
    public static void tampilTeratas() {
        if (susunan.isEmpty()) {
            System.out.println("Stack Kosong");
        } else {
            System.out.print("Data Teratas dari Data Stack Terkini : ");
            susunan.peek();
        }
    }

    // Method mengambil / menghapus data teratas pada Stack
    public static void ambilTeratas() {
        if (susunan.isEmpty()) {
            System.out.println("Stack Kosong.");
        } else {
            System.out.print("Data Stack yang berhasil diambil : ");
                susunan.peek();
                susunan.pop();
        }
        susunan.displayStack();
    }

    // Method menampilkan data keseluruhan pada Stack
    public static void tampil() {
        System.out.println("Menampilkan Data Stack Keseluruhan : ");
        susunan.displayStack();
    }

    // Method menghapus data keseluruhan pada Stack
    public static void hapus() {
        susunan.clear();
        System.out.println("Data Stack berhasil dikosongkan");
    }

    // Method keluar dari program
    public static void keluar() {
        susunan.clear();
        System.out.println("Terima Kasih, Semoga Harimu Menyenangkan ! \n");
        System.exit(0);
    }
}
