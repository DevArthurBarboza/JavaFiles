import java.util.Scanner;

public class Veiculo {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String modelo, fabricante;
        double valor, valorFim,impostoBr,vendedor;
        System.out.println("Informe o modelo");
        modelo = entry.next();
        System.out.println("Informe a marca");
        fabricante = entry.next();
        System.out.println("Informe o valor de custo do veículo");
        valor = entry.nextDouble();
        impostoBr = (valor * 45) / 100;
        vendedor = (valor * 28) / 100;
        valorFim = valor + vendedor + impostoBr;
        System.out.println("O valor total do veículo é : R$ " + valorFim + "\nO valor de impostos é de : R$ " + impostoBr + "\nO valor de comissão do vendedor é de : R$ " + vendedor);
        System.out.println("O modelo do carro é : " + modelo + " da fabricante : " + fabricante);
    }
}
