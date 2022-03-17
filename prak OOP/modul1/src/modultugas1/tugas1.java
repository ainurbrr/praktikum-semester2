package modultugas1;

class Mahasiswa {
    private String name;
    private String grade;
    private String major;
    private String faculty;
    private String NIM;

    //method setter
    public void setName(String name){
        this.name = name;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public void setFaculty(String faculty){
        this.faculty = faculty;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    // ini method getter

    public String getName(){
        return this.name;
    }

    public String getGrade(){
        return this.grade;
    }

    public String getMajor(){
        return this.major;
    }

    public String getFaculty(){
        return this.faculty;
    }

    public String getNIM(){
        return this.NIM;
    }

}

public class tugas1 {
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