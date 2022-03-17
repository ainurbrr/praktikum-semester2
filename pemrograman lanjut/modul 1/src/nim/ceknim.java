package nim;


import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class ceknim {
    public static void main(String[] args){
        String NIM;
        boolean lanjut=true;
        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        try{
        while(lanjut) {
            System.out.println("Masukkan NIM anda: ");
            //menscan untuk variabel NIM
            NIM = keyboard.nextLine();
            int lengNIM = NIM.length();
            if ("202010370311443".equals(NIM)) {
                System.out.println("NIM yang anda masukkan sudah benar");
                lanjut=false;
            } else if (lengNIM < 15) {
                System.out.println("error!!!\nNIM yang anda masukkan kurang dari 15");
                lanjut=false;
            } else if (lengNIM > 15) {
                System.out.println("error!!!\nNIM yang anda masukkan lebih dari 15");
                lanjut=false;
            } else {
                System.out.println("error!!!\nNIM yang anda masukkan salah");
                lanjut=true;
            }
        }
        }catch (Exception e){
            System.out.println("error!!!");
        }

    }
}
