import java.util.Scanner; 
public class MataKuliahDemo {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah matakuliah: ");
    int jumlahMataKuliah = sc.nextInt();
    sc.nextLine();
    MataKuliah [] arrayOfMatakuliah = new MataKuliah [3]; 
    String kode, nama, dummy; 
    int sks, jumlahJam; 

    for (int i = 0; i < jumlahMataKuliah; i++) {
        System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
        System.out.print("Kode : ");
        kode = sc.nextLine();
        System.out.print("Nama : ");
        nama = sc.nextLine();
        System.out.print("Sks : ");
        sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam : ");
        jumlahJam = Integer.parseInt(sc.nextLine());
        arrayOfMatakuliah[i] = new MataKuliah(kode, nama, sks, jumlahJam);
    }
    System.out.println();
    
    for (int i = 0; i < jumlahMataKuliah; i++) {
        arrayOfMatakuliah[i].cetakInfo(i+1); 
    }
    }
}