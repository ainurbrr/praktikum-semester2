package keg1;

public class mobil extends alatTranportasi {
    public String merk = "Tesla";
    String bahanbakar = "Listrik";

    public void tampilspekmobil(String type, int harga){
        System.out.println("mobil merk "+ merk + " dengan type : " + type + " berharga : "+harga);
    }

    public void tampilm() {
        System.out.println("alat transportasi " + Lokasi[0] + " berjenis " + jenis[0] + " bermerek " + merk + " bersumber energi " + bahanbakar);
    }
}
