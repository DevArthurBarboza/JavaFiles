import java.util.Scanner;

public class tenElement {
    public static void main(String[] args) {
        int teste1[] = new int[10];
        int teste2[] = new int[10];
        Scanner entry = new Scanner(System.in);
        for (int i = 0; i < teste1.length; i++){
            System.out.println("Informe um valor");
            teste1[i] = entry.nextInt();


            if (i % 2 == 0 ){
                teste2[i] = teste1[i] * 5;
            } else {
                teste2[i] = teste1[i] + 5;
            }
        }
        System.out.println("###########");
        for (int i = 0; i < teste1.length; i++){
            System.out.println(teste2[i]);
        }

    }
}

   class aaa{


   }