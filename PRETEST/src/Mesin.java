public class Mesin {
    public static void main(String[] args) throws Exception {


        RekeningBank mesin = new RekeningBank("123456", 1000000);
        
        mesin.isiSaldo(1000000);

        mesin.isiSaldo(-1000000);

        mesin.isiSaldo(1000000);

    }
}
