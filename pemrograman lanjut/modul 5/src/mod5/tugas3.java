package mod5;

import java.util.Arrays;


public class tugas3 {
    public void rasioElemen(){

        double positif=0, negatif=0, nol=0;

        int[] data = {-80, -50, 0, 40, 0, -30, 90, 70, 89, 50, -55};


        Arrays.sort(data);
        System.out.println("result : " + Arrays.toString(data));

        for (int i = 0; i<data.length; i++){
            if (data[i] < 0) {
                negatif++;
            }else if (data[i] > 0){
                positif++;
            }else {
                nol++;
            }
        }

        System.out.println("\nPositif : "+positif/data.length);
        System.out.println("Negatif : "+negatif/data.length);
        System.out.println("zero : "+nol/data.length);
    }
}
