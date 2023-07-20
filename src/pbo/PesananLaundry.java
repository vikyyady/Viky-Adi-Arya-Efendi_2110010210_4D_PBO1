package pbo;

public class PesananLaundry {
    // 3. Atribut dan Encapsulation
    private String namaPelanggan;
    private double beratBarang;

    // 4. Constructor
    public PesananLaundry(String namaPelanggan, double beratBarang) {
        this.namaPelanggan = namaPelanggan;
        this.beratBarang = beratBarang;
    }

    // 5. Mutator
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public void setBeratBarang(double beratBarang) {
        this.beratBarang = beratBarang;
    }

    // 6. Accessor
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public double getBeratBarang() {
        return beratBarang;
    }

    public double hitungHarga() {
        double hargaPerKg = 8000;
        return beratBarang * hargaPerKg;
    }
}
