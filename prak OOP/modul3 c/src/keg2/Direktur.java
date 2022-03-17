package keg2;
import keg1.company;

public class Direktur extends company {
    String umur = "30-65 tahun";
    int gaji = 20;

    public void tampilkan(String angkutan, String fasilitas, int harikerja){
        super.tampilkan();
        System.out.println("---------------------------------");
        System.out.println("Jabatan "+jabatan[4]);
        System.out.println("Fasilitas : " +fasilitas);
        System.out.println("Hari Kerja : "+harikerja+"hari");
        System.out.println("Rentang umur "+umur);
        System.out.println("Gaji "+matauang+gaji+satuangaji);
        System.out.println("Lokasi kerja : "+tempatkerja[2]);
        System.out.println("Angkutan kerja : "+angkutan);

    }
}
