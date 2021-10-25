import java.util.Scanner;

public class Aluno {
    Scanner entry = new Scanner(System.in);
    private String nome,email,cidade,uf;

    public int menu(){
        int esc;
        System.out.println("** Menu: Informe a operação desejada **");
        System.out.println("1-Gravar");
        System.out.println("2-Excluir");
        System.out.println("3-Pesquisar");
        System.out.println("4-Alterar");
        System.out.println("9-Encerrar");
        esc = entry.nextInt(); entry.nextLine();

        switch (esc) {
            case 1 : gravar();
            break;
            case 2 : excluir();
            break;
            case 3 : pesquisar();
            break;
            case 4 : alterar();
            break;
            case 9 : System.out.println("Finalizando o sistema");
            break;
            default : System.out.println("Opção inválida");
        }
        return esc;
    }

    public void setInfo(){
        System.out.println("Informe o nome");
        this.nome = entry.nextLine();
        System.out.println("Informe o email");
        this.email = entry.nextLine();
        System.out.println("Informe a cidade");
        this.cidade = entry.nextLine();
        System.out.println("Informe o UF");
        this.uf = entry.nextLine();
    }

    public void getInfo() {
        System.out.println("Nome...: " + this.nome);
        System.out.println("Email..: " + this.email);
        System.out.println("cidade.: " + this.cidade);
        System.out.println("UF.....: " + this.uf);
    }

    public void gravar(){
        System.out.println("Dados gravadas com sucesso!!");
    }

    public void excluir(){
        System.out.println("Dados excluídos com sucesso!!");
    }

    public void pesquisar(){

        System.out.println("Pesquisa realizada!!");
    }

    public void alterar(){
        System.out.println("Dados alterados com sucesso!");
    }


}


