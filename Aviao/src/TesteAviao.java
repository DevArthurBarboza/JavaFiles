import java.util.Scanner;

public class TesteAviao {
    public static void main(String[] args) {
        Scanner entry = new Scanner (System.in);
        System.out.println("Informe a quantidade máxima de passageiros do voo");
        int max = entry.nextInt(); entry.nextLine();
        Aviao aviaoObj = new Aviao (max);
        System.out.println("Informe o nome do voo");
        String aux = entry.nextLine();
        aviaoObj.setNomeVoo(aux);

        int op = 0;
        while (op != 9){
            System.out.println("1-Consultar dados do Voo");
            System.out.println("2-Embarcar");
            System.out.println("3-Desembarcar");
            System.out.println("4-Decolar");
            System.out.println("5-Pousar");
            System.out.println("9-Encerrar");
            op = entry.nextInt();

            switch (op){
                case 1 :
                    System.out.println("Quantidade máxima de passageiros: " + aviaoObj.getQuantidadeMaxima());
                    System.out.println("Quantidade de passageiros: " + aviaoObj.getQuantidadePassageitos());
                    System.out.println("Nome do voo: " + aviaoObj.getNomeVoo());
                    System.out.println("Estado do voo: " + aviaoObj.getEstado());
                    break;
                case 2 : aviaoObj.embarcar();
                    break;
                case 3 : aviaoObj.desembarcar();
                    break;
                case 4 : aviaoObj.decolar();
                    break;
                case 5 : aviaoObj.pousar();
                    break;
                case 9 :
                    System.out.println("Encerrando sistema...");



            }

        }
    }
}
