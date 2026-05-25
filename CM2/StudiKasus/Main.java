package StudiKasus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DLLAntrian antrianList = new DLLAntrian();
        DLLPesanan pesananList = new DLLPesanan();
        
        int pilihan;

        do {
            System.out.println("\n=================================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=================================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer (newline) setelah nextInt()

            switch (pilihan) {
                case 1:
                    // Meminta input secara manual sesuai instruksi
                    System.out.print("Nama Pembeli : ");
                    String nama = scanner.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = scanner.nextLine();
                    
                    // Memasukkan input ke dalam Konstruktor
                    Pembeli p = new Pembeli(nama, noHp);
                    
                    // Menambahkan ke linked list (Nomor antrean otomatis di dalam method ini)
                    antrianList.tambahAntrian(p);
                    break;

                case 2:
                    antrianList.cetakAntrian();
                    break;

                case 3:
                    System.out.print("Masukkan No Antrean yang akan dipanggil/dihapus : ");
                    int targetAntrian = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer
                    
                    // Proses searching dan menghapus antrean
                    NodeAntrian dipanggil = antrianList.hapusAntrianByNomor(targetAntrian);
                    
                    if (dipanggil != null) {
                        System.out.println("\n-- Input Pesanan untuk " + dipanggil.pembeli.namaPembeli + " --");
                        System.out.print("Kode Pesanan : ");
                        int kode = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan buffer
                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = scanner.nextLine();
                        System.out.print("Harga        : ");
                        int harga = scanner.nextInt();
                        
                        // Memasukkan input pesanan ke dalam Konstruktor
                        Pesanan pesananBaru = new Pesanan(kode, namaPesanan, harga);
                        pesananList.tambahPesanan(pesananBaru);
                        
                        System.out.println("Pesanan berhasil dicatat!");
                    } else {
                        System.out.println("Gagal memanggil. Nomor antrean tidak ditemukan dalam daftar.");
                    }
                    break;

                case 4:
                    pesananList.cetakLaporanPesanan();
                    break;

                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        
        scanner.close();
    }
}