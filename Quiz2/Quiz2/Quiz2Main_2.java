package Quiz2;

import java.util.Scanner;

class Quiz2Main_2 {

    public static void menu() {
        System.out.println("Menu");
        System.out.println(
                " 1. Tambah Antrian\n 2. Cetak Antrian\n 3. Hapus Antrian\n 4. Laporan pengurutan pesanan by nama\n 5. Hitung total pendapatan\n 6. Keluar\n");
    }

    public static void main(String[] args) {
        System.out.println("========    QUIZ 2 ASD TI - 1G & TI - 1F    ========");
        System.out.println("dibuat oleh : Ahmad Bima Tristan Ibrahim");
        System.out.println("NIM : 2141720077");
        System.out.println("Absen : 2");
        System.out.println("========================================");
        System.out.println("Sistem Antrian Resto Royal Delish \n\n");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        int pilih;
        do {
            menu();
            System.out.print("Pilih(1-5) : ");
            pilih = a.nextInt();
            a.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("-----------------------------------");
                    System.out.print("Nomor Antrian\t: ");
                    System.out.print("Nama Customer\t: ");
                    System.out.print("Nomor Hp\t:");
                    b.nextLine();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}