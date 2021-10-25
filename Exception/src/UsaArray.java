import java.util.InputMismatchException;
import java.util.Scanner;
public class UsaArray{
    private Scanner teclado ;

    public UsaArray(){
        teclado = new Scanner(System.in);
    }

    public void carregaArray(int[] arr){ //1) implemente try..catch
        for(int i=0; i<arr.length; i++){
            System.out.println("Informe Numero: ");
            try{
                arr[i] = teclado.nextInt();
            } catch(InputMismatchException exception){
                System.out.println("Erro! Valor informado inválido");
                teclado.nextLine();
                i--;
            }

        }
    }

    public String mostraArray(int[] arr){
        String saida="";
        for(int i=0; i<arr.length; i++){
            saida = saida + arr[i] + '\n';
        }
        return saida;
    }

    public int[] geraArrayDivisao(int[] arrA, int[] arrB){ //2) implemente try..catch
        int aux[] = new int[arrA.length];
        for(int i=0; i<arrA.length; i++){
            try{
                aux[i] = arrA[i] / arrB[i];
            } catch (ArithmeticException exception) {
                System.out.println("Divisão por zero!");
            }
        }
        return aux;
    }

    public void atualizaArray(int[] array, int posicao, int novoValor) throws IndexOutOfBoundsException, InputMismatchException {
            array[posicao] = novoValor;

    }

}





