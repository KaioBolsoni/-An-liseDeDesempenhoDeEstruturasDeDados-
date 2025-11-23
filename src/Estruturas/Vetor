package estruturas;

public class Vetor {
    private int[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }

    public void inserir(int valor) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = valor;
            tamanho++;
        }
    } 

    public int buscaBinaria(int valor) {
        int inicio = 0, fim = tamanho - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (elementos[meio] == valor) return meio;
            else if (elementos[meio] < valor) inicio = meio + 1;
            else fim = meio - 1;
        }
        return -1;
    }

    public int buscaSequencial(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == valor) return i;
        }
        return -1;
    }

    public void bubbleSort() {
            for (int i = 0; i < tamanho - 1; i++) {
                for (int j = 0; j < tamanho - 1 - i; j++) {
                    if (elementos[j] > elementos[j + 1]) {
                        int temp = elementos[j];
                        elementos[j] = elementos[j + 1];
                        elementos[j + 1] = temp;
                    }
                }
            }
        }

    public void quickSort() {
        quickSortRecursivo(0, tamanho - 1);
    }

    private void quickSortRecursivo(int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndex = particao(inicio, fim);
            quickSortRecursivo(inicio, pivoIndex - 1);
            quickSortRecursivo(pivoIndex + 1, fim);
        }
    }

    private int particao(int inicio, int fim) {
        int pivo = elementos[fim];
        int i = (inicio - 1);
        for (int j = inicio; j < fim; j++) {
            if (elementos[j] <= pivo) {
                i++;
                int temp = elementos[i];
                elementos[i] = elementos[j];
                elementos[j] = temp;
            }
        }
        int temp = elementos[i + 1];
        elementos[i + 1] = elementos[fim];
        elementos[fim] = temp;
        return i + 1;
    }
        
} 