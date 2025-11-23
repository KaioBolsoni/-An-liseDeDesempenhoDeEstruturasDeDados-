<<<<<<<< HEAD:estruturas/No.java
package estruturas;

========
package src.estruturas;
>>>>>>>> 0817e2ac622a81dcb192e702100beca20a8bf967:src/Estruturas/No.java
public class No {
    int valor;
    No esquerda, direita;
    int altura;

    public No(int valor) {
        this.valor = valor;
        this.altura = 1;
    }
}