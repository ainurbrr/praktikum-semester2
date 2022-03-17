package keg2;
import keg1.company;

public class Leader extends company {
    String umur = "25-50 tahun";
    int gaji = 7;

    public void tampilkan(String angkutan){
        System.out.println("---------------------------------");
        System.out.println("Jabatan "+jabatan[1]);
        System.out.println("Rentang umur "+umur);
        System.out.println("Gaji "+matauang+gaji+satuangaji);
        System.out.println("Lokasi kerja : "+tempatkerja[0]);
        System.out.println("Angkutan kerja : "+angkutan);
    }
}
