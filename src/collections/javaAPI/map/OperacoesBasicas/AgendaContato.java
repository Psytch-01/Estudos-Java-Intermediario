package collections.javaAPI.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println("Agenda Contatos: " + agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
            System.out.println("Pesquisando contato: " + nome + " número: " + numeroPorNome);
        }
        return agendaContatoMap.get(nome);
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        System.out.println("Exibindo Agenda Vazia");
        agendaContato.exibirContatos();

        System.out.println("--------------------------");

        System.out.println("Adicionando contatos e exibindo");

        agendaContato.adicionarContato("Julio Cesar", 1197675545);
        agendaContato.adicionarContato("Vitória", 1197444445);
        agendaContato.adicionarContato("Vitória Samantha", 1195646161);
        agendaContato.exibirContatos();

        System.out.println("--------------------------");

        System.out.println("Atualizando contato e exibindo");
        agendaContato.adicionarContato("Julio Cesar", 1197654444);
        agendaContato.exibirContatos();

        System.out.println("--------------------------");

        System.out.println("Removendo contato e exibindo agenda atualizada");

        agendaContato.removerContato("Vitória");
        agendaContato.exibirContatos();

        System.out.println("--------------------------");

        System.out.println("Pesquisando contato por nome");
        agendaContato.pesquisarPorNome("Julio Cesar");

    }


}
