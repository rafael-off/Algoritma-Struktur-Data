public class DosenMain21 {
    public static void main(String[] args) {
        // Objek 1 - Konstruktor default
        Dosen21 dsn1 = new Dosen21();
        dsn1.idDosen = "R1347";
        dsn1.nama = "Rizky Maulana";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2018;
        dsn1.bidangKeahlian = "Rekayasa Perangkat Lunak";

        dsn1.tampilkanInformasi();
        dsn1.setStatusAktif(false);
        System.out.println("Masa kerja: " + dsn1.hitungMasaKerja(2026) + " tahun");
        dsn1.ubahKeahlian("Aljabar linier");
        System.out.println();

        // Objek 2 - Konstrukktor parameter
        Dosen21 dsn2 = new Dosen21("I1188", "Irwan Kevin", true, 2020, "Desain Antarmuka");
        dsn2.tampilkanInformasi();
        dsn2.setStatusAktif(false);
        System.out.println("Masa kerja: " + dsn2.hitungMasaKerja(2026) + " tahun");
        dsn2.ubahKeahlian("Dasar Pemrograman");

    }
}
