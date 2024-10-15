import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        double[] nilaiSiswa = new double[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilaiSiswa[i] = scanner.nextDouble();
        }

        double rataRata = hitungRataRata(nilaiSiswa);

        System.out.println("Rata-rata nilai siswa adalah: " + rataRata);
    }

    public static double hitungRataRata(double[] nilaiSiswa) {
        double sum = 0;
        for (double nilai : nilaiSiswa) {
            sum += nilai;
        }
        return sum / nilaiSiswa.length;
    }
}