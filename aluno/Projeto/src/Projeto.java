import java.util.Scanner;

public class Projeto {
    private String nome;
    private int hora;
    private Double custoHora;

    public Projeto(String nome, Double custoHora){
        this.custoHora = custoHora;
        this.nome = nome;

    }

    public void registrarHoras(int hora){
        if (hora > 0){
            this.hora += hora;
        } else System.out.println("Valor inserido inválido");

    }

    public double getCustoAtual(){
        double custoAtual ;
        custoAtual = (this.custoHora * this.hora);
        return custoAtual;
    }
}
