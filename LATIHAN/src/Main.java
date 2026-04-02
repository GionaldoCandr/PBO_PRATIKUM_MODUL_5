public class Main {
    public static void main(String[] args) throws Exception {
    // Mahasiswa mhs = new Mahasiswa();
    // mhs.nama = "Adi";
    // // mhs.nim = "12345";
    // System.out.println(mhs.getNim());
    // mhs.setNim("12345");
    // System.out.println(mhs.getNim());

        Karyawan karyawanBaru = new Karyawan("CS_031", "Gionaldo", 10000000, "Ilkom");
        
        System.out.println("\n-gaji minu > ");
        karyawanBaru.setGajiPokok(-5000000); 
        
        System.out.println("\nGaji valid > ");
        karyawanBaru.setGajiPokok(8500000); 
        
        System.out.println("\ntidak punya > ");
        karyawanBaru.tampilkanDataKaryawan();

    
}

}
