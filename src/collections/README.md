# Java Collections Framework

## Introdução List 📝

A interface `List` faz parte da Java Collections Framework e representa uma coleção ordenada de elementos, permitindo elementos duplicados e acesso por índice. É uma das estruturas de dados mais utilizadas devido à sua flexibilidade e eficiência em diversas operações.

As principais implementações de `List` são:
>- **ArrayList**: Baseado em um array dinâmico, oferece acesso rápido por índice, mas pode ser menos eficiente para inserções e remoções no meio da lista.

>- **LinkedList**: Implementado como uma lista duplamente encadeada, é eficiente para inserções e remoções, mas menos eficiente para acesso direto aos elementos.

>- **Vector**: Similar ao `ArrayList`, mas sincronizado para operações concorrentes. No entanto, sua utilização é menos comum atualmente devido a alternativas mais eficientes.

## Operações Comuns

A interface `List` fornece métodos úteis para manipulação dos elementos:
- `add(elemento)`: Adiciona um elemento ao final da lista.
- `add(indice, elemento)`: Insere um elemento em uma posição específica.
- `remove(indice)`: Remove um elemento com base no índice.
- `get(indice)`: Obtém o elemento de um índice específico.
- `set(indice, elemento)`: Substitui o elemento na posição especificada.
- `contains(elemento)`: Verifica se a lista contém um determinado elemento.
- `size()`: Retorna o número de elementos na lista.
- `subList(inicio, fim)`: Retorna uma visão parcial da lista.
- `sort(comparator)`: Ordena os elementos da lista com base em um comparador.

Além disso, a classe `Collections` oferece métodos auxiliares para manipulação eficiente de listas, como:
- `Collections.sort(lista)`: Ordena a lista de forma natural.
- `Collections.reverse(lista)`: Inverte a ordem dos elementos.
- `Collections.shuffle(lista)`: Embaralha os elementos aleatoriamente.
- `Collections.binarySearch(lista, elemento)`: Realiza busca binária (lista precisa estar ordenada).

## Exercícios Práticos List

📌 `Todos os exercicios foram resolvidos e os arquivos se encontram todos na íntegra dentro deste projeto`

### 1. Lista de Tarefas
Crie uma classe chamada `ListaTarefas` que gerencia uma lista de tarefas. Cada tarefa deve ser representada por uma classe `Tarefa` contendo um atributo de descrição. Implemente os métodos:
- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa à lista.
- `removerTarefa(String descricao)`: Remove todas as tarefas que possuem a descrição fornecida.
- `exibirTarefas()`: Exibe todas as tarefas na lista.

### 2. Carrinho de Compras
Crie uma classe chamada `CarrinhoDeCompras` que representa um carrinho online. Cada item deve ser representado por uma classe `Item` com atributos como nome, preço e quantidade. Implemente:
- `adicionarItem(String nome, double preco, int quantidade)`: Adiciona um item ao carrinho.
- `removerItem(String nome)`: Remove um item com base no nome.
- `calcularValorTotal()`: Retorna o valor total dos itens no carrinho.
- `exibirItens()`: Exibe os itens com nome, preço e quantidade.

### 3. Soma de Números
Crie uma classe `SomaNumeros` que armazena uma lista de números inteiros. Implemente:
- `adicionarNumero(int numero)`: Adiciona um número à lista.
- `calcularSoma()`: Retorna a soma de todos os números.
- `encontrarMaiorNumero()`: Retorna o maior número.
- `encontrarMenorNumero()`: Retorna o menor número.
- `exibirNumeros()`: Exibe todos os números armazenados.

### 4. Ordenação de Números
Crie uma classe `OrdenacaoNumeros` para gerenciar uma lista de números inteiros. Implemente:
- `adicionarNumero(int numero)`: Adiciona um número à lista.
- `ordenarAscendente()`: Ordena os números em ordem crescente.
- `ordenarDescendente()`: Ordena os números em ordem decrescente.

Esses exercícios ajudarão a consolidar o conhecimento sobre `List` e suas operações essenciais.

---
## Introdução Map 🔑

`Em Desenvolvimento`

---

## Introdução Set 🗃️

`Em Desenvolvimento`

---
