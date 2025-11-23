package src.estruturas;
public class No {
    int valor;
    No esquerda, direita;
    int altura;

    public No(int valor) {
        this.valor = valor;
        this.altura = 1;
    }
}