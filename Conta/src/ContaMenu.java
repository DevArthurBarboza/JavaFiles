import java.util.Scanner;

public class ContaMenu {
    public static void main(String[] args) {

        Scanner entry = new Scanner (System.in);
        int op = 0;
        double valor ;
        String titular;
        int numConta;

        System.out.println("Informe o titular da conta");
        titular = entry.nextLine();
        System.out.println("Informe o numero da conta");
        numConta = entry.nextInt();

        Conta con = new Conta(numConta,titular);


        while (op != 9 ){

            System.out.println("1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Consulta");
            System.out.println("9-Encerrar");
            op = entry.nextInt(); entry.nextLine();

            switch(op){
                case 1 :
                    System.out.println("Valor:");
                    valor = entry.nextDouble();
                    con.depositar(valor);
                break;
                case 2 :
                    System.out.println("Valor:");
                    valor = entry.nextDouble();
                    con.sacar(valor);
                    break;
                case 3:
                    System.out.println("Titular: " + con.getTitular());
                    System.out.println("Seu saldo é :" + con.getSaldo());
                    break;
                case 9 :
                    System.out.println("Encerrando sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
            }





        }
    }
}
