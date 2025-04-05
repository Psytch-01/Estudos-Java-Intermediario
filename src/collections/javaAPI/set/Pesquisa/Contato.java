package collections.javaAPI.set.Pesquisa;

import java.util.Objects;

public class Contato {

    private String nome;
    private int numero;

    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.numero = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return numero;
    }

    public void setTelefone(int telefone) {
        this.numero = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return numero == contato.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }
}
