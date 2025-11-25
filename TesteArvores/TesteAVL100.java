package TesteArvores;

import estruturas.ArvoreAVL;
import auxiliar.GeradorDados;
import java.util.Random;

public class TesteAVL100 {
    public static void main(String[] args) {
        int TAMANHO = 100;
        int EXECUCOES = 5;
        String[] cenarios = {"ORDENADA", "INVERSA", "ALEATORIA"};

        System.out.println("=== TESTE ARVORE AVL: " + TAMANHO + " ELEMENTOS ===");

        for (String cenario : cenarios) {
            System.out.println("\n>>> Cenario: " + cenario);
            long tInsercao = 0, tBusca = 0;

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

                ArvoreAVL avl = new ArvoreAVL();
                long inicio = System.nanoTime();
                for (int v : dados) avl.inserir(v);
                tInsercao += (System.nanoTime() - inicio);

                inicio = System.nanoTime();
                for (int alvo : alvos) avl.buscar(alvo);
                tBusca += (System.nanoTime() - inicio);
            }

            System.out.printf("Media Insercao:   %.4f ms%n", (tInsercao/EXECUCOES)/1_000_000.0);
            System.out.printf("Media Busca:      %.4f ms%n", (tBusca/EXECUCOES)/1_000_000.0);
        }
    }
}