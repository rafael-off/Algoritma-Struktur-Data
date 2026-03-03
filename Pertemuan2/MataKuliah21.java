public class MataKuliah21 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah21() {

    }

    public MataKuliah21(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    
    void tampilkanInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }
    
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi " + sks);
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam setelah ditambah: " + jumlahJam);
    }
    
    void kurangJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan jam tidak dapat dilakukan, jam tidak mencukupi!");
        } else {
            jumlahJam = jumlahJam - jam;
            System.out.println("Jumlah jam setelah dikurangi: " + jumlahJam);
        }
    }
}