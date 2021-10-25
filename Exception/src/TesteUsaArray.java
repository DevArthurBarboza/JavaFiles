import java.util.InputMismatchException;
import java.util.Scanner;
public class TesteUsaArray{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        int opcao = 0;
        UsaArray usa = new UsaArray();
        while (opcao != 9){
            System.out.println("1-Carregar array A");
            System.out.println("2-Carregar array B");
            System.out.println("3-mostra array A");
            System.out.println("4-mostra array B");
            System.out.println("5-mostra array C");
            System.out.println("6-Atualizar Array A");
            System.out.println("7-Atualizar Array B");
            System.out.println("8-Atualizar Array C");
            System.out.println("9-gerar array C divisão");
            System.out.println("10-fim");
//3)implemente try..catch
            try{
                opcao = teclado.nextInt();
            } catch (InputMismatchException exception){
                System.out.println("Valor inserido inválido");
                teclado.nextLine();
                continue;
            }

            switch(opcao){
                case 1 : //4) invocar o método carregaArray()
                    usa.carregaArray(a);
                    break;
                case 2 : //5) invocar o método carregaArray()
                    usa.carregaArray(b);
                    break;
                case 3 : //6) invocar o método mostraArray() e mostrar os números do array A
                    System.out.println(usa.mostraArray(a));
                    break;
                case 4 : //7) invocar o método mostraArray() e mostrar os números do array B
                    System.out.println(usa.mostraArray(b));
                    break;
                case 5 : //8) invocar o método mostraArray() e mostrar os números do array C
                    System.out.println(usa.mostraArray(c));
                    break;
                case 6:
                    System.out.println("Informe a posição");
                    int posicao = teclado.nextInt();
                    System.out.println("Informe o novo valor");
                    int novoValor = teclado.nextInt();
                    try{
                        usa.atualizaArray(a, posicao , novoValor);
                    } catch (IndexOutOfBoundsException exception){
                        System.out.println(exception.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Informe a posição");
                    posicao = teclado.nextInt();
                    System.out.println("Informe o novo valor");
                    novoValor = teclado.nextInt();
                    try{
                        usa.atualizaArray(b, posicao , novoValor);
                    } catch (IndexOutOfBoundsException exception){
                        System.out.println(exception.getMessage());
                    }
                    break;
                case 8:
                    System.out.println("Informe a posição");
                    posicao = teclado.nextInt();
                    System.out.println("Informe o novo valor");
                    novoValor = teclado.nextInt();
                    try{
                        usa.atualizaArray(c, posicao , novoValor);
                    } catch (IndexOutOfBoundsException exception){
                        System.out.println(exception.toString());
                    }catch (InputMismatchException exception){
                        System.out.println(exception.toString());
                    }
                    break;
                case 9 : //9) invocar o método geraArrayDivisao() para carregar o array C
                    c = usa.geraArrayDivisao(a,b);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}