public class CuentaAhorros extends Cuenta {
    private double tasaInteresanual;

    public double getTasaInteresAnual() {
        return tasaInteresanual;
    }

    public void aplicarInteres(){
        double interes=saldp*(tasaInteresAnual());



    }

    public CuentaAhorros(String numeroCuenta, String titular, double saldo, double tassaInteresanual) {
        super (numeroCuenta, titular, saldo);
        this.tasaInteresanual = tassaInteresanual;

    }
    public void setTasaInteresanual()double tasaInteresAnual() {
        this.tasaInteresanual = tasaInteresanual;
    }

}

