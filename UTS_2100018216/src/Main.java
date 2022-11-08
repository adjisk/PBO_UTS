public class Main {
    public static void main(String[] args) {
        Tendik tndk = new Tendik();
        tndk.setNama("Adji Sihab");
        tndk.setNip(2100018216);
        tndk.setTglLahir("05/05/2005");
        tndk.setAlamat("Jepara");
        tndk.setJk("Laki-Laki");
        tndk.setTahunMasuk(2021);

        Dosen lecturer = new Dosen();
        lecturer.setJurusan("Informatika");
        lecturer.setNidn(876976578);
        lecturer.setNama("Drs. Whyu Pujiono S.I");
        lecturer.setNip(123456789);
        lecturer.setTglLahir("09/03/1970");
        lecturer.setJk("Laki-Laki");
        lecturer.setAlamat("Yogyakarta");
        lecturer.setTahunMasuk(2015);

        System.out.println("-----------------------");
        System.out.println("| Total Gaji Karyawan |");
        System.out.println("-----------------------");
        System.out.println("Nama Karyawan       : "+ tndk.getNama());
        System.out.println("NIP  Karyawan       : "+ tndk.getNip());
        System.out.println("Tanggal Lahir       : "+ tndk.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ tndk.getJk());
        System.out.println("Alamat              : "+ tndk.getAlamat());
        System.out.println("Tahun masuk         : "+ tndk.getTahunMasuk());
        System.out.println("Gaji pokok          : "+tndk.gajiTotal());
        System.out.println("Upah lembur(20 jam) : "+ tndk.lembur(20));
        System.out.println("Gaji total          : "+ tndk.gajiTotal(20));

        System.out.println("\n");
        System.out.println("---------------------");
        System.out.println("| Totoal Gaji Dosen |");
        System.out.println("---------------------");
        System.out.println("Nama Dosen          : "+ lecturer.getNama());
        System.out.println("NIDN                : " +lecturer.getNidn());
        System.out.println("Jurusan             : " + lecturer.getJurusan());
        System.out.println("NIP  Dosen          : "+ lecturer.getNip());
        System.out.println("Tanggal Lahir       : "+ lecturer.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ lecturer.getJk());
        System.out.println("Alamat              : "+ lecturer.getAlamat());
        System.out.println("Tahun masuk         : "+ lecturer.getTahunMasuk());
        System.out.println("Gaji pokok          : "+ lecturer.gajiTotal());
        System.out.println("Kelas lebih (6 SKS) : "+ lecturer.mengajarLebih(6));
        System.out.println("Gaji total          : "+ lecturer.gajiTotal(6));

    }
}