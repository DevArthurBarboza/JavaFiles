public class Tela {
    public static void main(String[] args) {
            Aluno obj = new Aluno();
            int esc = 0;
            while (esc != 9) {


                obj.setInfo();
                System.out.println("Dados inseridos com sucesso");
                esc = obj.menu();
            }
        System.out.println("Finalizando sistema");

    }
}

