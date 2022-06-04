package Quiz2;

public class Quiz_2 {
    Quiz_2 head;
    int size;
    int nomor;
    String nama;
    Quiz_2 prev, next;
    public String nomorHp;

    Quiz_2(Quiz_2 prev, int nomor, String nama, int nomerHp, Quiz_2 next) {
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}