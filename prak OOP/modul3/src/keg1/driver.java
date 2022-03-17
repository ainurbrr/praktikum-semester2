package keg1;
import keg2.spekmobil;

public class driver {
    public static void main(String[] args){
        mobil mb = new mobil();
        spekmobil sm = new spekmobil();
        kereta kai = new kereta();
        sepeda spd = new sepeda();
        pesawat psw = new pesawat();
        kapal ka = new kapal();

        mb.tampilm();
        sm.tampilspekmobil("model S",1300000000,2020);
        kai.tampilk();
        spd.tampils();
        psw.tampilp();
        ka.tampilk();
    }
}
