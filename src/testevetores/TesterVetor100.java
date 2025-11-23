package src.testevetores;

import estruturas.Vetor; // Importando sua classe
import auxiliar.GeradorDados; // Importando o gerador

public class TesterVetor100 {
    public static void main(String[] args) {
        int TAMANHO = 100; // <--- MUDE PARA 1000 e 10000 NOS OUTROS ARQUIVOS
        int EXECUCOES = 5;
        String[] cenarios = {"ORDENADA", "INVERSA", "ALEATORIA"};

        System.out.println("=== TESTE VETOR: " + TAMANHO + " ELEMENTOS ===");

        for (String cenario : cenarios) {
            System.out.println("\n>>> Cenario: " + cenario);
            long tInsercao = 0, tBusca = 0, tBubble = 0, tQuick = 0;

            for (int k = 0; k < EXECUCOES; k++) {
                int[] dados = GeradorDados.gerar(TAMANHO, cenario);
                Vetor vetor = new Vetor(TAMANHO);

                // 1. Inserção
                long inicio = System.nanoTime();
                for (int v : dados) vetor.inserir(v);
                tInsercao += (System.nanoTime() - inicio);

                // 2. Busca Sequencial (Pior caso: ultimo elemento)
                int alvo = dados[TAMANHO - 1];
                inicio = System.nanoTime();
                vetor.buscaSequencial(alvo);
                tBusca += (System.nanoTime() - inicio);

                // 3. Ordenação (Bubble e Quick em vetores separados)
                Vetor vBubble = new Vetor(TAMANHO);
                Vetor vQuick = new Vetor(TAMANHO);
                for(int v : dados) { vBubble.inserir(v); vQuick.inserir(v); }

                inicio = System.nanoTime();
                vBubble.bubbleSort();
                tBubble += (System.nanoTime() - inicio);

                inicio = System.nanoTime();
                vQuick.quickSort();
                tQuick += (System.nanoTime() - inicio);
            }

            System.out.println("Media Insercao: " + (tInsercao/EXECUCOES) + "ns");
            System.out.println("Media Busca:    " + (tBusca/EXECUCOES) + "ns");
            System.out.println("Media Bubble:   " + (tBubble/EXECUCOES) + "ns");
            System.out.println("Media Quick:    " + (tQuick/EXECUCOES) + "ns");
        }
    }
}