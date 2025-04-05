package collections.javaAPI.set.Ordenacao;

public class Aluno {

    private String nome;
    private long matricula;
    private int nota;

    public Aluno(String nome, long matricula, int nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Aluno: "  + nome + ", matricula: " + matricula + ", nota: " + nota;
    }
}
