package src.Auxiliar;
import java.util.Random;

public class GeradorDados {
    public static int[] gerar(int tamanho, String tipo) {
        int[] dados = new int[tamanho];
        
        if (tipo.equals("ORDENADA")) {
            for (int i = 0; i < tamanho; i++) dados[i] = i;
        } 
        else if (tipo.equals("INVERSA")) {
            for (int i = 0; i < tamanho; i++) dados[i] = tamanho - i;
        } 
        else { 
            Random rand = new Random();
            for (int i = 0; i < tamanho; i++) dados[i] = rand.nextInt(tamanho * 10);
        }
        return dados;
    }
}