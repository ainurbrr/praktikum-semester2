package soal1;

import java.util.Scanner;

public class Soal1 {
    public static int x;

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {


        String[] nama = new String[1000];
        String[] matkul = new String[1000];
        int[] nilai = new int[1000];



        int i = 0;
        do {
            System.out.println("       DATA NILAI MAHASISWA   ");
            System.out.println("---------------------------------");
            System.out.println("[1] INPUT DATA NILAI MAHASISWA");
            System.out.println("[2] LIHAT DATA");
            System.out.println("[3] EXIT PROGRAM");
            System.out.println("---------------------------------");
            Scanner input = new Scanner(System.in);
            System.out.print("Pilihan anda : ");
            x = Integer.parseInt(input.nextLine());
            clearScreen();
            switch (x) {
                case 1:
                    i++;
                    System.out.print("Data ke : ");
                    System.out.println(i);
                    System.out.println("----------------------------");
                    System.out.print("Nama  Mahasiswa   : ");
                    nama[i] = input.nextLine();
                    System.out.print("Mata Kuliah       : ");
                    matkul[i] = input.nextLine();
                    System.out.print("Nilai             : ");
                    nilai[i] = Integer.parseInt(input.nextLine());
                    break;
                case 2:

                    System.out.println("               DATA NILAI MATA KULIAH  ");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println(" No" + "          Nama" + "            Mata Kuliah" + "         Nilai");
                    System.out.println("---------------------------------------------------------------");
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                        System.out.print("   ");
                        System.out.print(nama[j]);
                        System.out.print("    ");
                        System.out.print(matkul[j]);
                        System.out.print("     ");
                        System.out.println(nilai[j]);
                    }
                    try {
                        System.in.read();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    x = 3;
                    break;
            }
        }
        while (x != 3);
    }

}