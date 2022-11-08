public class Dosen extends Karyawan{
    private String jurusan;
    private int nidn;

    protected int total;
    @Override
    public int gajiPokok() {
        return super.gajiPokok();
    }

    public int gajiTotal(){
        return super.gajiPokok();
    }

    public int mengajarLebih(int sks){
        total = 100000 * sks;
        return  total;
    }

    //overloading
    public int gajiTotal(int sks){
        return gaji + total;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getNidn() {
        return nidn;
    }

    public void setNidn(int nidn) {
        this.nidn = nidn;
    }
}
