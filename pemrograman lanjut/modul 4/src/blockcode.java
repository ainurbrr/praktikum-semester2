import java.util.Scanner;

public class blockcode {

    //Scanner input = new Scanner(System.in);

    public static void konversihari(){
        Scanner input = new Scanner(System.in);
        int hari, tahun, bulan,  sisahari;

        System.out.println("Masukkan jumlah hari yang akan dikonversi");
        System.out.println("Jumlah hari :"); hari = input.nextInt();

        tahun = hari/365;
        bulan = (hari%365)/30;
        sisahari = (hari%365)%30;

        System.out.println(hari+" hari = "+tahun+" tahun "+bulan+" bulan "+sisahari+" hari");
    }
    public static void sortingangka(){

            int data;
            int temp;
            Scanner scan = new Scanner(System.in);
            System.out.println("masukkan jumlah data : ");
            data = scan.nextInt();
            int[] angka = new int[data];
            for(int i = 0; i < data; i++){
                System.out.println("Data ke "+(i+1)+" : ");
                angka[i] = scan.nextInt();
            }


            for(int a = 0; a < data; a++){
                for(int b = 0; b < data; b++){
                    if(angka[a] < angka[b]){
                        temp=angka[a];
                        angka[a]=angka[b];
                        angka[b]=temp;
                    }
                }
            }
            System.out.print("Hasil : ");
            for(int i = 0; i < data; i++){
                System.out.print(angka[i]+" ");
            }
    }
    public static void hitunglama(){
        int jammulai, menitmulai, jamselesai, menitselesai;
        int total1, total2, totalhasil;
        int jamhasil, menithasil;

        Scanner input = new Scanner(System.in);

        System.out.println("masukkan jam & menit mulai : ");
        jammulai= input.nextInt();
        System.out.print(" : ");
        menitmulai= input.nextInt();
        total1=jammulai*60+menitmulai;
        System.out.println("masukkan jam & menit selesai : ");
        jamselesai= input.nextInt();
        System.out.print(" : ");
        menitselesai= input.nextInt();
        total2=jamselesai*60+menitselesai;
        totalhasil=total2-total1;
        if(totalhasil>0){
            jamhasil=totalhasil/60;
            menithasil=totalhasil%60;
            System.out.println("Jadi lama waktu yang dihitung dari mulai sampai selesai adalah "+jamhasil+":"+menithasil);
        }else{
            System.out.println("jam selesai harus ada di setelah jam mulai!");
        }

    }

}

