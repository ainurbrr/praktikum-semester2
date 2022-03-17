package keg2;

import keg1.mobil;

public class spekmobil extends mobil {

    public void tampilspekmobil(String type, int harga, int tahunpembuatan){
        super.tampilspekmobil("model S",1300000000);
        System.out.println("mobil merk "+ merk + " dengan type : " + type +" tahun pembuatan :"+tahunpembuatan+ " berharga : "+harga);
    }
}
