package modul3;

public class driver {
    public static void main(String[] args){
        balok sisi = new balok();
        Perhitungan ph =new Perhitungan();


        sisi.setPanjang(12);
        sisi.setLebar(12);
        sisi.setTinggi(12);

        if(ph.kubus(sisi.getPanjang(), sisi.getLebar(), sisi.getTinggi())==true){
            sisi.hasilkubus();
        }else{
            sisi.hasilbalok();
        }

    }
}
