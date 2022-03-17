package modultugas1;

 public class tugasApp {
    public static void main(String[] args){
        Mahasiswa data=new Mahasiswa();

        data.setName("Moh. Ainur Bahtiar Rohman");
        data.setGrade("J");
        data.setMajor("Informatika");
        data.setFaculty("Teknik");
        data.setNIM("202010370311443");

        System.out.println("Nama: "+data.getName());
        System.out.println("Kelas: "+data.getGrade());
        System.out.println("Jurusan: "+data.getMajor());
        System.out.println("Fakultas: "+data.getFaculty());
        System.out.println("NIM: "+data.getNIM());

    }
}