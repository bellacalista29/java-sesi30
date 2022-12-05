import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        String[][] kelas = new String[2][3];
        Scanner in = new Scanner(System.in);

        for(int row = 0; row < kelas.length; row++)
        {
            for(int col = 0; col < kelas[row].length; col++)
            {
                System.out.print("Masukkan yang akan duduk di kelas (" + row + "," + col + ") : ");
                kelas[row][col] = in.nextLine();
            }
        }
        System.out.println();
        System.out.println("Output : ");
        for (int row = 0; row < kelas.length; row++) {
            for (int col = 0; col < kelas[row].length; col++) {
                System.out.println("Siapa yang akan duduk di kelas (" + row + "," + col + ") : " + kelas[row][col]);
            }
        }
        System.out.println();
        System.out.println("==============================================");
        String space = "";
        for (int row = 0; row < kelas.length; row++) {
            for (int col = 0; col < kelas[row].length; col++) {
                System.out.printf("|%10s|%5s" + "" , kelas[row][col], space);
            }
            System.out.println();
        }
        System.out.println("==============================================");
        in.close();
    }
}
