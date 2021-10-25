public class Conta {
    private Double saldo;
    private int numero;

    public Conta(Double saldo, int numero){
        this.saldo = saldo;
        this.numero = numero;
    }

    public void setNumero(int novoNumero) {
        if (novoNumero > 10000 || novoNumero < 0){
            throw new IllegalArgumentException("Valor Inválido");
        } else {
            this.numero = novoNumero;
        }
    }

    public String getDados(){
        return "Número : " + numero + "\nSaldo : " + getSaldo();
    }

    public double getSaldo(){
        return saldo;
    }

    public void saque(double saque){
        if (saque > this.saldo){
            throw new IllegalArgumentException("Saldo insuficiente");
        } else {
            this.saldo -= saque;
        }
    }

    public void deposito(double deposito){
        if (deposito < 0){
            throw new IllegalArgumentException("Valor informado inválido");
        } else {
            this.saldo += deposito;
        }
    }

}
