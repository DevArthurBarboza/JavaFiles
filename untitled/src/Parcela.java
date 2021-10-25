import java.util.Scanner;

public class Parcela {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Informe o valor da compra");
        double valorCompra;
        valorCompra = entry.nextDouble();
        System.out.println("1-Pagamento a vista; 2-Pagamento Parcelado");
        int tipoCompra;
        tipoCompra = entry.nextInt();
        if (tipoCompra == 1) {
            System.out.println("Pagamento a vista selecionado");

        } else if (tipoCompra == 2) {
            System.out.println("Quantidade de parcelas:");
            int parcela;
            parcela = entry.nextInt();
            double cadaParcela;
            cadaParcela = valorCompra / parcela;
            System.out.println("O valor individual das parcelas é R$" + cadaParcela);

        } else {
            System.out.println("Valor inválido");


        }

    } }

