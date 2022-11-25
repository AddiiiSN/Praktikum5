public class Programmer extends Pegawai{
    private Double bonus;

    public void setBonus(Double bonus){
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public void cetakInfoPogrammer(){
        System.out.println("Nama Pegawai: " + getNama());
        System.out.println("Gaji Pokok  : Rp. " + getGajiPokok());
        System.out.println("Bonus       : Ro. " + getBonus());
    }

    public static void main(String[] args){
        Programmer programmer1 = new Programmer();

        programmer1.setNama("Riko");
        programmer1.setGajiPokok(5000000.00);
        programmer1.setBonus(5000000.00);

        programmer1.cetakInfoPogrammer();
    }
}
