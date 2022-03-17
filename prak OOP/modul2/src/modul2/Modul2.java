package modul2;


import java.util.Scanner;
public class Modul2 {
    public static void main(String[] args) {

 double luas,keliling, phi=3.14,jarijari;
 int opsi;

 Scanner input = new Scanner(System.in);
 System.out.println("Silahkan Pilih opsi menghitung");
 System.out.println("1.Menghitung Keliling Lingkaran");
 System.out.println("2.Mengjitung Luas Lingkaran");
 System.out.println("3.Menghitung Keliling dan luas Lingkaran");
 System.out.print("MASUKKAN OPSI PILIHAN: ");

                opsi = input.nextInt();

                switch(opsi){
                case 1 :
                    System.out.println("==Menghitung keliling Lingkaran==\n");
                    System.out.println("silahkan masukkan jari-jari dalam cm :");
                    jarijari = input.nextInt();
                    keliling = 2*phi*jarijari;
                    System.out.println("Jadi keliling lingkaran adalah "+keliling+" cm\n");
                    break;

                case 2:
                    System.out.println("==Menghitung Luas Lingkaran==\n");
                    System.out.println("silahkan masukkan jari-jari dalam cm :");
                    jarijari = input.nextInt();
                    luas = phi*jarijari*jarijari;
                    System.out.println("Jadi luas lingkaran adalah "+luas+" cm\n");
               case 3:
                   System.out.println("==Menghitung keliling dan Luas Lingkaran==\n");
                   System.out.println("silahkan masukkan jari-jari dalam cm :");
                   jarijari = input.nextInt();
                   keliling = 2*phi*jarijari;
                   luas = phi*jarijari*jarijari;
                   System.out.println("Jadi keliling lingkaran adalah "+keliling+" cm dan,");
                   System.out.println("luas lingkaran adalah "+luas+"cm\n");
                break;
            }
    }

}
