//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cuenta cuentaComun = new CuentaComun (numeroCuenta:"EDRV123456-CC", "Eliel Rodriguez", saldo:1000);
        CuentaComun.depositar(cantidad:500);
        CuentaComun.retirar(cantidad:500);


        CuentaAhorros CuentaAhorros = new CuentaAhorros(numeroCuenta: "EDRV")
    }
}