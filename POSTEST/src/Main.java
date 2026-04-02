public class Main {
    public static void main(String[] args) {
        Barang tv = new Barang("TV-001", "Smart TV Samsung 50 Inch");
        tv.setKategori("Elektronik");

        // tv.stok = 50; 
        /* 
         * PENJELASAN ERROR (BARIS KODE DI ATAS): 
         * Jika tanda comment (//) pada baris 'tv.stok = 50;' dihapus, maka akan terjadi Compile-Time Error. 
         * Alasannya adalah karena atribut 'stok' di dalam kelas Barang telah dikunci menggunakan 
         * access modifier 'private'. Tingkat akses private adalah yang paling ketat dan membuat variabel 
         * hanya bisa diakses dari dalam kelas Barang itu sendiri. Dunia luar tidak bisa 
         * menyentuh apalagi memodifikasinya tanpa melalui "jalur resmi" (Setter) [2].
         */

        System.out.println("\n--- PERCOBAAN MERUSAK SISTEM ---");
        
        tv.setHargaSatuan(-5000000); 

        tv.kurangiStok(10); 

        System.out.println("\n--- MEMASUKKAN DATA YANG BENAR ---");
        
        tv.setHargaSatuan(6500000); 
        tv.tambahStok(15);          
        tv.kurangiStok(3);          

        tv.tampilkanDetailBarang();
    }
}