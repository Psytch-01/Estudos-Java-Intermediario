package collections.javaAPI.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    // Exibe a agenda de eventos em ordem crescente de data.
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println("Eventos em ordem cronológicas:" + eventosTreeMap);

    }

    // Retorna o próximo evento que ocorrerá.
    public void obterProximoEvento() {
        /*Set<LocalDate> dateSet = eventosMap.keySet(); // keySet - Retornando um Set com todas as Keys
        Collection<Evento> values = eventosMap.values(); // values - Retornando uma collection com todos os valores*/
        LocalDate dataAtual = LocalDate.now(); // Retorna a data atual do sistema.
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.MAY, 25), "Aniversário", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.AUGUST, 31), "Festival", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2014, Month.DECEMBER, 25), "Natal", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.APRIL, 12), "Evento", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.APRIL, 13), "Evento", "Atração 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();


    }
}
