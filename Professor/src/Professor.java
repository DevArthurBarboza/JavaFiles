public class Professor {
    private String nome;
    private String matricula;


    public Professor(String nome,String matricula){
       this.nome = nome;
       this.matricula = matricula;
    }

    public void setNome(String novoNome){
        if (novoNome.trim().length() > 0){
            this.nome = novoNome.trim();
        }
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getNome(){
        return this.nome;
    }


}
