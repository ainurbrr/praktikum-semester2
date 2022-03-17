import java.util.Scanner;

public class RekapNilai_t1 {

    private int Nilai;
    private String Matkul;
    private String Nama;

    public int getNilai() {
        return Nilai;
    }

    public void setNilai(int nilai) {
        Nilai = nilai;
    }

    public String getMatkul() {
        return Matkul;
    }

    public void setMatkul(String matkul) {
        Matkul = matkul;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public static void main(String[] args) {

        RekapNilai_t1 Rn = new RekapNilai_t1();
        Scanner scan = new Scanner(System.in);

        try{
            System.out.print("Input Nama: ");
            Rn.setNama(scan.nextLine());

            System.out.print("Input Mata kuliah: ");
            Rn.setMatkul(scan.nextLine());

            System.out.print("Input Nilai: ");
            Rn.setNilai(scan.nextInt());

            System.out.println(" ");
            System.out.println("Nama: " + Rn.getNama());
            System.out.println("Mata Kuliah: " + Rn.getMatkul());
            System.out.println("Nilai: " + (Rn.getNilai()));
        } catch (java.util.InputMismatchException e) {
            System.err.println("!!ERROR!! Inputkan angka pada kolom nilai!");
        }
    }
}
