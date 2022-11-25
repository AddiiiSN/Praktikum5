public class Manager extends Pegawai {
    private Double tunjangan;

    public void setTunjangan(Double tunjangan){
        this.tunjangan = tunjangan;
    }
    public Double getTunjangan(){
        return this.tunjangan;
    }

    public Manager(String nama, double gaji){
        this.setNama(nama);
        this.setGajiPokok(gaji);
    }

    public Manager(String nama, double gaji, double tunjangan){
        this.setNama(nama);
        this.setGajiPokok(gaji);
        this.setTunjangan(tunjangan);
    }


    public void cetakInfo(){
        System.out.println("Nama Pegawai: " + getNama());
        System.out.println("Gaji Pokok  : Rp. " + getGajiPokok());
        System.out.println("Tunjangan   : Rp. " + getTunjangan());
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Manager managerProd = new Manager("Bambang", 8000000);
        Manager managerHRGA = new Manager("Udin", 8000000, 5000000);

        System.out.println("Data Manager: \n");
        managerProd.cetakInfo();
        managerHRGA.cetakInfo();
    }
}