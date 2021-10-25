import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        Professor obj = new Professor("teste", "aaa");
        String nome = entry.nextLine();
        obj.setNome(nome);
        System.out.println(obj.getNome());
        System.out.println(obj.getNome().length());
        System.out.println(obj.getNome());
   }
}
