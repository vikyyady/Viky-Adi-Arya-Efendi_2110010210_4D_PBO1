package pbo;

//inheritance
public class PesananExpressLaundry extends PesananLaundry {
    public PesananExpressLaundry(String namaPelanggan, double beratBarang) {
        super(namaPelanggan, beratBarang);
    }

    // 9. Polymorphism
    @Override
    public double hitungHarga() {
        double hargaDasar = super.hitungHarga();
        double biayaExpress = 5000;
        return hargaDasar + biayaExpress;
    }
}
