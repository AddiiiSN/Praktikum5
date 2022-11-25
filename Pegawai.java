public class Pegawai {

    private String nama;
    private Double gajiPokok;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setGajiPokok(Double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public Double getGajiPokok() {
        return this.gajiPokok;
    }

    public Pegawai(String nama, double gaji){
        this.setNama(nama);
        this.setGajiPokok(gaji);
    }

    public void cetakInfo() {
        System.out.println("Nama Pegawai: " + getNama());
        System.out.println("Gaji Pokok : " + getGajiPokok());
    }
}
