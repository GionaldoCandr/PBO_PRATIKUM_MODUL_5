public class RekeningBank {
    private String nomorRekening; 
    private double saldo = 0.0 ;
    
  public RekeningBank(String nomorRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0.0;
        }
    }



    public double getSaldo() {
        return this.saldo;
    }

    public void isiSaldo(double jumlah) {
        if (jumlah >= 0) {
            this.saldo += jumlah;
            System.out.println("oke saldo nambah Rp " + this.saldo);
        } else {
            System.out.println("angka tidak boleh negatif");
        }
    }
    
    public String getNomorRekening() {
        this.nomorRekening = "123456";
        return this.nomorRekening;
    }


}