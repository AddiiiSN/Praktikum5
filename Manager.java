public class Manager extends Pegawai {
    private Double tunjangan;

    public void setTunjangan(Double tunjangan){
        this.tunjangan = tunjangan;
    }
    public Double getTunjangan(){
        return this.tunjangan;
    }
    public void cetakInfoManager(){
        System.out.println("Nama Pegawai: " + getNama());
        System.out.println("Gaji Pokok  : Rp. " + getGajiPokok());
        System.out.println("Tunjangan   : Rp. " + getTunjangan());
    }

    public static void main(String[] args) {
        Manager managerProd = new Manager();

        managerProd.setNama("Anton");
        managerProd.setGajiPokok(5000000.00);
        managerProd.setTunjangan(9000000.00);


        managerProd.cetakInfoManager();
    }
}