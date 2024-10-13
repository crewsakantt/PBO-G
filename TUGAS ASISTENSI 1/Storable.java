public interface Storable {
    void tambahItem(String item, int jumlah);
    void tambahItem(String item, int jumlah, String genre);
    void hapusItem(String item);
    void tampilkanItem();
}
