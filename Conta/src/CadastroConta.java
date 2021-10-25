import java.util.Scanner;
import java.util.ArrayList;


public class CadastroConta {
    public static void main(String[] args) {
        Scanner entry = new Scanner (System.in);
        String nome;
        Conta con ;
        boolean achouConta;

        ArrayList <Conta> lista = new ArrayList<>();
        int op = 0,numero;
        while ( op != 9 ) {

            System.out.println("1-Criar Conta");
            System.out.println("2-Consular todas as Conta");
            System.out.println("3-Consular Conta Individual");
            System.out.println("4-Depósito");
            System.out.println("5-Saque");
            System.out.println("6-Atualizar Titular");
            System.out.println("9-Encerrar");
            op = entry.nextInt();
            entry.nextLine();



            switch (op) {
                case 1:
                    System.out.println("Numero:");
                    numero = entry.nextInt(); entry.nextLine();
                    System.out.println("Nome:");
                    nome = entry.nextLine();
                    con = new Conta(numero, nome);
                    lista.add(con);
                    break;
                case 2:

                    for (int i = 0; i < lista.size(); i++) {
                        con = lista.get(i);
                        System.out.println("Numero: " + con.getNumero());
                        System.out.println("Titular: " + con.getTitular());
                        System.out.println("Saldo: " + con.getSaldo());
                    }
                    break;

                case 3:
                    System.out.println("Número: ");
                    numero = entry.nextInt(); entry.nextLine();
                    achouConta = false;
                    for (int i = 0; i < lista.size(); i++) {
                        con = lista.get(i);
                        if (con.getNumero() == numero){
                            achouConta = true;
                            System.out.println("Numero: " + con.getNumero());
                            System.out.println("Titular: " + con.getTitular());
                            System.out.println("Saldo: " + con.getSaldo());
                            break;
                        }

                    }

                    if (achouConta == false){
                        System.out.println("Conta não cadastrada");
                    }

                    break;

                case 4:
                    System.out.println("Numero da conta");
                    numero = entry.nextInt();

                   for (int i = 0; i < lista.size();i++)
                       con = lista.get(i);
                   if (con.getNumero == numero)  {

                   }

                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 9:
                    System.out.println("Encerrando sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
            }





        /*    for (int i = 0; i != 3; i++){
        System.out.println("Titular:");
        titular = entry.nextLine();
        System.out.println("Numero:");
        numConta = entry.nextInt(); entry.nextLine();
        conta = new Conta(numConta, titular);
        listaConta.add (conta);

    }


    for (int i = 0; i!=3; i++){
        conta= listaConta.get(i);
        System.out.println("Titular: " + conta.getTitular() + " Saldo: " +  conta.getSaldo());
    }*/

        }
    }
}
