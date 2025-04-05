package collections.javaAPI.set.Ordenacao;

import java.util.*;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    // Adiciona um novo Aluno
    public void adicionarAluno(String nome, long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    // Remove Aluno Por Matrícula
    public void removerAlunoPorMatricula(long matricula) {
        if (!alunoSet.isEmpty()) {
            Aluno alunoRemover = null;
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula){
                    alunoRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoRemover);
        }
    }

    // Exibe Todos os alunos
    public void exibirAluno() {
        System.out.println(alunoSet);

    }

    // Exibe todos os alunos do conjunto em ordem alfabética pelo nome.


    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(new ComparatorPorNota());
        alunosPorNome.addAll(alunoSet);
        System.out.println("Alunos em ordem Alfabética: " + alunosPorNome);

        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        System.out.println("Alunos por ordem crescente de nota: " + alunosPorNota);
        return alunosPorNota;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        System.out.println("Imprimindo Lista Vazia");
        gerenciador.exibirAluno();

        System.out.println("--------------------------");

        System.out.println("Adicionando alunos e imprimindo Lista atualizada");
        gerenciador.adicionarAluno("Julio Cesar", 460520, 7);
        gerenciador.adicionarAluno("Vitória", 157285, 10);
        gerenciador.adicionarAluno("Erick Felipe", 542889, 8);
        gerenciador.adicionarAluno("Edgar", 5425556, 9);
        gerenciador.exibirAluno();

        System.out.println("--------------------------");

        System.out.println("Removendo Aluno e Exebindo Lista Atualizada");
        gerenciador.removerAlunoPorMatricula(460520);
        gerenciador.exibirAluno();

        System.out.println("--------------------------");

        System.out.println("Exibindo alunos por ordem alfabetica de nome");
        gerenciador.exibirAlunosPorNome();

        System.out.println("--------------------------");

        // Exibindo alunos por ordem crescente de nota
        gerenciador.exibirAlunosPorNota();


    }
}
