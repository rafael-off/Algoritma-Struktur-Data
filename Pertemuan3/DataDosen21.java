package Pertemuan3;

public class DataDosen21{

    // a. Menampilkan data semua dosen
    public static void dataSemuaDosen(Dosen21[] arrayOfDosen) {
        System.out.println("--- DATA SEMUA DOSEN ---");
        for (Dosen21 d : arrayOfDosen) {
            System.out.println("Kode: " + d.kode + ", Nama: " + d.nama + ", Usia: " + d.usia);
        }
        System.out.println();
    }

    // b. Menampilkan jumlah dosen per jenis kelamin
    public static void jumlahDosenPerJenisKelamin(Dosen21[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen21 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("--- JUMLAH DOSEN PER JENIS KELAMIN ---");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
        System.out.println();
    }

    // c. Menampilkan rata-rata usia dosen per jenis kelamin
    public static void rerataUsiaDosenPerJenisKelamin(Dosen21[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int hitungPria = 0, hitungWanita = 0;

        for (Dosen21 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                hitungPria++;
            } else {
                totalUsiaWanita += d.usia;
                hitungWanita++;
            }
        }

        System.out.println("--- RATA-RATA USIA DOSEN ---");
        if (hitungPria > 0) System.out.println("Pria   : " + (totalUsiaPria / hitungPria));
        if (hitungWanita > 0) System.out.println("Wanita : " + (totalUsiaWanita / hitungWanita));
        System.out.println();
    }

    // d. Menampilkan data dosen paling tua
    public static void infoDosenPalingTua(Dosen21[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        
        Dosen21 tertua = arrayOfDosen[0]; // Asumsikan elemen pertama paling tua
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > tertua.usia) {
                tertua = arrayOfDosen[i]; // Ganti jika ada yang lebih besar
            }
        }
        System.out.println("--- DOSEN PALING TUA ---");
        System.out.println("Nama: " + tertua.nama + ", Usia: " + tertua.usia);
        System.out.println();
    }

    // e. Menampilkan data dosen paling muda
    public static void infoDosenPalingMuda(Dosen21[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen21 termuda = arrayOfDosen[0]; // Asumsikan elemen pertama paling muda
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < termuda.usia) {
                termuda = arrayOfDosen[i]; // Ganti jika ada yang lebih kecil
            }
        }
        System.out.println("--- DOSEN PALING MUDA ---");
        System.out.println("Nama: " + termuda.nama + ", Usia: " + termuda.usia);
        System.out.println();
    }
}