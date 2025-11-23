package estruturas;

public class Arvore {
    private No raiz; 

    public void inserir(int valor) {
        raiz = inserirArvoreBinaria(raiz, valor);
    }

    private No inserirArvoreBinaria(No node, int valor) {
        if (node == null) return new No(valor);
        
        if (valor < node.valor)
            node.esquerda = inserirArvoreBinaria(node.esquerda, valor);
        else if (valor > node.valor)
            node.direita = inserirArvoreBinaria(node.direita, valor);
            
        return node;
    }

    public boolean buscar(int valor) {
        return busca(raiz, valor);
    }

    private boolean busca(No node, int valor) {
        if (node == null) return false;
        if (valor == node.valor) return true;
        
        if (valor < node.valor) return busca(node.esquerda, valor);
        else return busca(node.direita, valor);
    }
}
