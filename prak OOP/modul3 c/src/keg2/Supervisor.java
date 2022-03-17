package keg2;

import keg1.company;

public class Supervisor extends company {
    String umur = "30-50 tahun";
    int gaji = 10;

    public void tampilkan(String angkutan, String fasilitas){
        System.out.println("---------------------------------");
        System.out.println("Jabatan "+jabatan[2]);
        System.out.println("tempat tinggal " +fasilitas);
        System.out.println("Rentang umur "+umur);
        System.out.println("Gaji "+matauang+gaji+satuangaji);
        System.out.println("Lokasi kerja : "+tempatkerja[1]);
        System.out.println("Angkutan kerja : "+angkutan);
    }
}