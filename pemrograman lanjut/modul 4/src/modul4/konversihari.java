package modul4;

import java.util.Scanner;

public class konversihari {

       public static void konversihari(){

              Scanner input = new Scanner(System.in);
              int hari, tahun, bulan,  sisahari;

              System.out.println("Masukkan jumlah hari yang akan dikonversi");
              System.out.println("Jumlah hari :"); hari = input.nextInt();

              tahun = hari/365;
              bulan = (hari%365)/30;
              sisahari = (hari%365)%30;

              tampilhari(hari, tahun, bulan, sisahari);
       }

       private static void tampilhari(int hari, int tahun, int bulan, int sisahari) {
              System.out.println(hari +" hari = "+ tahun +" tahun "+ bulan +" bulan "+ sisahari +" hari");
       }
}
