public class Karyawan {
    //1
    private String idKaryawan;
    private String namaKaryawan;
    //2
    private double gajiPokok;
    //3
    private String departemen;

    //1
    public Karyawan(String idKaryawan, String namaKaryawan, double gajiPokok, String departemen) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.gajiPokok = gajiPokok;
        this.departemen = departemen;
    }


    public String getid(){
        return idKaryawan;
    }

    public String getNama(){
        return namaKaryawan;
    }

    public void setNama(String nama){
        this.namaKaryawan = nama;
    }

    public void setId(String id){
        this.idKaryawan = id;
    }

    //2
    public double getGajiPokok(double gajiPokok){
       return this.gajiPokok;

    }

    public void setGajiPokok(double gajiPokok) {
        if (gajiPokok >= 0) {
            this.gajiPokok = gajiPokok;
            System.out.println("gaji pokok telah diperbarui");
        } else {
            System.out.println("gaji pokok tidak boleh kurang dari nol");
        }
    }




    //3
    public String getDepartemen() { return this.departemen; }

    public void setDepartemen(String departemen) { 
        this.departemen = departemen; 
    }



    public void tampilkanDataKaryawan() {
        System.out.println("IDKaryawan : " + this.idKaryawan);
        System.out.println("Nama        : " + this.namaKaryawan);
        if (this.departemen != null) {
            System.out.println("Departemen  : " + this.departemen);
        } else {
            System.out.println("Departemen  : Belum punya");
        }
        System.out.println("Gaji Pokok  : Rp " + this.gajiPokok);
    }





}


    


