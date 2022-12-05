import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        listBarang list[] = new listBarang[5];
        list[0] = new listBarang(1, "Mouse Bluetooth 5.0", 149999, 0.1);
        list[1] = new listBarang(2, "Headphone Eksternal", 246000, 0.05);
        list[2] = new listBarang(3, "Powerbank 10.000 mAh", 136000, 0);
        list[3] = new listBarang(4, "Tripod Kamera", 267999, 0.2);
        list[4] = new listBarang(5, "Smart Watch Xiomi", 899000, 0.1);

        int kodeInput;
        int quantity; 
        int jumlahBeli;
        double sum = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("PROGRAM JAVA TENTANG PENJUALAN BARANG");
        System.out.print("Masukkan jumlah beli : ");
        jumlahBeli = in.nextInt();

        int listBeli[] = new int[jumlahBeli];
        int listQty[] = new int[jumlahBeli];

        for(int i=0; i<=jumlahBeli-1; i++)
        {
            System.out.print("Masukkan kode barang ke-" + (i+1) + " : ");
            kodeInput = in.nextInt();
            listBeli[i] = kodeInput;

            System.out.print("Masukkan qty ke-" + (i+1) + " : ");
            quantity = in.nextInt();
            listQty[i] = quantity;
        }
        list[0].displayHeader();

        for(int i=0; i<listBeli.length; i++)
        {
            list[listBeli[i]-1].inputQuantity(listQty[i]);
            list[listBeli[i]-1].display();
            sum += list[listBeli[i]-1].subtotal;
        }
        Locale localeID = new Locale("in", "ID");
        NumberFormat nf = NumberFormat.getCurrencyInstance(localeID);
        System.out.println("Total Bayar : " + nf.format(sum));
        
    }    
}

class listBarang {
    public int kodeBarang;
    public String namaBarang;
    public double harga;
    public double diskon;
    public int quantity;
    public double subtotal;
    public double total;

    listBarang(int kodeBarang, String namaBarang, double harga, double diskon)
    {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.diskon = diskon;
    }

    public void displayHeader() {
        System.out.printf("%-4s %-20s %-15s %4s %8s %10s", "No", "Nama Barang", "Harga", "QTY", "Diskon", "Subtotal");
        System.out.println();
    }
    
    public void display() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat nf = NumberFormat.getCurrencyInstance(localeID);
        this.subtotal = this.quantity*(this.harga-(this.harga*this.diskon));
        System.out.printf("%-4d %-20s %-15s %2d %7s %17s", this.kodeBarang, this.namaBarang, nf.format(this.harga), this.quantity, (int)(this.diskon*100) + "%", nf.format(this.subtotal));
        System.out.println();
        calculateTotal(this.subtotal);
    }

    public void displayTotal() {
        System.out.println();
    }

    public int inputQuantity(int q) {
        this.quantity = q;
        return this.quantity;
    }

    public double calculateTotal(double total)
    {
        this.total += total;
        return this.total;
    }
    
}

