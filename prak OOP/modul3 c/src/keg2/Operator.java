package keg2;
import keg1.company;

public class Operator extends company {
    String umur = "19-45 tahun";
    int gaji = 5;

    public void tampilkan(String angkutan, int jamkerja){
        System.out.println("---------------------------------");
        System.out.println("Jabatan "+jabatan[0]);
        System.out.println("Rentang umur "+umur);
        System.out.println("Jam kerja : "+ jamkerja+"jam perhari");
        System.out.println("Gaji "+matauang+gaji+satuangaji);
        System.out.println("Lokasi kerja : "+tempatkerja[0]);
        System.out.println("Angkutan kerja : "+angkutan);
    }

}
