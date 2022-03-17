package convertlong;

import java.util.Scanner;


public class convertpanjang{
    public static void main(String[] args){

        double m;

        KiloMeter kiloMeter = new KiloMeter();
        HektoMeter hektoMeter = new HektoMeter();
        DekaMeter dekaMeter = new DekaMeter();
        DesiMeter desiMeter = new DesiMeter();
        CentiMeter centiMeter = new CentiMeter();
        MiliMeter miliMeter = new MiliMeter();

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka yang akan dikonversi dalam satuan meter (m) : ");
         m = input.nextDouble();

        kiloMeter.KiloMeter(m);
        hektoMeter.HektoMeter(m);
        dekaMeter.DekaMeter(m);
        desiMeter.DesiMeter(m);
        centiMeter.CentiMeter(m);
        miliMeter.MiliMeter(m);
    }
}
