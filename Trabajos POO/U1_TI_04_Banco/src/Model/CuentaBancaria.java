package Model;

public class CuentaBancaria {
    
    private String titular;
    private double saldo;


    // Getters and setters    

    public String getTitular() { /* */
        
        return titular;
    }

    public void setTitular(String titular) { /* */
        this.titular = titular;
    }

    public double getSaldo() { /* */

        return saldo;
    }


     //methods
    public void depositar (double monto){

        if (monto > 0){
            saldo += monto;
            System.out.println("Saldo: "+this.saldo);
            System.out.println("Operación exitosa");
            System.out.println(" ");

        }

    }

    public boolean retirar (double monto){

        if (monto>0  && saldo >= monto){
            saldo-=monto;
            System.out.println("Saldo: "+this.saldo);
            System.out.println("Operación exitosa");
            System.out.println(" ");
            return true;
           
        }else{
             System.out.println("Sin fondos suficientes para teirar ");
             System.out.println("Tu saldo es de: "+this.saldo);
              return false;
        }
        

    }


}
