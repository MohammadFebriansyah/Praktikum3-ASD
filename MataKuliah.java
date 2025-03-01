public class MataKuliah { 
    public String kode; 
    public String nama; 
    public int sks; 
    public int jumlahJam; 

public MataKuliah (String kode, String nama, int sks, int jumlahJam) { 
    this.kode = kode; 
    this.nama = nama; 
    this.sks = sks; 
    this.jumlahJam = jumlahJam; 
    }

public void tambahData(String kode, String nama, int sks, int jumlahJam) {
    this.kode = kode;
    this.nama = nama;
    this.sks = sks;
    this.jumlahJam = jumlahJam;
    }

public void cetakInfo(int urutan) {
    System.out.println("Data MataKuliah ke-"+urutan);
    System.out.println("Kode : " + kode);
    System.out.println("Nama : " + nama);
    System.out.println("Sks : " + sks);
    System.out.println("Jumlah Jam : " + jumlahJam);
    System.out.println("-------------------------------");
    }
}