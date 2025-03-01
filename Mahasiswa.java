public class Mahasiswa {

    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

public void cetakInfo(int urutan) {
    System.out.println("Data Mahasiswa ke-" + urutan);
    System.out.println("NIM    : " + nim);
    System.out.println("Nama   : " + nama);
    System.out.println("Kelas  : " + kelas);
    System.out.println("IPK    : " + ipk);
    System.out.println("-----------------------------");
}
}