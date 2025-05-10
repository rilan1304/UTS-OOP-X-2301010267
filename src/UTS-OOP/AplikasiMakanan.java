package UTS;

/**
 *
 * @author MAria Apriliani Lanus
 * NIM: 23010267
 * Tgl 7/05/2025
 */
import java.util.Scanner;

public class AplikasiMakanan {
    private static final Makanan[] makananArray = new Makanan[10];
    private static int arrayIndex = 0;
    private static Makanan[] Makanan;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Aplikasi Pencatatan Makanan");
            System.out.println("==============================");
            
            System.out.println("Menu:");
            System.out.println("1. Input Data Makanan");
            System.out.println("2. Menampilkan Data Makanan");
            System.out.println("3. Mengubah Data Makanan");
            System.out.println("4. Menghapus Data Makanan");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputDataMakanan(scanner);
                    break;
                case 2:
                    menampilkanData();
                    break;
                case 3:
                    mengubahData(scanner);
                    break;
                case 4:
                    menghapusData(scanner);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        }
    }

    private static void inputDataMakanan(Scanner scanner) {
        System.out.print("Masukkan kode makanan: ");
        String kode = scanner.next();
        System.out.print("Masukkan nama makanan: ");
        String nama = scanner.next();

        Makanan makanan = new Makanan(kode, nama);
        makananArray[arrayIndex] = makanan;
        arrayIndex++;

        System.out.println("Data berhasil disimpan");
    }

    private static void menampilkanData() {
        for (int i = 0; i < arrayIndex; i++) {
            Makanan makanan = makananArray[i];
            System.out.println("Kode makanan: " + makanan.getKode() + ", Nama makanan: " + makanan.getNama());
        }
    }

    private static void mengubahData(Scanner scanner) {
        System.out.print("Masukkan kode makanan yang ingin diubah: ");
        String kode = scanner.next();

        for (int i = 0; i < arrayIndex; i++) {
            Makanan makanan = makananArray[i];
            if (makanan.getKode().equals(kode)) {
                System.out.print("Masukkan nama makanan baru: ");
                String nama = scanner.next();
                makanan.setNama(nama);
                System.out.println("Data makanan berhasil diubah");
                return;
            } else {
            }
        }

        System.out.println("Data tidak ditemukan");
    }

    private static void menghapusData(Scanner scanner) {
        System.out.print("Masukkan kode makanan yang ingin dihapus: ");
        String kode = scanner.next();

        for (int i = 0; i < arrayIndex; i++) {
            Makanan makanan = Makanan[i];
            if (makanan.getKode().equals(kode)) {
                for (int j = i; j < arrayIndex - 1; j++) {
                    makananArray[j] = makananArray[j + 1];
                }
                arrayIndex--;
                System.out.println("Data makanan berhasil dihapus");
                return;
            }
        }

        System.out.println("Data tidak ditemukan");
    }

    
}