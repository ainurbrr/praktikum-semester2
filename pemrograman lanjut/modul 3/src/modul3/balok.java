package modul3;

public class balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    public int getPanjang() {
        return this.panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return this.lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    protected void hasilbalok(){
        Perhitungan ph = new Perhitungan();
        System.out.println("Hasil luas balok : "+ph.luas(this));
        System.out.println("Hasil volume balok : "+ph.volume(this));
    }
    protected void hasilkubus(){
        Perhitungan ph = new Perhitungan();
        System.out.println("Hasil luas kubus : "+ph.luas(this));
        System.out.println("Hasil volume kubus : "+ph.volume(this));
    }
}
