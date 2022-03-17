package modul3;

public class Perhitungan {

    balok sisi = new balok();

    int hasilluas;
    int hasilvolume;


    public int luas(balok sisi){
        int panjang = sisi.getPanjang();
        int lebar = sisi.getLebar();
        int tinggi = sisi.getTinggi();
       hasilluas = 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
        return hasilluas;
    }

    public int volume(balok sisi){
        int panjangV = sisi.getPanjang();
        int lebarV = sisi.getLebar();
        int tinggiV = sisi.getTinggi();
        hasilvolume = panjangV*lebarV*tinggiV;
        return hasilvolume;
    }

    /*static boolean isCube(long input){
        return (Math.round(Math.cbrt(input))*Math.round(Math.cbrt(input))
                *Math.round(Math.cbrt(input))) == input;
    }*/
    static boolean kubus(int p, int l, int t){
        int input = p*l*t;
        return (Math.round(Math.cbrt(input))*Math.round(Math.cbrt(input))
                *Math.round(Math.cbrt(input))) == input;
    }

}
