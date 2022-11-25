# ORIENTED OBJECT PROGRAMMING
## Praktikum 5


### Superclass Pegawai
Membuat Class Pegawai Sebagai Superclass 
dan menambahkan atribut nama serta gaji pokok

      public class Pegawai {

          private String nama;
          private Double gajiPokok;


Membuat setter & getter untuk atribut yang di-private

      public void setNama(String nama){
          this.nama = nama;
      }
      public String getNama(){
          return this.nama;
      }
      public void setGajiPokok(Double gajiPokok){
          this.gajiPokok=gajiPokok;
      }
      public Double getGajiPokok(){
          return this.gajiPokok;
      }


Method cetakInfo digunakan untuk menampilkan data nama pegawai dan gaji pokok.

          public void cetakInfo(){
              System.out.println("Nama Pegawai: " + getNama());
              System.out.println("Gaji Pokok : " + getGajiPokok());
          }
      }
    
### Subclasss manager 

          public class Manager extends Pegawai {
        private Double tunjangan;

        public void setTunjangan(Double tunjangan){
            this.tunjangan = tunjangan;
        }
        public Double getTunjangan(){
            return this.tunjangan;
        }
        
        //Membuat constructor dengan parameter untuk class Manager
        public Manager(String nama, double gaji){
            this.setNama(nama);
            this.setGajiPokok(gaji);
        }

        public Manager(String nama, double gaji, double tunjangan){
            this.setNama(nama);
            this.setGajiPokok(gaji);
            this.setTunjangan(tunjangan);
        }

        
        //override
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
            //overload
            managerProd.cetakInfo();
            managerHRGA.cetakInfo();
        }
    }
![Screenshot (6)](https://user-images.githubusercontent.com/115928747/204056028-3dc2d342-3f8f-4e17-acac-2555342bdbbb.png)


### Subclass Programmer
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
![Screenshot (2)](https://user-images.githubusercontent.com/115928747/204056098-1f7e1b6b-7e63-47de-8aad-5e6e84b4752c.png)

