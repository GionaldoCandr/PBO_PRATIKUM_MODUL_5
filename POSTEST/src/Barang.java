public class Barang {
    
    private String idBarang;
    private String namaBarang;
    private int stok;
    private double hargaSatuan;

    protected String kategori;

    public Barang(String idBarang, String namaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = 0;
        this.hargaSatuan = 0.0;
        System.out.println("Sistem: Barang " + this.namaBarang + " berhasil didaftarkan dengan stok 0.");
    }

    
    public String getIdBarang() { return this.idBarang; }
    public void setIdBarang(String idBarang) { this.idBarang = idBarang; }

    public String getNamaBarang() { return this.namaBarang; }
    public void setNamaBarang(String namaBarang) { this.namaBarang = namaBarang; }
    
    public String getKategori() { return this.kategori; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    public int getStok() { return this.stok; }
    
    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("GAGAL (Keamanan): Stok tidak boleh diset dengan angka negatif!");
        }
    }

    public double getHargaSatuan() { return this.hargaSatuan; }
    
    public void setHargaSatuan(double hargaSatuan) {
        if (hargaSatuan > 0) {
            this.hargaSatuan = hargaSatuan;
        } else {
            System.out.println("GAGAL (Keamanan): Harga satuan tidak boleh kurang dari atau sama dengan nol!");
        }
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
            System.out.println("SUKSES: Berhasil menambah stok sebanyak " + jumlah);
        } else {
            System.out.println("GAGAL: Jumlah tambah stok harus lebih dari nol!");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0) {
            if (this.stok >= jumlah) { 
                this.stok -= jumlah;
                System.out.println("SUKSES: Berhasil mengurangi stok sebanyak " + jumlah);
            } else {
                System.out.println("GAGAL (Keamanan): Stok di gudang tidak mencukupi untuk dikurangi " + jumlah + "! Sisa stok: " + this.stok);
            }
        } else {
            System.out.println("GAGAL: Jumlah kurangi stok harus lebih dari nol!");
        }
    }

    // 6. Fitur Menampilkan Informasi Lengkap
    public void tampilkanDetailBarang() {
        System.out.println("ID Barang    : " + this.idBarang);
        System.out.println("Nama Barang  : " + this.namaBarang);
        System.out.println("Kategori     : " + (this.kategori != null ? this.kategori : "Belum Ditentukan"));
        System.out.println("Stok         : " + this.stok);
        System.out.println("Harga Satuan : Rp " + this.hargaSatuan);
    }
}