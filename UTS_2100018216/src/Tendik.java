public class Tendik extends Karyawan{
    protected int total;
    @Override
    public int gajiPokok() {
        return super.gajiPokok();
    }

    public int gajiTotal(){
        return super.gajiPokok();
    }

    public int lembur(int jam){
        total = 50000 * jam;
        return  total;
    }

    //overloading
    public int gajiTotal(int jam){
        return gaji + total;
    }


}
