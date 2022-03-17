package mod5pbo;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String []Nama = new String[100];
        String []Matkul = new String[100];
        int []Nilai= new int[100];
        int i=0;
        boolean lanjut = true;
        RekapNilai rn = new RekapNilai();
        Scanner input = new Scanner(System.in);
        do {
            i++;
            System.out.println("");
            try {

                System.out.println("Masukkan Nama Mahasiswa : ");
                rn.setNama(input.nextLine());
                Nama[i]= rn.getNama();
                System.out.println("Masukkan Nama Matkul Mahasiswa : ");
                rn.setMatkul(input.nextLine());
                Matkul[i]= rn.getMatkul();
                System.out.println("Masukkan Nilai Mahasiswa : ");
                rn.setNilai(Integer.parseInt(input.nextLine()));
                Nilai[i]= rn.getNilai();

            } catch (NullPointerException e) {
                System.out.println("Tidak Boleh Meamasukkan nilai null pada setter!!!\n");
            } catch (IndexOutOfBoundsException e2) {
                System.out.println("inputan melebihi batas array!!!\n");
            } catch (NumberFormatException e3) {
                System.out.println("inputan tidak sesuai!!!\n");
            }finally {
                int pilihan;

                System.out.println("apakah ingin melanjutkan inputan?\n1. lanjut\n2. exit");
                pilihan = Integer.parseInt(input.nextLine());
                if (pilihan==1){
                    lanjut=true;
                }else if (pilihan==2){
                    System.exit(0);
                }
            }
        } while (lanjut);
    }
}
