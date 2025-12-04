package TesteVetores;

import estruturas.Vetor;
import auxiliar.GeradorDados;
import java.util.Random;

public class TesterVetor100 {
    public static void main(String[] args) {
        int TAMANHO = 100;
        int EXECUCOES = 5;
        String[] cenarios = {"ORDENADA", "INVERSA", "ALEATORIA"};

        System.out.println("=== TESTE VETOR: " + TAMANHO + " ELEMENTOS ===");

        for (String cenario : cenarios) {
            System.out.println("\n>>> Cenario: " + cenario);
            long tInsercao = 0, tBuscaSeq = 0, tBuscaBin = 0, tBubble = 0, tQuick = 0;

            for (int k = 0; k < EXECUCOES; k++) {
                int[] dados = GeradorDados.gerar(TAMANHO, cenario);

                int[] alvos = new int[7];
                alvos[0] = dados[0];                       
                alvos[1] = dados[TAMANHO - 1];             
                alvos[2] = dados[TAMANHO / 2];            
                Random r = new Random();
                alvos[3] = dados[r.nextInt(TAMANHO)];      
                alvos[4] = dados[r.nextInt(TAMANHO)];     
                alvos[5] = dados[r.nextInt(TAMANHO)];      
                alvos[6] = -1;                             

                //Teste Inserção
                Vetor vetor = new Vetor(TAMANHO);
                long inicio = System.nanoTime();
                for (int v : dados) vetor.inserir(v);
                tInsercao += (System.nanoTime() - inicio);

                //Teste Busca Sequencial
                inicio = System.nanoTime();
                for (int alvo : alvos) {
                    vetor.buscaSequencial(alvo);
                }
                tBuscaSeq += (System.nanoTime() - inicio);

                Vetor vBubble = new Vetor(TAMANHO);
                Vetor vQuick = new Vetor(TAMANHO);
                
                for(int v : dados) { 
                    vBubble.inserir(v); 
                    vQuick.inserir(v); 
                }

                //Teste Bubble Sort
                inicio = System.nanoTime();
                vBubble.bubbleSort();
                tBubble += (System.nanoTime() - inicio);

                //Teste Quick Sort
                inicio = System.nanoTime();
                vQuick.quickSort();
                tQuick += (System.nanoTime() - inicio);

                //Busca Binária 
                inicio = System.nanoTime();
                for (int alvo : alvos) {
                    vQuick.buscaBinaria(alvo);
                }
                tBuscaBin += (System.nanoTime() - inicio);
            }

            System.out.println("Media Insercao:   " + (tInsercao/EXECUCOES) + " ns");
            System.out.println("Media Busca Seq:  " + (tBuscaSeq/EXECUCOES) + " ns");
            System.out.println("Media Busca Bin:  " + (tBuscaBin/EXECUCOES) + " ns");
            System.out.println("Media BubbleSort: " + (tBubble/EXECUCOES) + " ns");
            System.out.println("Media QuickSort:  " + (tQuick/EXECUCOES) + " ns");
        }
    }
}