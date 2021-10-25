public class CartaoDeCredito {
    private int numero;
    private float saldo;
    private float limite;
    private float bonus;
    private String bandeira;

    public CartaoDeCredito(int numero, String bandeira) {
        this.bandeira = bandeira;
        this.numero = numero;
    }

    public CartaoDeCredito(int numero, float limite, String bandeira) {
        this.numero = numero;
        this.limite = limite;
        this.bandeira = bandeira;
    }

    private void creditaBonus(float valor) {
        this.bonus += valor;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public float getLimite() {
        return this.limite;
    }

    public void setLimite(float limite) {
        if (limite >= 0) {
            this.limite = limite;
        } else {
            System.out.println("Erro");
        }
    }

    public float getBonus() {
        return this.bonus;
    }

    public String getBandeira() {
        return this.bandeira;
    }

    public void setBandeira(String bandeira) {
        if (!bandeira.trim().equals("")) {
            this.bandeira = bandeira;
        } else {
            System.out.println("Erro");
        }
    }

    public int getNumero() {
        return this.numero;
    }

    public void addPagar(float valorPago) {
        this.saldo -= valorPago;
        creditaBonus(((valorPago / 100) * 2));
    }

    public void addComprar(float valorCompra){
        this.saldo += valorCompra;
        creditaBonus(((valorCompra / 100) * 3));
    }
}

