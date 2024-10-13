import java.util.HashMap;
import java.util.Map;

public class Inventory implements Storable {
    private Map<String, Integer> itemMap;
    private Map<String, String> genreMap;
    private int totalItem;

    public Inventory() {
        itemMap = new HashMap<>();
        genreMap = new HashMap<>();
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
    public void tambahItem(String item, int jumlah, String genre) {
        int jumlahBaru = itemMap.getOrDefault(item, 0) + jumlah;
        itemMap.put(item, jumlahBaru);
        genreMap.put(item, genre);
        totalItem += jumlah;
        System.out.println(jumlah + " " + item + " dengan genre " + genre + " telah ditambahkan. Total " + item + " sekarang: " + jumlahBaru);
    }

    @Override
    public void hapusItem(String item) {
        if (itemMap.containsKey(item)) {
            int jumlah = itemMap.get(item);
            itemMap.remove(item);
            genreMap.remove(item);
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
                String genre = genreMap.get(entry.getKey()); // Ambil genre untuk item
                System.out.println(entry.getKey() + " (Genre: " + genre + "): " + entry.getValue());
            }
            System.out.println("Total item: " + totalItem);
        }
    }

    public void cariItemBerdasarkanNama(String nama) {
        if (itemMap.containsKey(nama)) {
            int jumlah = itemMap.get(nama);
            String genre = genreMap.get(nama);
            System.out.println(nama + " ditemukan. Jumlah: " + jumlah + " (Genre: " + genre + ")");
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
            String genre = genreMap.get(terlaris); // Ambil genre untuk item terlaris
            System.out.println("Item terlaris: " + terlaris + " (Genre: " + genre + "), Jumlah: " + maxJumlah);
        }
    }
}
