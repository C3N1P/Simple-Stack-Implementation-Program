import java.util.*;

public class main {
    static public Scanner input = new Scanner(System.in);
    static LinkStack susunan = new LinkStack();
    public static void main(String[] args) {
        LinkStack susunan = new LinkStack(); // make stack
        int pilihan;
        Scanner input = new Scanner(System.in);
        do {
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
    } // end main()

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

    public static void tambah() {
        System.out.println("Masukkan Data yang ingin dimasukkan : ");
        double data = input.nextDouble();
        susunan.push(data);
    }

    public static void tampilTeratas() {
        if (susunan.isEmpty()) {
            System.out.println("Stack Kosong");
        } else {
            System.out.print("Data Teratas dari Data Stack Terkini : ");
            susunan.peek();
        }
    }

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

    public static void tampil() {
        System.out.println("Menampilkan Data Stack Keseluruhan : ");
        susunan.displayStack();
    }

    public static void hapus() {
        susunan.clear();
        System.out.println("Data Stack berhasil dikosongkan");
    }

    public static void keluar() {
        susunan.clear();
        System.out.println("Terima Kasih, Semoga Harimu Menyenangkan !");
        System.exit(0);
    }
}
