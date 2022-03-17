//import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class RekapNilai_t2 {

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

    public static void main(String[] args) throws FileNotFoundException {
        String[] Nama = new String[100];
        String[] Matkul = new String[100];
        int[] Nilai = new int[100];
        int i = 0;
        RekapNilai_t2 rn = new RekapNilai_t2();
        Scanner input = new Scanner(System.in);
        do {
            i++;

            try {
                //lokasi file data
                File data1 = new File("D:/[A]KULIAH/SEMESTER 2/tugas2a/src/data1.txt");
                //OBJEK WRITER
                PrintWriter printWriter = new PrintWriter(data1);
                //membuat baris baru pada isi file
                printWriter.println("");

                System.out.println("Masukkan Nama Mahasiswa : ");
                rn.setNama(input.nextLine());
                Nama[i] = rn.getNama();
                printWriter.println("Nama: " + Nama[i]);

                System.out.println("Masukkan Nama Matkul Mahasiswa : ");
                rn.setMatkul(input.nextLine());
                Matkul[i] = rn.getMatkul();
                printWriter.println("Matkul: " + Matkul[i]);

                System.out.println("Masukkan Nilai Mahasiswa : ");
                rn.setNilai(Integer.parseInt(input.nextLine()));
                Nilai[i] = rn.getNilai();
                if(Nilai[i] < 0){
                    System.out.println("Nilai harus bernilai positif");
                    rn.setNilai(Integer.parseInt(input.nextLine()));
                    Nilai[i] = rn.getNilai();
                    printWriter.println("Nilai: " + Nilai[i]);
                    printWriter.close();
                }else if(Nilai[i] > 100){
                    System.out.println("Nilai tidak boleh melebihi 100");
                    rn.setNilai(Integer.parseInt(input.nextLine()));
                    Nilai[i] = rn.getNilai();
                    printWriter.println("Nilai: " + Nilai[i]);
                    printWriter.close();
                }
                printWriter.println("Nilai: " + Nilai[i]);
                printWriter.close();
                System.out.println("Data berhasil ditambahkan pada konten file");

            } catch (NullPointerException e) {
                System.out.println("Tidak Boleh Meamasukkan nilai null pada setter!!!\n");
                System.exit(0);
            } catch (NumberFormatException e1) {
                System.out.println("inputan harus berupa angka!!!\n");
                System.exit(0);
            } catch (FileNotFoundException e2) {
                System.out.println("file tidak ditemukan");
            } finally {
                int pilihan;
                System.out.println("MENU \n1. lihat data\n2. exit");
                pilihan = Integer.parseInt(input.nextLine());
                if (pilihan == 1) {
                    //membaca data dalam file
                    File data = new File("D:/[A]KULIAH/SEMESTER 2/tugas2a/src/data1.txt");
                    Scanner scan = new Scanner(data);
                    boolean cekFile = data.exists();
                    System.out.println("Apakah file tersebut ada? " + cekFile);
                    //menampilkan data dalam file
                    while(scan.hasNextLine()){
                        String getDataString = scan.nextLine();
                        System.out.println(getDataString);

                    }
                    scan.close();
                    System.exit(0);
                }
                else if (pilihan == 2) {
                    System.exit(0);
                }else{
                    System.out.println("Tidak ada menu");
                }

            }
            }while (true) ;

    }
}


