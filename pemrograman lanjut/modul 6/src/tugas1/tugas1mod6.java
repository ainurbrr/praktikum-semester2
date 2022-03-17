package tugas1;

/**
 * @author Moh. Ainur Bahtiar Rohman
 */

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class tugas1mod6 {
    /**
     * fungsi main untuk menjalankan program
     *
     * @param args untuk menjalakan semua fungsi dalam program
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean lanjut = true;
        int a = 0;
        int stopper;
        int angka;
        int[] inNumber = new int[100];
        String[] inString = new String[100];

        File fl = new File("D:/praktikum sem 2/pemrograman lanjut/modul 6/src/data.txt");

        do {

            /**
             * @exception InputMismatchException untuk menampung String ke dalam array String
             * @exception ArrayIndexOutOfBoundsException memberikan exception jika array telah penuh
             * @exception IOException untuk menangani eror pada program
             */

            try {
                System.out.println("Silahkan Masukkan Nama atau Nomor Anda : ");
                angka = input.nextInt();
                inNumber[a] = angka;
                try {
                    PrintWriter printWriter = new PrintWriter(new FileWriter(fl, true));
                    printWriter.println(inNumber[a]);
                    printWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (InputMismatchException e) {
                inString[a] = input.nextLine();
                try {
                    PrintWriter printWriter = new PrintWriter(new FileWriter(fl, true));
                    printWriter.println(inString[a]);
                    printWriter.close();
                } catch (IOException ie) {
                    ie.printStackTrace();
                }
            } catch (ArrayIndexOutOfBoundsException aio) {
                aio.printStackTrace();
                System.out.println("Inputan melebihi batas array!");
            }
            System.out.println("apakah ingin melanjutkan inputan?\n1.Ya\n2.Tidak");
            stopper = input.nextInt();
            if (stopper == 1) {
                lanjut = true;
            } else if (stopper == 2) {
                lanjut = false;
            } else {
                lanjut = false;
            }
            a++;

        } while (lanjut);

        /**
         * @exception FileNotFoundException untuk menangani error jika file tidak ditemukan
         */
        try {
            Scanner scan = new Scanner(fl);
            int b = 0;
            System.out.println("Data lama dan data baru yang terdapat di file");
            while (scan.hasNextLine()) {
                String dataLama = scan.nextLine();
                System.out.println((b + 1) + "." + dataLama);
                b++;
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("file lama tidak ditemukan!");
        }
        System.out.println("Berikut adalah data baru yang anda inputkan : ");
        for (int i = 0; i < a; i++) {
            if (inString[i] == null) {
                System.out.println((i + 1) + "." + inNumber[i]);
            } else {
                System.out.println((i + 1) + "." + inString[i]);
            }
        }
    }
}
