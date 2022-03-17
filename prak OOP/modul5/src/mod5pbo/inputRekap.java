package mod5pbo;

import java.io.*;
import java.util.Scanner;

public class inputRekap {

    public static void main(String[] args) {
        String[] Nama = new String[100];
        String[] Matkul = new String[100];
        int[] Nilai = new int[100];
        int i = 0;
        int pil;
        boolean lanjut = true;

        RekapNilai rn = new RekapNilai();
        Scanner input = new Scanner(System.in);


        do {

            System.out.println("---REKAP NILAI MAHASISWA---");
            System.out.println("1. Input Data");
            System.out.println("2. Tampilkan Data");
            pil = (Integer.parseInt(input.nextLine()));

            switch (pil) {

                case 1:
                    i++;
                    try {
                        File fl = new File("D:/praktikum sem 2/prak OOP/modul5/src/nilai.txt");
                        PrintWriter printWriter = new PrintWriter(new FileWriter(fl,true));

                        System.out.println("Masukkan Nama Mahasiswa : ");
                        rn.setNama(input.nextLine());
                        Nama[i] = rn.getNama();
                        System.out.println("Masukkan Nama Matkul Mahasiswa : ");
                        rn.setMatkul(input.nextLine());
                        Matkul[i] = rn.getMatkul();
                        System.out.println("Masukkan Nilai Mahasiswa : ");
                        rn.setNilai(Integer.parseInt(input.nextLine()));
                        Nilai[i] = rn.getNilai();
                        printWriter.append(Nama[i] + "\t" + Matkul[i] + "\t" + Nilai[i]);
                        printWriter.close();

                    } catch (NullPointerException e) {
                        System.out.println("Tidak Boleh Meamasukkan nilai null pada setter!!!\n");
                    } catch (IndexOutOfBoundsException e2) {
                        System.out.println("inputan melebihi batas array!!!\n");
                    } catch (NumberFormatException e3) {
                        System.out.println("inputan tidak sesuai!!!\n");
                    } catch (IOException e4) {
                        System.out.println("File tidak ditemukan");
                        e4.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("===Data nilai Matkul===");
                    System.out.println("No\tNama\tMatkul\tnilai");
                    try{
                        File fl = new File("D:/praktikum sem 2/prak OOP/modul5/src/nilai.txt");
                        System.out.println("Data : ");
                        Scanner scan = new Scanner(fl);
                        while(scan.hasNextLine()){
                            int b=0;
                            b++;
                            String dataLama = scan.nextLine();
                            System.out.println(b +". "+dataLama);
                        }scan.close();
                    }catch(FileNotFoundException ex){
                        System.out.println("File Tidak Ditemukan");
                    }finally {
                        System.out.println("Data Baru ditambahkan: ");
                        for (int a = 1; a < i; a++) {
                            System.out.println((a) + ".\t" + Nama[a] + "\t" + Matkul[a] + "\t" + Nilai[a]);
                        }
                    }
                    break;
            }
            int pilihan;

            System.out.println("apakah ingin melanjutkan Rekap Nilai?\n1. lanjut\n2. exit");
            pilihan = Integer.parseInt(input.nextLine());
            if (pilihan == 1) {
                lanjut = true;
            } else if (pilihan == 2) {
                System.exit(0);
            }

        } while (lanjut);
    }
}


