package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome,atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate,Evento> eventosTreeMap =  new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        Map<LocalDate,Evento> eventosTreeMap =  new TreeMap<>(eventosMap);
        LocalDate dataAtual = LocalDate.now();
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }

        // ou
        // Com o var, não é necessário especificar o tipo
//        for (var entry : eventosMap.entrySet()){
//            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
//                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
            //break;
//            }
//        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY,15),"Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7,9),"Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY,10),"Evento 3", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER,29),"Evento 4", "Atracao 4");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }

}
