public class Programmer extends Pegawai{
    private Double bonus;

    public void setBonus(Double bonus){
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public Programmer(String nama, double gaji){
        this.setNama(nama);
        this.setGajiPokok(gaji);
    }

    public Programmer(String nama, double gaji, double bonus){
        this.setNama(nama);
        this.setGajiPokok(gaji);
        this.setBonus(bonus);
    }

    public void cetakInfo(){
        System.out.println("Nama Pegawai: " + getNama());
        System.out.println("Gaji Pokok  : Rp. " + getGajiPokok());
        System.out.println("Bonus       : Rp. " + getBonus());
        System.out.println(" ");
    }

    public static void main(String[] args){
        Programmer programmer1 = new Programmer("Riko", 7000000);
        Programmer programmer2 = new Programmer("Anton", 7000000, 4000000);

        System.out.println("Data Programmer: \n");
        programmer1.cetakInfo();
        programmer2.cetakInfo();
    }
}
