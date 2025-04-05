package collections.javaAPI.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributos

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        System.out.println("Número de convidados: " + convidadoSet.size());
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados c = new ConjuntoConvidados();

        c.adicionarConvidado("João", 1542);
        c.adicionarConvidado("Maria", 1642);
        c.adicionarConvidado("José", 5568);
        c.adicionarConvidado("Fátima", 4652);

        // Esse convidado não será adicionado por ter o mesmo número de convite, bloquado através do eqquals e hashCode
        c.adicionarConvidado("Ana", 4652);

        c.contarConvidados();

        c.removerConvidadoPorCodigoConvite(1542);
        c.contarConvidados();
    }
}
