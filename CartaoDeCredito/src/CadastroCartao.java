import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCartao {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        ArrayList<CartaoDeCredito> lista = new ArrayList<>();
        int op = 0;
        while (op !=9){
            System.out.println("1-Cadastrar cartão");
            System.out.println("2-Consultar cartão por número");
            System.out.println("3-Consultar cartão por bandeira");
            System.out.println("4-Comprar com um cartão");
            System.out.println("5-Pagar um cartão");
            System.out.println("9-Fim");
            op = entry.nextInt(); entry.nextLine();
            switch (op){
                case 1 :
                    System.out.println("Informe o número do cartão:");
                    int numero = entry.nextInt(); entry.nextLine();
                    System.out.println("Informe a bandeira do cartão");
                    String bandeira = entry.nextLine();
                    CartaoDeCredito cartao = new CartaoDeCredito(numero, bandeira);
                    lista.add(cartao);
                    break;
                case 2 :
                    System.out.println("Informe o número do cartao desejado");
                    numero = entry.nextInt();
                    for (int j = 0; j < lista.size();j++){
                        if (numero == lista.get(j).getNumero()){
                            System.out.println("Numero: " +lista.get(j).getNumero());
                            System.out.println("Bandeira: " +lista.get(j).getBandeira());
                            System.out.println("Limite: " +lista.get(j).getLimite());
                            System.out.println("Bônus: " +lista.get(j).getBonus());
                            System.out.println("Saldo :" + lista.get(j).getSaldo());

                        }
                    }
                    break;
                case 3 :
                    System.out.println("Informe a bandeira a procurar");
                    bandeira = entry.nextLine();
                    for (int i = 0; i < lista.size();i++){
                        if  (lista.get(i).getBandeira().equals(bandeira)){
                            System.out.println(lista.get(i).getNumero());
                        }
                    }
                    break;
                case 4 :
                    System.out.println("Informe o numero do cartão");
                    numero = entry.nextInt(); entry.nextLine();
                    for (int k = 0; k < lista.size();k++){
                        if (numero == lista.get(k).getNumero()){
                            System.out.println("Cartão encontrado!");
                            System.out.println("Informe um valor de compra:");
                            float valor = entry.nextFloat();
                            lista.get(k).addComprar(valor);
                        }
                    }
                    break;
                case 5 :
                    System.out.println("Informe o numero do cartão");
                    numero = entry.nextInt();
                    for (int l = 0; l < lista.size(); l++ ){
                        if (numero == lista.get(l).getNumero()){
                            System.out.println("Cartão encontrado!");
                            System.out.println("Informe o valor do pagamento:");
                            float valor = entry.nextFloat();
                            lista.get(l).addPagar(valor);
                        }
                    }
                    break;
                case 6 :
                    System.out.println("Encerrando sistema...");
                    break;
            }
        }
    }
}
