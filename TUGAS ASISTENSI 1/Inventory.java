import java.util.HashMap;
import java.util.Map;

public class Inventory implements Storable {
    private Map<String, Integer> itemMap;
    private int totalItem;

    public Inventory() {
        itemMap = new HashMap<>();
        totalItem = 0;
    }

    @Override
    public void tambahItem(String item, int jumlah) {
        int jumlahBaru = itemMap.getOrDefault(item, 0) + jumlah;
        itemMap.put(item, jumlahBaru);
        totalItem += jumlah;
        System.out.println(jumlah + " " + item + " telah ditambahkan. Total " + item + " sekarang: " + jumlahBaru);
    }

    @Override
    public void hapusItem(String item) {
        if (itemMap.containsKey(item)) {
            int jumlah = itemMap.get(item);
            itemMap.remove(item);
            totalItem -= jumlah;
            System.out.println(item + " telah dihapus dari inventaris.");
        } else {
            System.out.println(item + " tidak ditemukan dalam inventaris.");
        }
    }

    @Override
    public void tampilkanItem() {
        if (itemMap.isEmpty()) {
            System.out.println("Inventaris kosong.");
        } else {
            System.out.println("Inventaris Music Record Store:");
            for (Map.Entry<String, Integer> entry : itemMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("Total item: " + totalItem);
        }
    }

    public void cariItemBerdasarkanNama(String nama) {
        if (itemMap.containsKey(nama)) {
            int jumlah = itemMap.get(nama);
            System.out.println(nama + " ditemukan. Jumlah: " + jumlah);
        } else {
            System.out.println(nama + " tidak ditemukan dalam inventaris.");
        }
    }

    public void tampilkanItemTerlaris() {
        if (itemMap.isEmpty()) {
            System.out.println("Inventaris kosong.");
            return;
        }
        String terlaris = null;
        int maxJumlah = 0;
        for (Map.Entry<String, Integer> entry : itemMap.entrySet()) {
            if (entry.getValue() > maxJumlah) {
                terlaris = entry.getKey();
                maxJumlah = entry.getValue();
            }
        }
        if (terlaris != null) {
            System.out.println("Item terlaris: " + terlaris + ", Jumlah: " + maxJumlah);
        }
    }
}
