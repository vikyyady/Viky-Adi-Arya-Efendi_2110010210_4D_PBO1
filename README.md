# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Jasa Laundry menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama Pelanggan dan berat Barang, dan memberikan output berupa informasi nama pelanggan, berat barang, dan harga barang.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, dan Array.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `PesananLaundry`, `PesananExpressLaundry`, dan `Main` adalah contoh dari class.

```bash
public class PesananLaundry {
    ...
}

public class PesananExpressLaundry extends PesananLaundry {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `PesananLaundry[] pesanan = new PesananLaundry[2];` adalah contoh pembuatan object.

```bash
PesananLaundry[] pesanan = new PesananLaundry[2];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaPelanggan` dan `beratBarang` adalah contoh atribut.

```bash
String namaPelanggan;
String beratBarang;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `PesananLaundry` dan `PesananExpressLaundry`.

```bash
public PesananLaundry(String namaPelanggan, double beratBarang) {
        this.namaPelanggan = namaPelanggan;
        this.beratBarang = beratBarang;
    }

public PesananExpressLaundry(String namaPelanggan, double beratBarang) {
        super(namaPelanggan, beratBarang);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaPelanggan` dan `setBeratBarang` adalah contoh method mutator.

```bash
public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

public void setBeratBarang(double beratBarang) {
        this.beratBarang = beratBarang;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaPelanggan`,dan `getBeratBarang` adalah contoh method accessor.

```bash
public String getNamaPelanggan() {
        return namaPelanggan;
    }

public double getBeratBarang() {
        return beratBarang;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaPelanggan` dan `beratBarang` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namaPelanggan;
private double beratBarang;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PesananExpressLaundry` mewarisi `PesananLaundry` dengan sintaks `extends`.

```bash
public class PesananExpressLaundry extends PesananLaundry {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding.Pada kode ini, method hitungHarga() pada class PesananExpressLaundry merupakan overriding dari method hitungHarga() yang ada pada class induknya yaitu PesananLaundry. Dengan kata lain, method hitungHarga() pada class PesananExpressLaundry memiliki implementasi yang berbeda dari method hitungHarga() pada class PesananLaundry.

```bash
@Override
public double hitungHarga() {
        double hargaDasar = super.hitungHarga();
        double biayaExpress = 5000;
        return hargaDasar + biayaExpress;
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Penggunaan seleksi ini memungkinkan program untuk membuat objek PesananLaundry atau PesananExpressLaundry sesuai dengan pilihan pengguna. Jadi, berdasarkan input "ya" atau "tidak" yang diberikan oleh pengguna, program akan membuat objek yang sesuai dengan pesanan express atau tidak.

```bash
System.out.println("Apakah ini pesanan express? (ya/tidak):");
            String express = scanner.nextLine();

            if (express.equalsIgnoreCase(""
                    + ""
                    + "ya")) {
                pesanan[i] = new PesananExpressLaundry(namaPelanggan, beratBarang);
            } else {
                pesanan[i] = new PesananLaundry(namaPelanggan, beratBarang);
            }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk mengulangi serangkaian instruksi yang terdapat di dalam blok for tersebut.

```bash
for (int i = 0; i < pesanan.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
            Scanner scanner = new Scanner(System.in);

            System.out.println("Masukkan nama pelanggan:");
            String namaPelanggan = scanner.nextLine();

            System.out.println("Masukkan berat barang dalam kg:");
            double beratBarang = scanner.nextDouble();
            scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PesananLaundry[] pesanan = new PesananLaundry[2];` adalah contoh penggunaan array.

```bash
PesananLaundry[] pesanan = new PesananLaundry[2];
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
|     | **TOTAL**      | **85** |

## Pembuat

Nama: Viky Adi Arya Efendi
NPM: 2110010210
