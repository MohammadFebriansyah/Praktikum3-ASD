public class DataDosen {

    public static void dataSemuaDosen(Dosen[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode Dosen    : " + arrayOfDosen[i].kode);
            System.out.println("Nama Dosen    : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin : " + (arrayOfDosen[i].jenisKelamin ? "Wanita" : "Pria"));
            System.out.println("Usia          : " + arrayOfDosen[i].usia);
            System.out.println("-----------------------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int jumlahPria = 0, jumlahWanita = 0;
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahWanita++;
            } else {
                jumlahPria++;
            }
        }
        System.out.println("Jumlah Dosen Pria : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita : " + jumlahWanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalWanita += dosen.usia;
                countWanita++;
            } else {
                totalPria += dosen.usia;
                countPria++;
            }
        }

        double rataPria = countPria > 0 ? (double) totalPria / countPria : 0;
        double rataWanita = countWanita > 0 ? (double) totalWanita / countWanita : 0;

        System.out.println("Rata-rata Usia Dosen Pria : " + rataPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rataWanita);
    }

    public static void infoDosenPalingTua(Dosen[] arrayOfDosen) {
        Dosen dosenTua = arrayOfDosen[0];
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        System.out.println("Kode Dosen    : " + dosenTua.kode);
        System.out.println("Nama Dosen    : " + dosenTua.nama);
        System.out.println("Jenis Kelamin : " + (dosenTua.jenisKelamin ? "Wanita" : "Pria"));
        System.out.println("Usia          : " + dosenTua.usia);
        System.out.println("-----------------------------------------");
    }

    public static void infoDosenPalingMuda(Dosen[] arrayOfDosen) {
        Dosen dosenMuda = arrayOfDosen[0];
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        System.out.println("Kode Dosen    : " + dosenMuda.kode);
        System.out.println("Nama Dosen    : " + dosenMuda.nama);
        System.out.println("Jenis Kelamin : " + (dosenMuda.jenisKelamin ? "Wanita" : "Pria"));
        System.out.println("Usia          : " + dosenMuda.usia);
        System.out.println("-----------------------------------------");
    }
}
