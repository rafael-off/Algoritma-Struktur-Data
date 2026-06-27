package praktikum2;

public class DosenMain21 {
    public static void main(String[] args) {
        Dosen21 dsn1 = new Dosen21();
        dsn1.idDosen = "D001";
        dsn1.nama = "Budi Susanto, S.Kom., M.Kom.";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Kecerdasan Buatan";

        System.out.println("--- Informasi Dosen 1 ---");
        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Machine Learning");
        
        int masaKerjaDsn1 = dsn1.hitungMasaKerja(2026);
        System.out.println("Masa Kerja " + dsn1.nama + " : " + masaKerjaDsn1 + " tahun.");
        System.out.println();

        Dosen21 dsn2 = new Dosen21("D002", "Siti Aminah, Ph.D.", true, 2010, "Rekayasa Perangkat Lunak");
        
        System.out.println("--- Informasi Dosen 2 ---");
        dsn2.tampilInformasi();
        
        int masaKerjaDsn2 = dsn2.hitungMasaKerja(2026);
        System.out.println("Masa Kerja " + dsn2.nama + " : " + masaKerjaDsn2 + " tahun.");
    }
}