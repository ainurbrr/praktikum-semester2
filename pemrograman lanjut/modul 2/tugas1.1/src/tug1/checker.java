package tug1;

import java.util.Scanner;

public class checker {

    String noHp;
    int pulsaInput;


    Scanner keyboard = new Scanner(System.in);

    public void login(){
        System.out.println("Masukkan Nomor HP : ");
        noHp = keyboard.nextLine();
        cekNomorHp();
        daftarPulsa();
        System.out.println("Masukkan Pulsa : ");
        pulsaInput = keyboard.nextInt();
        cekPulsa();
    }

    public void cekNomorHp(){
        for (int i = 0; i < 12; i++){
            if(noHp.length()<12 || noHp.length()>12){
                System.out.println("Nomor Hp yang dimasukan salah\n\n");
                login();
            }
        }
    }

    public void cekPulsa(){
        for (int i = 0; i <= 5; i++){
            if(pulsaInput > 0 && pulsaInput<=5){
                berhasil();
            }else{
                System.out.println("Pulsa tidak ada\n\n");
                login();
            }
        }
    }

    public void berhasil(){
        System.out.println("\nSelamat transaksi berhasil");
        System.exit(0);
    }

    public void daftarPulsa(){
        String[] []pulsa = {{"1.","5000\n"},{"2.","10000\n"},{"3.","20000\n"},{"4.","15000\n"},{"5.","50000\n"}};
        System.out.println("\\nDaftar Pulsa :\\n");

        for(String[] pulsaa : pulsa){
            for (String item : pulsaa) {
                System.out.printf(item);
            }
        }
    }
}
