package collections.javaAPI.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    // Adiciona um contato à agenda.
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    // Exibe todos os contatos da agenda.
    public void exibirContatos() {
        if (!contatoSet.isEmpty()){
            System.out.println("Contatos: " + contatoSet);

        }else {
            System.out.println("Contato não encontrado!");
        }
    }

    // Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> pesquisarPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                pesquisarPorNome.add(c);
            }
        }
        System.out.println("Contato encontrado: " + pesquisarPorNome);
        return pesquisarPorNome;
    }

    // Atualiza o número de telefone de um contato específico.
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        // Exibindo lista vazia
        agenda.exibirContatos();

        // Adicionando contatos a lista
        agenda.adicionarContato("Julio Cesar", 1167220204);
        agenda.adicionarContato("Vitoria", 1180522365);

        // Exibindo lista atualizada
        agenda.exibirContatos();

        // Procurando contato por nome
        agenda.pesquisarPorNome("Julio Cesar");

        // Atualizando Numero de contato
        agenda.atualizarNumeroContato("Julio Cesar", 1122334455);
        agenda.exibirContatos();

    }
}
