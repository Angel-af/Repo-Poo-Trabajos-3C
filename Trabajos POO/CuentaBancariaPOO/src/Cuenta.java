public abstract class Cuenta {
private String numeroCuenta;
private String titular;
private double saldo;

public Cuenta(String numeroCuenta, String titular, double saldo) {
    this.numeroCuenta = numeroCuenta;
    this.titular = titular;
    this.saldo = saldo;
}


public void depositar (double cantidad){
    if(cantidad > 0){ //Validación para cantidad para depositar
       saldo += cantidad;
    }else{
        System.out.println("No se puede hacer un deposito de: " + cantidad);
    }
}

public void retirar(double cantidad){
    if(cantidad > 0 && saldo >= cantidad){
        if(cantidad%100==0){
            saldo -= cantidad;
        }else{
            System.out.println("Solo puedes retirar multiplos de 100");
        }

    }else{
        System.out.println("No tienes suficiente saldo");
    }
}

public String getNumeroCuenta() {
    return numeroCuenta;
}

public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
}



}
