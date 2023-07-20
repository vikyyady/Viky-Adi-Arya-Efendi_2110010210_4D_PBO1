package pbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 12. Array
        PesananLaundry[] pesanan = new PesananLaundry[2];

        // 11. IO Sederhana dan perulangan
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println("Masukkan nama pelanggan:");
            String namaPelanggan = scanner.nextLine();

            System.out.println("Masukkan berat barang dalam kg:");
            double beratBarang = scanner.nextDouble();
            scanner.nextLine();
            
            // 10. Seleksi
            System.out.println("Apakah ini pesanan express? (ya/tidak):");
            String express = scanner.nextLine();

            if (express.equalsIgnoreCase(""
                    + ""
                    + "ya")) {
                pesanan[i] = new PesananExpressLaundry(namaPelanggan, beratBarang);
            } else {
                pesanan[i] = new PesananLaundry(namaPelanggan, beratBarang);
            }
        }

        System.out.println("Detail pesanan:");
        for (PesananLaundry p : pesanan) {
            System.out.println("Nama Pelanggan: " + p.getNamaPelanggan());
            System.out.println("Berat Barang: " + p.getBeratBarang() + " kg");
            System.out.println("Harga: Rp" + p.hitungHarga());
            System.out.println("------------------------");
        }

    }
}


