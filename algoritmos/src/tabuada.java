import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        String answer="Y";
        int number;
        Scanner entry = new Scanner(System.in);
        while (answer.equals("Y") ) {
            System.out.println("enter a value:");
            number = entry.nextInt();
            for (int i = 1; i < 11; i++){
                System.out.println (number + "x" + i + "=" + (number * i));
            }
            System.out.println("Continue? (Y/N)");
            answer = entry.next();
        }
        System.out.println("Ending process");
    }
}
