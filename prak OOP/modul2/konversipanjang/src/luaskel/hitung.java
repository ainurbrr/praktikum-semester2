package luaskel;

public class hitung {

    double phi = 3.14;
    double kel;
    double l;

    public void keliling(double r){
        kel = 2*phi*r;
        System.out.println("Jadi keliling lingkaran adalah "+kel+"cm\n");
    }

    public void luas(double r){
        l = phi*r*r;
        System.out.println("Jadi luas lingkaran adalah "+l+"cm\n");
    }
}
