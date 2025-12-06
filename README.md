# Análise de Desempenho de Estruturas de Dados

Este projeto implementa e compara o desempenho de diferentes estruturas de dados (**Vetor**, **Árvore Binária de Busca** e **Árvore AVL**) em Java. O objetivo é analisar o tempo de execução de operações de inserção, busca e ordenação sob diferentes cenários de carga de dados.

## Funcionalidades

* **Estruturas Implementadas**:
    * **Vetor**: Array dinâmico com algoritmos de ordenação (*Bubble Sort*, *Quick Sort*) e pesquisa (Sequencial e Binária).
    * **Árvore Binária de Busca (ABB)**: Implementação clássica não balanceada.
    * **Árvore AVL**: Árvore autobalanceada com rotações para manter a altura otimizada.
* **Cenários de Teste**:
    * `ORDENADA`: Dados inseridos sequencialmente (pior caso para ABB).
    * `INVERSA`: Dados inseridos em ordem decrescente.
    * `ALEATORIA`: Dados gerados aleatoriamente.
* **Métricas**: Medição precisa do tempo de execução em nanosegundos (ns) ou milissegundos (ms).

---

## Pré-requisitos

* [Java JDK](https://www.oracle.com/java/technologies/downloads/) 8 ou superior instalado.
* Terminal ou Linha de Comandos.

---

##Como Compilar e Executar
Para executar este projeto, você precisará do Java JDK 8 ou superior instalado. Siga os passos abaixo utilizando o terminal (cmd, PowerShell ou Bash).

1. Compilação
Abra o terminal na raiz do projeto (a pasta que contém as subpastas auxiliar, estruturas, etc.) e execute o comando abaixo para compilar todos os arquivos de uma vez:
javac auxiliar\*.java estruturas\*.java TesteArvores\*.java TesteVetores\*.java

2. Execução
Após compilar, você pode executar qualquer um dos cenários de teste chamando a classe principal desejada com o seu nome qualificado (nome do pacote + nome da classe).

Exemplos de execução:
Para rodar o teste da Árvore AVL com 10.000 elementos:
java TesteArvores.TesteAVL10000

Para rodar o teste da Árvore ABB Simples com 1.000 elementos:
java TesteArvores.TesteArvore1000

Para rodar o teste de Vetores com 100 elementos:
java TesteVetores.TesterVetor100

Cenários de Teste
Cada execução rodará automaticamente 3 cenários distintos para os tamanhos definidos:
ORDENADA: Inserção de números sequenciais (Ex: 0, 1, 2...). Pior caso para ABB e QuickSort.
INVERSA: Inserção de números em ordem decrescente.
ALEATORIA: Inserção de números gerados randomicamente.
O resultado será exibido no console contendo o tempo médio das operações em milissegundos (ms) para árvores e nanossegundos (ns) para vetores.
