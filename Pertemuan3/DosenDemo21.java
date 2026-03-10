package Pertemuan3;
import java.util.Scanner;

public class DosenDemo21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen21[] arrayOfDosen = new Dosen21[3]; // Membuat array untuk 3 dosen
        
        String kode, nama, jenisKelaminString;
        int usia;
        boolean jenisKelamin;

        // Looping FOR untuk input data
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jenisKelaminString = sc.nextLine();
            
            // Konversi String input menjadi Boolean
            if (jenisKelaminString.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }

            System.out.print("Usia          : ");
            usia = Integer.parseInt(sc.nextLine());
            System.out.println("-----------------------------------");

            // Instansiasi objek menggunakan konstruktor
            arrayOfDosen[i] = new Dosen21(kode, nama, jenisKelamin, usia);
        }

        System.out.println();

        // Looping FOREACH untuk menampilkan data
        for (Dosen21 d : arrayOfDosen) {
            System.out.println("Data Dosen");
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            
            // Menampilkan string berdasarkan nilai boolean
            String jk = (d.jenisKelamin) ? "Pria" : "Wanita"; 
            System.out.println("Jenis Kelamin : " + jk);
            System.out.println("Usia          : " + d.usia);
            System.out.println("-----------------------------------");
        }
        
        // Memanggil/mengetes method dari class DataDosen (Tugas 2)
        System.out.println("\n=== PENGUJIAN CLASS DataDosen ===");
        DataDosen21.dataSemuaDosen(arrayOfDosen);
        DataDosen21.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen21.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen21.infoDosenPalingTua(arrayOfDosen);
        DataDosen21.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}

