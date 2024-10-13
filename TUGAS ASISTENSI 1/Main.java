import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Storable inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nPilih operasi:");
            System.out.println("1. Tambah Item");
            System.out.println("2. Hapus Item");
            System.out.println("3. Tampilkan Inventaris");
            System.out.println("4. Cari Item Berdasarkan Nama");
            System.out.println("5. Tampilkan Item Terlaris");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            
            int pilihan = getIntegerInput(scanner);
            scanner.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama item: ");
                    String itemTambah = scanner.nextLine();
                    System.out.print("Masukkan jumlah: ");
                    int jumlah = getIntegerInput(scanner);
                    inventory.tambahItem(itemTambah, jumlah);
                    break;
                case 2:
                    System.out.print("Masukkan nama item yang akan dihapus: ");
                    String itemHapus = scanner.nextLine();
                    inventory.hapusItem(itemHapus);
                    break;
                case 3:
                    inventory.tampilkanItem();
                    break;
                case 4:
                    System.out.print("Masukkan nama item yang ingin dicari: ");
                    String namaItem = scanner.nextLine();
                    ((Inventory) inventory).cariItemBerdasarkanNama(namaItem);
                    break;
                case 5:
                    ((Inventory) inventory).tampilkanItemTerlaris();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static int getIntegerInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Input tidak valid. Masukkan angka integer: ");
                scanner.next();
            }
        }
    }
}
