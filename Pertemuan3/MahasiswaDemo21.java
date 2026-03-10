package Pertemuan3;

import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Mahasiswa21[] arrayOfMahasiswa21 = new Mahasiswa21[3];
        String dummy;
        
        for(int i = 0; i < 3; i++) {
            arrayOfMahasiswa21[i] = new Mahasiswa21();
            
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa21[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa21[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa21[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa21[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");
        }
        for(int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM   : " + arrayOfMahasiswa21[i].nim);
            System.out.println("Nama  : " + arrayOfMahasiswa21[i].nama);
            System.out.println("Kelas : " + arrayOfMahasiswa21[i].kelas);
            System.out.println("IPK   : " + arrayOfMahasiswa21[i].ipk);
            System.out.println("-----------------------------");
        }
    }
}
