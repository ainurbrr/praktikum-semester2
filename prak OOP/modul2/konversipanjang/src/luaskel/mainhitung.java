package luaskel;


import java.util.Scanner;

public class mainhitung {
    public static void main(String[] args) {

        int opsi, jarijari;

        hitung hit = new hitung();

        Scanner input = new Scanner(System.in);

        System.out.println("Silahkan Pilih Opsi Mengitung : \n1. Keliling Lingkaran\n2. Luas Lingkaran\n3. Keliling dan Luas Lingkaran\n");
        System.out.println("masukkan pilihan :");
        opsi = input.nextInt();

        switch (opsi) {
            case 1 :
                System.out.println("==Menghitung keliling Lingkaran==\n");
                System.out.println("silahkan masukkan jari-jari dalam cm :");
                jarijari = input.nextInt();
                hit.keliling(jarijari);
                break;
            case 2 :
                System.out.println("==Menghitung Luas Lingkaran==\n");
                System.out.println("silahkan masukkan jari-jari dalam cm :");
                jarijari = input.nextInt();
                hit.luas(jarijari);
                break;
            case 3 :
                System.out.println("==Menghitung Keliling dan Luas Lingkaran==\n");
                System.out.println("silahkan masukkan jari-jari dalam cm :");
                jarijari = input.nextInt();
                hit.keliling(jarijari);
                hit.luas(jarijari);
                break;
        }
    }
}
