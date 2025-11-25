package TesteVetores;

import estruturas.Vetor;
import auxiliar.GeradorDados; 

public class TesterVetor1000 {
    public static void main(String[] args) {
        int TAMANHO = 1000;
        int EXECUCOES = 5;
        String[] cenarios = {"ORDENADA", "INVERSA", "ALEATORIA"};

        System.out.println("=== TESTE VETOR: " + TAMANHO + " ELEMENTOS ===");

        for (String cenario : cenarios) {
            System.out.println("\n>>> Cenario: " + cenario);
            long tInsercao = 0, tBusca = 0, tBubble = 0, tQuick = 0;

            for (int k = 0; k < EXECUCOES; k++) {
                int[] dados = GeradorDados.gerar(TAMANHO, cenario);

                // Teste Inserção
                Vetor vetor = new Vetor(TAMANHO);
                long inicio = System.nanoTime();
                for (int v : dados) vetor.inserir(v);
                tInsercao += (System.nanoTime() - inicio);

                // Teste Busca Sequencial (Busca o último elemento)
                int alvo = dados[TAMANHO - 1]; 
                inicio = System.nanoTime();
                vetor.buscaSequencial(alvo);
                tBusca += (System.nanoTime() - inicio);

                // Teste Ordenação
                Vetor vBubble = new Vetor(TAMANHO);
                Vetor vQuick = new Vetor(TAMANHO);
                
                for(int v : dados) { 
                    vBubble.inserir(v); 
                    vQuick.inserir(v); 
                }

                inicio = System.nanoTime();
                vBubble.bubbleSort();
                tBubble += (System.nanoTime() - inicio);

                inicio = System.nanoTime();
                vQuick.quickSort();
                tQuick += (System.nanoTime() - inicio);
            }

            System.out.println("Media Insercao:   " + (tInsercao/EXECUCOES) + " ns");
            System.out.println("Media Busca Seq:  " + (tBusca/EXECUCOES) + " ns");
            System.out.println("Media BubbleSort: " + (tBubble/EXECUCOES) + " ns");
            System.out.println("Media QuickSort:  " + (tQuick/EXECUCOES) + " ns");
        }
    }
}