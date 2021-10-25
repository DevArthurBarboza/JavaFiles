public class Aviao {
    private String nomeVoo;
    private int quantidadePassageiros;
    private char estado;
    private int quantidadeMaxima;

    public Aviao(int quantidadeMaxima) {
        this.estado = 'p';
        this.quantidadeMaxima = quantidadeMaxima;
    }


    public void decolar() {
        if (this.estado == 'p') {
            this.estado = 'v';
            System.out.println("Decolou!");
        }
    }

    public void pousar() {
        if (this.estado == 'v') {
            this.estado = 'p';
            System.out.println("Pousou!");
        }
    }

    public String getNomeVoo() {
        return this.nomeVoo;
    }

    public String getEstado(){
        String retorno ="";
        if (this.estado == 'p'){
            retorno = "Parado";
        } else if (this.estado == 'v'){
            retorno = "Voando";
        }
        return retorno;
    }

    public int getQuantidadePassageitos(){
        return this.quantidadePassageiros;
    }

    public void setNomeVoo(String novoNome){
        if (!(novoNome.trim().equals(""))){
            this.nomeVoo = novoNome;
        }
    }

    public void setQuantidadeMaxima(int quantidade){
        if ((quantidade < 0) & (quantidade < this.quantidadeMaxima)){
            this.quantidadeMaxima = quantidade;

        }
    }

    public int getQuantidadeMaxima(){
        return this.quantidadeMaxima;
    }

    public void embarcar(){
        if ((this.estado == 'p') & (this.quantidadePassageiros < this.quantidadeMaxima)){
            this.quantidadePassageiros += 1;
            System.out.println("Embarcou!");
        }
    }

    public void desembarcar(){
        if ((this.estado == 'p') & ((this.quantidadePassageiros - 1) >= 0 )){
            this.quantidadePassageiros -= 1;
            System.out.println("Desembarcou!");
        }
    }
}
