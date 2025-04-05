package collections.javaAPI.set.Ordenacao;

import java.util.*;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    // Adiciona um novo Aluno
    public void adicionarAluno(String nome, long matricula, int nota) {
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

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        //Imprimindo Lista Vazia
        gerenciador.exibirAluno();

        //Adicionando um novo Aluno
        gerenciador.adicionarAluno("Julio Cesar", 460520, 10);
        gerenciador.adicionarAluno("Vitória", 157285, 10);
        gerenciador.adicionarAluno("Erick Felipe", 542889, 10);

        //Imprimindo Lista Atualizada
        gerenciador.exibirAluno();

        //Removendo Aluno e Exebindo Lista Atualizada
        gerenciador.removerAlunoPorMatricula(460520);
        gerenciador.exibirAluno();

    }
}
