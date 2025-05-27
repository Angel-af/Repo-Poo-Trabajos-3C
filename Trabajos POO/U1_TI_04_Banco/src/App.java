import Model.CuentaBancaria;

public class App {
    public static void main(String[] args) throws Exception {
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.depositar(1000);
        cuenta1.retirar(200);
        cuenta1.retirar(10000);



    }
}
