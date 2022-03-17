package mod5;

import java.util.Arrays;
import java.util.Scanner;

public class tugas2 {

    public void sortnsearch(){
        int[] data = {-80, -50, 0, 40, 0, -30, 90, 70, 89, 50, -55};
        int index;

        Arrays.sort(data);
        System.out.println("result : " + Arrays.toString(data));

        Scanner input = new Scanner(System.in);
        System.out.println("\nMasukkan Elemen yang akan dicari : ");
        index = input.nextInt();
        int indexhasil = Arrays.binarySearch(data, index);
        System.out.println("Data ditemukan di Index ke : " + (indexhasil+1)+"\n");
    }
}
