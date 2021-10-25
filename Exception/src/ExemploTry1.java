import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExemploTry1

{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];


        /* 1) faça um try..catch para tratar a entrada de dados do array a*/
        for (int i = 0; i < a.length; i++) {
            System.out.print("A: ");
            try{
                a[i] = teclado.nextInt();
            } catch(InputMismatchException exception){
                System.out.println("Erro na entrada de dados");
                teclado.nextLine();
            }

        }

        /* 2) Após testar o item 1, altere o catch para utilizar a exceção generica */
        /*
        for (int i = 0; i < a.length; i++) {
            System.out.print("A: ");
            try{
                a[i] = teclado.nextInt();
            } catch(Exception exception){
                System.out.println("Erro");
                teclado.nextLine();
            }

        }*/

        /* 3) faça um try com catch para tratar a entrada de dados do array b e divisão por zero */
        for (int i = 0; i < a.length; i++) {
            System.out.print("B: ");
            try{
                b[i] = teclado.nextInt();
            } catch(InputMismatchException exception){
                System.out.println("Valor inserido inválido");
                teclado.nextLine();
            }
            try{
            c[i] = a[i] / b[i];
            } catch(ArithmeticException exception){
                System.out.println("Valor 0 não é válido");
            }

        }


        /* 4) Que exceções podem ocorrem no trecho abaixo? Se for informado 5 na entrada de dados o que acontece?
         *
         * O valor 5 se referencia à um índice inexistente pois os valores referentes a índices vão de 0 a 4 : ArrayIndexOutOfBoundsException
         * Caso seja realizada uma entrada de dados do tipo String irá ocorrer um InputMismatchException
         *
         * Faça o tratamento de exceção. */
        int indice;
        for (int i = 0; i < 4; i++) {
            System.out.print("Informe o indice para consultar um valor no array c:");
            try{
                indice = teclado.nextInt();
                System.out.println(c[indice]);
            } catch(InputMismatchException exception){
                System.out.println("Tipo de dado inserido inválido");
                teclado.nextLine();
            } catch(ArrayIndexOutOfBoundsException exception){
                System.out.println("Indíce inexistente");
            } catch(Exception exception){
                System.out.println("Erro!");
            }

        }
    }
}
