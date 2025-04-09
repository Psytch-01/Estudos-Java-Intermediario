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
## Introdução Set 🔑

### 📌 O que é Set?

`Set` é uma interface da Java Collections Framework que representa uma **coleção que não permite elementos duplicados**. É ideal para situações onde a **unicidade dos dados** precisa ser garantida, como listas de usuários, chaves únicas ou dados sem repetição.

---

### 🔍 Principais implementações

A interface `Set` é implementada por três classes principais, cada uma com comportamentos distintos:

### ✅ HashSet

- Baseado em uma **tabela hash**.
- **Não mantém a ordem** dos elementos.
- Permite **valores nulos** (apenas um).
- Operações como adicionar, remover e verificar se contém um elemento são geralmente **rápidas** (O(1)).

```java
Set<String> nomes = new HashSet<>();
nomes.add("Ana");
nomes.add("Carlos");
nomes.add("Ana"); // duplicado, será ignorado
System.out.println(nomes); // Ordem não garantida 
```

### 🧩 LinkedHashSet

- Baseado em tabela hash + lista duplamente ligada.

- Mantém a ordem de inserção dos elementos.

- Também permite um valor nulo.

- Levemente mais lento que o HashSet, mas útil quando a ordem importa.

```java
Set<String> nomes = new LinkedHashSet<>();
nomes.add("Ana");
nomes.add("Carlos");
nomes.add("Beatriz");
System.out.println(nomes); // [Ana, Carlos, Beatriz]
```
### 🛠️ Métodos importantes

Como Set é uma interface que herda de Collection, os métodos disponíveis são em sua maioria herdados dela:

- ```add(element)``` – adiciona um elemento (se não for duplicado).


- ```remove(element)``` – remove o elemento especificado.


- ```contains(element)``` – verifica se o elemento está presente.


- ```isEmpty()``` – verifica se o Set está vazio.


- ```size()``` – retorna a quantidade de elementos.


- ```clear()```– remove todos os elementos.


- ```Iteração``` com for-each ou Iterator.

### Diferenças entre Set e List

| Característica        | Set                       | List                     |
|-----------------------|---------------------------|--------------------------|
| Permite duplicados?   | ❌ Não                    | ✅ Sim                  |
| Mantém ordem?         | 🔸 Depende da implementação | ✅ Sim (geralmente)   |
| Permite índice?       | ❌ Não                    | ✅ Sim                  |
| Implementações comuns | HashSet, TreeSet, etc.    | ArrayList, LinkedList    |

#### 📋 Exemplo de uso

```java 
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(7);
        numeros.add(5); // duplicado

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
```
### 🧠 Quando usar Set?

Use Set quando:

- A unicidade dos elementos é fundamental.

- A ordem não é importante (HashSet).

- A ordem de inserção deve ser preservada (LinkedHashSet).

- É necessário ordenar automaticamente os elementos (TreeSet).

--- 
## Exercícios Práticos Set
📌 `Todos os exercicios foram resolvidos e os arquivos se encontram todos na íntegra dentro deste projeto`

### 1. Conjunto de Convidados

<p>Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado possui atributos como nome e código do convite. Implemente os seguintes métodos:

- `adicionarConvidado(String nome, int codigoConvite)`: Adiciona um convidado ao conjunto.
- `removerConvidadoPorCodigoConvite(int codigoConvite)`: Remove um convidado do conjunto com base no código do convite.
- `contarConvidados()`: Conta o número total de convidados no Set.
- `exibirConvidados()`: Exibe todos os convidados do conjunto.
</p>

### 2. Conjunto de Palavras Únicas

<p>
Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra)`: Adiciona uma palavra ao conjunto.
- `removerPalavra(String palavra)`: Remove uma palavra do conjunto.
- `verificarPalavra(String palavra)`: Verifica se uma palavra está presente no conjunto.
- `exibirPalavrasUnicas()`: Exibe todas as palavras únicas do conjunto.
</p>

----

## Pesquisa em Set

### 1. Agenda de Contatos

<p>
Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo. Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:

- `adicionarContato(String nome, int numero)`: Adiciona um contato à agenda.
- `exibirContatos()`: Exibe todos os contatos da agenda.
- `pesquisarPorNome(String nome)`: Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
- `atualizarNumeroContato(String nome, int novoNumero)`: Atualiza o número de telefone de um contato específico.
</p>

### 2. Lista de Tarefas

<p>
Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa ao Set.
- `removerTarefa(String descricao)`: Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
- `exibirTarefas()`: Exibe todas as tarefas da lista de tarefas.
- `contarTarefas()`: Conta o número total de tarefas na lista de tarefas.
- `obterTarefasConcluidas()`: Retorna um Set com as tarefas concluídas.
- `obterTarefasPendentes()`: Retorna um Set com as tarefas pendentes.
- `marcarTarefaConcluida(String descricao)`: Marca uma tarefa como concluída de acordo com a descrição.
- `marcarTarefaPendente(String descricao)`: Marca uma tarefa como pendente de acordo com a descrição.
- `limparListaTarefas()`: Remove todas as tarefas da lista de tarefas.
</p>

---

## Ordenação em Set

### 1. Cadastro de Produtos

<p>
Crie uma classe chamada "CadastroProdutos" que possui um conjunto de objetos do tipo "Produto" como atributo. Cada produto possui atributos como nome, cod, preço e quantidade. Implemente os seguintes métodos:

- `adicionarProduto(long cod, String nome, double preco, int quantidade)`: Adiciona um produto ao cadastro.
- `exibirProdutosPorNome()`: Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
- `exibirProdutosPorPreco()`: Exibe todos os produtos do cadastro em ordem crescente de preço.
</p>

### 2. Lista de Alunos

<p>
Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

- `adicionarAluno(String nome, Long matricula, double media)`: Adiciona um aluno ao conjunto.
- `removerAluno(long matricula)`: Remove um aluno ao conjunto a partir da matricula, se estiver presente.
- `exibirAlunosPorNome()`: Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
- `exibirAlunosPorNota()`: Exibe todos os alunos do conjunto em ordem crescente de nota.
- `exibirAlunos()`: Exibe todos os alunos do conjunto.
</p>

--- 

## Introdução Map 🗃️

### 📌 O que é Map?

`Map` é uma interface da Java Collections Framework que representa uma estrutura de dados que **mapeia chaves a valores**. Cada chave deve ser única, mas os valores podem se repetir. É ideal para armazenar pares de dados como: ID e nome, CPF e pessoa, chave e valor.

---

### 🔍 Principais implementações

A interface `Map` é implementada por várias classes, entre as principais:

###  HashMap
- Baseado em uma **tabela hash**.
- **Não garante ordem** das chaves.
- Permite uma chave nula e múltiplos valores nulos.
- É a implementação mais comum para uso geral.

```java
Map<Integer, String> usuarios = new HashMap<>();
usuarios.put(1, "Ana");
usuarios.put(2, "Carlos");
usuarios.put(1, "Beatriz"); // sobrescreve o valor da chave 1
System.out.println(usuarios); // {1=Beatriz, 2=Carlos}
```

---
### LinkedHashMap
- Mantém a ordem de inserção dos pares.

- Um pouco mais lento que o HashMap, mas útil quando a ordem importa.

```java
Map<Integer, String> usuarios = new LinkedHashMap<>();
usuarios.put(1, "Ana");
usuarios.put(2, "Carlos");
usuarios.put(3, "Beatriz");
System.out.println(usuarios); // {1=Ana, 2=Carlos, 3=Beatriz}
```
### 🌲 TreeMap
- Ordena as chaves automaticamente de forma crescente (ou por Comparator).

- Baseado em árvore de busca balanceada.

- Não permite chaves nulas.

```java
Map<Integer, String> usuarios = new TreeMap<>();
usuarios.put(3, "Beatriz");
usuarios.put(1, "Ana");
usuarios.put(2, "Carlos");
System.out.println(usuarios); // {1=Ana, 2=Carlos, 3=Beatriz}
```
### 🛠️ Métodos importantes
- put(chave, valor) – adiciona ou atualiza o valor associado à chave.

- get(chave) – retorna o valor associado à chave.

- remove(chave) – remove o par com a chave especificada.

- containsKey(chave) – verifica se a chave existe.

- containsValue(valor) – verifica se um valor está presente.

- keySet() – retorna um Set com todas as chaves.

- values() – retorna uma Collection com todos os valores.

- entrySet() – retorna um Set com todos os pares chave-valor.
---

### 🧠 Quando usar Map?
**Use Map quando:**

- Você precisa associar chaves únicas a valores.

- Precisa de recuperação rápida de valores com base em uma chave.

- A ordem não importa `HashMap`, a ordem de inserção é importante `LinkedHashMap`, ou ordenação automática é necessária `TreeMap`.

---
## Exercícios Práticos Map

### 📌 Todos os exercicios foram resolvidos e os arquivos se encontram todos na íntegra dentro deste projeto

## Operações Básicas com Map

### 1. Agenda de Contatos

<p>
Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos. Cada contato possui um nome como chave e um número de telefone como valor. Implemente os seguintes métodos:

- `adicionarContato(String nome, Integer telefone)`: Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
- `removerContato(String nome)`: Remove um contato da agenda, dado o nome do contato.
- `exibirContatos()`: Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
- `pesquisarPorNome(String nome)`: Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
</p>

### 2.  Dicionário

<p>
Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas respectivas definições. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra, String definicao)`: Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
- `removerPalavra(String palavra)`: Remove uma palavra do dicionário, dado o termo a ser removido.
- `exibirPalavras()`: Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
- `pesquisarPorPalavra(String palavra)`: Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
</p>

---

## Pesquisa em Map

### 1. Estoque de Produtos com Preço

<p>
Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar os produtos, suas quantidades em estoque e seus respectivos preços. Cada produto possui um código como chave e um objeto Produto como valor, contendo nome, quantidade e preço. Implemente os seguintes métodos:

- `adicionarProduto(long cod, String nome, int quantidade, double preco)`: Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
- `exibirProdutos()`: Exibe todos os produtos, suas quantidades em estoque e preços.
- `calcularValorTotalEstoque()`: Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
- `obterProdutoMaisCaro()`: Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
- `obterProdutoMaisBarato()`: Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
- `obterProdutoMaiorQuantidadeValorTotalNoEstoque()`: Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).
</p>

### 2. Contagem de Palavras

<p>
Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra, Integer contagem)`: Adiciona uma palavra à contagem.
- `removerPalavra(String palavra)`: Remove uma palavra da contagem, se estiver presente.
- `exibirContagemPalavras()`: Exibe todas as palavras e suas respectivas contagens.
- `encontrarPalavraMaisFrequente()`: Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
</p>

---

## Ordenação nos Map

### 1. Agenda de Eventos

<p>
Crie uma classe chamada "AgendaEventos" que utilize um `Map` para armazenar as datas e seus respectivos Eventos. Cada evento é representado por um objeto da classe "Evento", que possui atributos como nome do evento e o nome da atração. Implemente os seguintes métodos:

- `adicionarEvento(LocalDate data, String nome, String atracao)`: Adiciona um evento à agenda.
- `exibirAgenda()`: Exibe a agenda de eventos em ordem crescente de data.
- `obterProximoEvento()`: Retorna o próximo evento que ocorrerá.
</p>

---