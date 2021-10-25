import java.util.Scanner;

public class Aluno {
    Scanner entry = new Scanner(System.in);
    public String nome,email,cidade,uf;
    public void menu(){
        int esc;
        System.out.println("** Informe a operação desejada **");
        System.out.println("1-Gravar");
        System.out.println("2-Excluir");
        System.out.println("3-Pesquisar");
        System.out.println("4-Alterar");
        esc = entry.nextInt();
        if (esc == 1){
            gravar();
        } else if (esc == 2){
            exluir();
        } else if (esc == 3){
            pesquisar();
        }else if (esc == 4){
            alterar();
        }
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
    public void gravar(){

    }
    public void exluir(){

    }
    public void pesquisar(){

    }
    public void alterar(){

    }
    public int finalizar(int fim){
        System.out.println("Deseja finalizar? 1-Sim/0-Não");
        fim = entry.nextInt();
        return  fim;

    }


       /* System.out.println("Nome...: " + this.nome);
        System.out.println("Email..: " + this.email);
        System.out.println("cidade.: " + this.cidade);
        System.out.println("UF.....: " + this.uf); */

}


