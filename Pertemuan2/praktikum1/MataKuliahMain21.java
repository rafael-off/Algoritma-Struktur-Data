package praktikum1;

public class MataKuliahMain21 {
    public static void main(String[] args) {
        MataKuliah21 mk1 = new MataKuliah21();
        mk1.kodeMK = "ALSD21";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        System.out.println("--- Informasi Objek 1 ---");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        System.out.println("--- Informasi Objek 1 Setelah Update ---");
        mk1.tampilInformasi();

        MataKuliah21 mk2 = new MataKuliah21("BD21", "Basis Data", 2, 4);
        
        System.out.println("--- Informasi Objek 2 ---");
        mk2.tampilInformasi();
        mk2.kurangiJam(6);
    }
}