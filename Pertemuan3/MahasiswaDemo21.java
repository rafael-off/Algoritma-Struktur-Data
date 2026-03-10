package Pertemuan3;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Mahasiswa21[] arrayOfMahasiswa21 = new Mahasiswa21[3];
        arrayOfMahasiswa21[0] = new Mahasiswa21();
        arrayOfMahasiswa21[0].nim = "244107060033";
        arrayOfMahasiswa21[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa21[0].kelas = "SIB-1E";
        arrayOfMahasiswa21[0].ipk = (float) 3.75;

        arrayOfMahasiswa21[1] = new Mahasiswa21();
        arrayOfMahasiswa21[1].nim = "2341720172";
        arrayOfMahasiswa21[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa21[1].kelas = "TI-2A";
        arrayOfMahasiswa21[1].ipk = (float) 3.36;
        
        arrayOfMahasiswa21[2] = new Mahasiswa21();
        arrayOfMahasiswa21[2].nim = "244107023006";
        arrayOfMahasiswa21[2].nama = "DIRHAMWAN PUTRANTO";
        arrayOfMahasiswa21[2].kelas = "TI-2E";
        arrayOfMahasiswa21[2].ipk = (float) 3.80;
        
        System.out.println("NIM   : " + arrayOfMahasiswa21[0].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa21[0].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa21[0].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa21[0].ipk);
        System.out.println("-----------------------------------");
        System.out.println("NIM   : " + arrayOfMahasiswa21[1].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa21[1].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa21[1].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa21[1].ipk);
        System.out.println("-----------------------------------");
        System.out.println("NIM   : " + arrayOfMahasiswa21[2].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa21[2].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa21[2].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa21[2].ipk);
        System.out.println("-----------------------------------");
    }
}
