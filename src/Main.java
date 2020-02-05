import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nama;
        int banyak, max, min;
        float rata = 0;

        Scanner cin = new Scanner(System.in);
        System.out.print("Nama\t: ");
        nama = cin.nextLine();
        System.out.print("Masukkan banyaknya nilai yang ingin dimasukkan : ");
        banyak = cin.nextInt();
        int [] nilai = new int[banyak];
        for (int i = 0; i < banyak; i++){
            int z = i + 1;
            System.out.print("Nilai ke-" + z + " : ");
            nilai[i] = cin.nextInt();
            rata = rata + nilai[i];
        }
        rata = rata / banyak;
        System.out.println();
        max = nilai[0]; min = nilai[0];
        for (int i = 0; i < banyak; i++){
            if (max <= nilai[i])
                max = nilai[i];
            if (min >= nilai[i])
                min = nilai[i];
        }
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Tertinggi : " + max);
        System.out.println("Nilai Terendah : " + min);
        System.out.println("Rata-rata Nilai : " + rata);
    }
}
