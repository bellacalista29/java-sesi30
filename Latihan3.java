import java.text.NumberFormat;
import java.util.Locale;

public class Latihan3 {
    public static void main(String[] args) {
        double pembelian = 1000000;
        double diskon = 0.1;
        double hargaBayar;
        hargaBayar = pembelian - (pembelian*diskon);
        
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in","ID"));
        System.out.println("Pembelian = Rp. " + nf.format(pembelian) + ",-");
        System.out.println("Diskon = 10%");
        System.out.println("Harga bayar = Rp. " + nf.format(hargaBayar));
    }
}
