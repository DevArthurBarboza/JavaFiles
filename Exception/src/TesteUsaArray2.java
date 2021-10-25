public class TesteUsaArray2 {
    public static void main(String[] args) {
        int [] array = {4,5,6,7,8,1};
        int posicao = 6;
        int novoValor = 20;
        UsaArray usaArray= new UsaArray();
        try{
            usaArray.atualizaArray(array,posicao,novoValor);
        } catch(IndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Erro tratado com sucesso");
    }
}
