import java.util.Scanner;

public class UsaCartao {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Informe o número do cartão");
        int numero = entry.nextInt(); entry.nextLine();
        System.out.println("Informe o limite do cartão");
        float limite = entry.nextFloat(); entry.nextLine();
        System.out.println("Informe a bandeira do cartão");
        String bandeira = entry.nextLine();
        CartaoDeCredito cartao = new CartaoDeCredito(numero, limite, bandeira);
        int op = 0;
        while (op != 9){
            System.out.println("1-Atualizar bandeira");
            System.out.println("2-Atualizar limite");
            System.out.println("3-Comprar");
            System.out.println("4-Pagar");
            System.out.println("5-Consulta Cartão");
            System.out.println("9-Encerrar Programa");
            op = entry.nextInt(); entry.nextLine();
            switch (op){
                case 1:
                    System.out.println("Informe a nova bandeira");
                    bandeira = entry.nextLine();
                    cartao.setBandeira(bandeira);
                    break;
                case 2:
                    System.out.println("Informe o novo limite");
                    limite = entry.nextFloat();
                    cartao.setLimite(limite);
                    break;
                case 3:
                    System.out.println("Informe o valor da compra");
                    float compra = entry.nextFloat();
                    cartao.addComprar(compra);
                    break;
                case 4:
                    System.out.println("Informe o valor do pagamento");
                    float pag = entry.nextFloat();
                    cartao.addPagar(pag);
                    break;
                case 5:
                    System.out.println("Nunero : " + cartao.getNumero());
                    System.out.println("Bandeira : " + cartao.getBandeira());
                    System.out.println("Saldo : " + cartao.getSaldo());
                    System.out.println("Bônus: " + cartao.getBonus());
                    System.out.println("Limite : " + cartao.getLimite());
                    break;
                case 9:
                    System.out.println("Encerrando sistema...");
                    break;
            }
        }



    }
}
