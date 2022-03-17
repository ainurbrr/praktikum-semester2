package mod5;

import java.util.Scanner;

public class tugas1 {
    public void sortingangka() {

        int temp;
        int search;
        boolean searching = false;

        int[] data = {-80, -50, 0, 40, 0, -30, 90, 70, 89, 50, -55};


        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data.length; b++) {
                if (data[a] < data[b]) {
                    temp = data[a];
                    data[a] = data[b];
                    data[b] = temp;
                }
            }
        }
        System.out.print("Result : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }


        Scanner scan = new Scanner(System.in);
        System.out.println("\nMasukkan Elemen yang akan dicari : ");
        search = scan.nextInt();
        for (int index = 0; index < data.length; index++) {
            if (data[index] == search) {
                searching = true;
                System.out.println("Data ditemukan di Index ke : " + (index+1)+"\n");
            }
        }
        if (searching == false) {
            System.out.println("Data tidak ditemukan di Index\n");
        }

    }
}
