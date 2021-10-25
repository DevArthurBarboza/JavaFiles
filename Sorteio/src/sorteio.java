import java.util.Scanner;

public class sorteio {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int sorteio,valor,tentativas = 0;
        sorteio = (int)(Math.random() * 10000);
        boolean ganhou = false;

        for (int i = 0; i <= 19; i++){

            System.out.println("Informe um valor");
            valor=entry.nextInt();
            tentativas += 1;

            if (valor > sorteio) {
                System.out.println("Maior do que o número sorteado");
                } else if (valor < sorteio) {
                System.out.println("Menor do que o número sorteado");
                    } else if (valor == sorteio) {
                        System.out.println("Acertou!!");
                        ganhou = true;
                        break;
                        }



        }
        if (ganhou == true) {
            System.out.println("Parabéns! \n  Você ganhou! \n Acertou com " + tentativas + " tentativas");
        } else {
            System.out.println("Que pena! Você perdeu");
        }


    }

}
