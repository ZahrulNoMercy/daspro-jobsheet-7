import java.util.Scanner;
public class Parkir16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi jam parkir: ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid! Masukkan 1, 2, atau 0.");
            }

            System.out.println();
        } while (jenis != 0);

        System.out.println("----------------------------------------");
        System.out.println("Total pembayaran parkir keseluruhan: Rp " + total);
        System.out.println("----------------------------------------");

        sc.close();
    }
}