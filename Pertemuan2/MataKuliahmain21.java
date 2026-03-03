public class MataKuliahmain21 {
    public static void main(String[] args) {
        // Objek 1 - Konstruktor default
        MataKuliah21 mk1 = new MataKuliah21();
        mk1.kodeMK = "TIH512";
        mk1.nama = "Dasar Pemrograman";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(3);
        mk1.kurangJam(3);
        System.out.println();

        // Objek 2 - Konstruktor parameter
        MataKuliah21 mk2 = new MataKuliah21("KPD889", "Rekayasa Perangkat Lunak", 7, 3);

        mk2.tampilkanInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(2);
        mk2.kurangJam(5);
    }
}
