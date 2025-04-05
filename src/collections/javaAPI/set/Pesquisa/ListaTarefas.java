package collections.javaAPI.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private final Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }


    // Adiciona uma nova tarefa ao Set.
    public void adicionaTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    // Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
    public void removerTarefa(String descricao) {
        if (!tarefasSet.isEmpty()) {
            Tarefa tarefaParaRemover = null;
            for (Tarefa tarefa : tarefasSet) {
                if (tarefa.getDescription().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = tarefa;
                    break;
                }
            }
            tarefasSet.remove(tarefaParaRemover);
        }else {
            System.out.println("Tarefa não encontrada");
        }
    }

    // Exibe todas as tarefas da lista de tarefas.
    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }

    // Conta o número total de tarefas na lista de tarefas.
    public void contarTarefas() {
        if (!tarefasSet.isEmpty()) {
            System.out.println("Tarefas encontradas: " + tarefasSet.size());
        } else {
            System.out.println("Lista vazia");
        }
    }

    // Marca uma tarefa como concluída de acordo com a descrição.
    public void marcarTarefaConcluida(String descricao) {
        ListaTarefas listaTarefa = new ListaTarefas();

        Tarefa tarefaAtualizada = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescription().equalsIgnoreCase(descricao)) {
                    t.setStatus(true);
                    tarefaAtualizada = t;
                    break;
                }
            }
        }
    }

    // Marca uma tarefa como pendente de acordo com a descrição.
    public Tarefa marcarTarefaPendente (String descricao) {
        Tarefa tarefaAtualizada = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescription().equalsIgnoreCase(descricao)) {
                    t.setStatus(false);
                    tarefaAtualizada = t;
                    break;
                }
            }
        }
        return tarefaAtualizada;
    }

    // Retorna um Set com as tarefas pendentes.
    public Set<Tarefa> tarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefasSet) {
            if (!tarefa.getStatus()) {

                tarefasNaoConcluidas.add(tarefa);
            }
        }
        System.out.println("Tarefa Não concluídas: " + tarefasNaoConcluidas);
        return tarefasNaoConcluidas;
    }

    // Retorna um Set com as tarefas concluidas.
    public Set<Tarefa> tarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getStatus()) {

                tarefasConcluidas.add(tarefa);
            }
        }
        System.out.println("Tarefa concluídas: " + tarefasConcluidas);
        return tarefasConcluidas;
    }

    // Remove todas as tarefas da lista de tarefas.
    public void limparListaTarefas() {
        if (!tarefasSet.isEmpty()) {
            tarefasSet.clear();
            System.out.println("A Lista foi limpa!");
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Exibindo Lista de Tarefas Vazia");

        listaTarefas.exibirTarefas();

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Adicionando Tarefas a Lista todas inicializando como Pendentes com status \"false\"");

        listaTarefas.adicionaTarefa("descricao1");
        listaTarefas.adicionaTarefa("descricao2");
        listaTarefas.adicionaTarefa("descricao3");
        listaTarefas.adicionaTarefa("descricao4");
        System.out.println("Exibindo Lista de Tarefas Atualizada");

        listaTarefas.exibirTarefas();

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Removendo tarefa da lista (Tarefa 1) e Exibindo lista atualizada");

        listaTarefas.removerTarefa("descricao1");
        listaTarefas.exibirTarefas();

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Contando a quantidade atual de tarefas na lista e Imprimindo");
        listaTarefas.contarTarefas();

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Marcando tarefas 2 e 3 como Concluidas status \"true\" e exibindo a lista atualizada");

        listaTarefas.marcarTarefaConcluida("descricao2");
        listaTarefas.marcarTarefaConcluida("descricao3");
        listaTarefas.exibirTarefas();

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Marcando tarefas 2 e 3 como Pendentes status \"false\" e exibindo a lista atualizada");

        listaTarefas.marcarTarefaPendente("descricao2");
        listaTarefas.marcarTarefaPendente("descricao3");
        listaTarefas.exibirTarefas();

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Exibindo Lista de Tarefas Não concluidas");
        listaTarefas.tarefasPendentes();

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Marcando tarefas 2 como Concluida novamente status \"true\" e exibindo a lista atualizada");

        listaTarefas.marcarTarefaConcluida("descricao2");
        listaTarefas.exibirTarefas();

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Exibindo Lista de Tarefas concluidas");
        listaTarefas.tarefasConcluidas();

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Limpando lista de tarefas e exibindo a lista vazia");

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();


    }

}
