import java.util.Scanner;
public class Bioskop16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiketTerjual = 0;
        double totalPenjualanHarga = 0;
        double hargaTiket = 50000;

        System.out.println("=== Program Kasir Bioskop ===");
        System.out.println("Ketik '0' atau jumlah negatif untuk mengakhiri transaksi hari ini.\n");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan (0 untuk selesai): ");
            int jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                break;
            }

            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan angka positif.\n");
                continue;
            }

            double hargaTotal = jmlTiket * hargaTiket;
            double diskon = 0;

            if (jmlTiket > 10) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.10;
            }

            double totalBayar = hargaTotal - (hargaTotal * diskon);

            totalTiketTerjual += jmlTiket;
            totalPenjualanHarga += totalBayar;

            System.out.println("-> Tiket dibeli: " + jmlTiket);
            if (diskon > 0) {
                System.out.println("-> Mendapat diskon: " + (diskon * 100) + "%");
            }
            System.out.println("-> Total bayar pelanggan: Rp " + totalBayar + "\n");
        }

        System.out.println("\n========================================");
        System.out.println("       REKAPITULASI PENJUALAN HARI INI     ");
        System.out.println("========================================");
        System.out.println("Total seluruh tiket terjual : " + totalTiketTerjual + " tiket");
        System.out.println("Total pendapatan kotor/bersih: Rp " + totalPenjualanHarga);
        System.out.println("========================================");

        sc.close();
    }
}