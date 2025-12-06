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

## 🛠️ Pré-requisitos

* [Java JDK](https://www.oracle.com/java/technologies/downloads/) 8 ou superior instalado.
* Terminal ou Linha de Comandos.

---

