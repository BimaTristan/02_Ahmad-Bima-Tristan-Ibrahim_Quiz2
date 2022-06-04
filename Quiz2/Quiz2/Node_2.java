package Quiz2;

public class Node_2 {
    String nama, makanan;
    int nomor, nomorHp, harga;
    Node_2 prev, next;

    Node_2(Node_2 prev, int nomor, int nomorHp, int harga, String nama, String makanan, Node_2 next) {
        this.prev = prev;
        this.nama = nama;
        this.makanan = makanan;
        this.nomor = nomor;
        this.hp = hp;
        this.next = next;
    }

    public Node_2(Node_2 current, String nama2, int nomor2, Object object) {
    }
}
