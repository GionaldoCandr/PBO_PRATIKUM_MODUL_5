public class RekeningBank {
    private String nomorReknning;
    private int saldo; 


    RekeningBank(String nomorReknning, int saldo){
        this.nomorReknning = nomorReknning;
        setSaldo(saldo);


    }


    public int getSaldo(){
        return this.saldo;
    }

    public void setSaldo(int saldoBaru){
        if(saldoBaru <0){
            System.out.println("Saldo tidak boleh negatif");
        }else {
            this.saldo = saldoBaru;
            System.out.println("MANTAP");
        }
    }








}
