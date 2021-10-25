import java.sql.SQLOutput;
import java.util.Scanner;

public class Tela {
    public static void main(String[] args) {
        int op ;
        int fim = 0;
        Scanner entry = new Scanner(System.in);
        Aluno obj = new Aluno() ;

      while (fim ==0) {
           obj.setInfo();
           System.out.println("Informações Inseridas com Sucesso!");
           System.out.println("1-Alterar Dados / 2 - Apresentar o menu");
           op= entry.nextInt();

           if (op == 2){
               obj.menu();
               obj.finalizar(fim);
           } else if (op == 1){

          }
       }



    }
}
