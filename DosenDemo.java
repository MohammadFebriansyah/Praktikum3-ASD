import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen[] arrayOfDosen = new Dosen[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            String jenisKelaminInput;
            boolean jenisKelamin = false; 
            while (true) {
                System.out.print("Jenis Kelamin : ");
                jenisKelaminInput = sc.nextLine().trim().toLowerCase();
                if (jenisKelaminInput.equals("wanita")) {
                    jenisKelamin = true; 
                    break;
                } else if (jenisKelaminInput.equals("pria")) {
                    jenisKelamin = false; 
                    break;
                } else {
                    System.out.println("Input tidak valid! Harap masukkan 'Pria' atau 'Wanita'.");
                }
            }

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine(); 
            System.out.println("-----------------------------------------");
            arrayOfDosen[i] = new Dosen(kode, nama, jenisKelamin, usia);
        }

            DataDosen.dataSemuaDosen(arrayOfDosen);
            DataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
            DataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
            DataDosen.infoDosenPalingTua(arrayOfDosen);
            DataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
