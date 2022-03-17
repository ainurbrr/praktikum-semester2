package keg1;

import keg2.Direktur;
import keg2.Manajer;
import keg2.Supervisor;
import keg2.Leader;
import keg2.Operator;

public class driver {
    public static void main(String[] args){

        Operator op = new Operator();
        Leader ld = new Leader();
        Supervisor sv = new Supervisor();
        Manajer mj = new Manajer();
        Direktur dir = new Direktur();

        dir.tampilkan("Mobil Dinas","Rumah Dinas+Helikopter",6);
        mj.tampilkan("Mobil Dinas","Rumah Dinas");
        sv.tampilkan("Mobil Operasional","Rumah sewa");
        ld.tampilkan("Kendaraan Operasional");
        op.tampilkan("Bus Karyawan", 7);

    }
}
