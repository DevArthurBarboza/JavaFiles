import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Conta conta = new Conta(1000.00,123);
        System.out.println(conta.getDados());
        int opcao = 0;
        while (opcao != 9){
            System.out.println("1-Atualizar Numero");
            System.out.println("2-Depositar");
            System.out.println("3-Sacar");
            System.out.println("4-Verificar dados");
            System.out.println("9-Fim");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Informe o numero");
                    int numero = input.nextInt();
                    try{
                        conta.setNumero(numero);
                    } catch(IllegalArgumentException exception){
                        System.out.println(exception.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Informe o valor de depósito");
                    double deposito = input.nextDouble();
                    try{
                        conta.deposito(deposito);
                    } catch(IllegalArgumentException exception){
                        System.out.println(exception.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Informe o valor de saque");
                    double saque = input.nextDouble();
                    try{
                        conta.saque(saque);
                    } catch(IllegalArgumentException exception){
                        System.out.println(exception.getMessage());
                    }
                    break;
                case 4:
                    System.out.println(conta.getDados());
                    break;
                case 9:
                    System.out.println("Encerrando sistema...");
                    break;
            }
        }
    }
}
