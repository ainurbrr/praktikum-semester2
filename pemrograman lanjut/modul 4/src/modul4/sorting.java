package modul4;

import java.util.Scanner;

public class sorting {
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
        tampilsort(data, angka);
    }

    private static void tampilsort(int data, int[] angka) {
        System.out.print("Hasil : ");
        for(int i = 0; i < data; i++){
            System.out.print(angka[i]+" ");
        }
    }
}
