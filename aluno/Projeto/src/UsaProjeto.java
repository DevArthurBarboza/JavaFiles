import java.util.Scanner;

public class UsaProjeto {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        System.out.println("Iniciando sistema...");
        System.out.println("Informe o nome do projeto");
        String nome = entry.nextLine();

        System.out.println("Informe o custo por hora do projeto");
        double custoHora = entry.nextDouble();
        Projeto objProjeto = new Projeto(nome,custoHora);

        int op = 0;
        while (op != 9){
            System.out.println("***Menu***");
            System.out.println("1-Registrar horas trabalhadas");
            System.out.println("2-Consultar preço do projeto");
            System.out.println("9-Encerrar projeto");
            op = entry.nextInt(); entry.nextLine();
            if (op == 1){



                System.out.println("Informe as horas trabalhadas no projeto");
                int hora = entry.nextInt();
                objProjeto.registrarHoras(hora);




            } else if (op == 2){
                System.out.println("O custo atual é " + objProjeto.getCustoAtual());
            } else if (op == 9){
                System.out.println("Programa finalizado com sucesso!");
            }


        }

    }
}
