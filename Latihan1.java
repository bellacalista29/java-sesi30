import java.util.Scanner;
import java.util.*;
import java.util.stream.IntStream;

public class Latihan1 {
    public static void main(String[] args) {
        int sum = 0;
        // double avg;
        float maxValue;
        float minValue;

        int[] data = new int[3];
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama (x) : ");
        data[0] = in.nextInt();

        System.out.print("Masukkan bilangan kedua (y) : ");
        data[1] = in.nextInt();

        System.out.print("Masukkan bilangan ketiga (z) : ");
        data[2] = in.nextInt();

        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }

        IntStream intStream = IntStream.of(data[0],data[1],data[2]);
        OptionalDouble avg = intStream.average();

        maxValue = data[0];
        minValue = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > maxValue) {
                maxValue = data[i];
            }
            if (data[i] < minValue) {
                minValue = data[i];
            }
        }

        System.out.println("Hasil : ");
        System.out.println("Rata-ratanya adalah : " +  Math.round(avg.getAsDouble() * 100.0) / 100.0);
        System.out.println(maxValue + " adalah bilangan terbesar");
        System.out.println(minValue + " adalah bilangan terkecil");
        in.close();
    }
}
