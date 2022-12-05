import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        int tahun;

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan tahun : ");
        tahun = in.nextInt();
        if (tahun % 400 == 0) {
            System.out.println(tahun + " merupakan tahun kabisat");
        } else if (tahun % 100 == 0) {
            System.out.println(tahun + " bukan tahun kabisat");
        } else if (tahun % 4 == 0) {
            System.out.println(tahun + " merupakan tahun kabisat");
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }
    }
}
