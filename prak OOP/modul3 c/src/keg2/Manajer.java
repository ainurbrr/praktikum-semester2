package keg2;
import keg1.company;

public class Manajer extends company {
    String umur = "30-55 tahun";
    int gaji = 15;

    public void tampilkan(String angkutan, String fasilitas){
        System.out.println("---------------------------------");
        System.out.println("Jabatan "+jabatan[3]);
        System.out.println("tempat tinggal " +fasilitas);
        System.out.println("Rentang umur "+umur);
        System.out.println("Gaji "+matauang+gaji+satuangaji);
        System.out.println("Lokasi kerja : "+tempatkerja[2]);
        System.out.println("Angkutan kerja : "+angkutan);
    }
}