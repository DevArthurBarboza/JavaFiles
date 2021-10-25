public class Conta {
    private String titular;
    private double saldo;
    private int numero;


    public Conta (int numero, String titular){
        this.numero = numero;
        this.titular = titular;
    }

    public void setTitular(String novoTitular){
        this.titular = novoTitular;

    }

    public String getTitular(){
        return this.titular;
    }

    public int getNumero(){
        return this.numero;
    }


    public void depositar(double valor){
        if (valor > 0 ){
            this.saldo += valor;
        } else {
            System.out.println("Valor inválido");
        }

    }

    public void sacar(double valor){
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
                System.out.println("Valor inválido");
        }

        System.out.println("Novo Saldo: " + getSaldo());

    }

    public double getSaldo(){
        return this.saldo;
    }
}
