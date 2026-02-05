package org.jopaul0.collections.map.eventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
    private Map<LocalDate, Evento> eventos = new HashMap<>();


    public AgendaEvento() {
    }
    public AgendaEvento(Map<LocalDate, Evento> eventos) {
        this.eventos = eventos;
    }


    public Map<LocalDate, Evento> getEventos() {
        return eventos;
    }
    public void setEventos(Map<LocalDate, Evento> eventos) {
        this.eventos = eventos;
    }
    
    public void adicionarEvento(LocalDate data, Evento evento) {
        this.eventos.put(data, evento);
    }
    public void removerEvento(LocalDate data) {
        this.eventos.remove(data);
    }
    public Evento buscarEventoPorData(LocalDate data) {
        return this.eventos.get(data);
    }
    public Map<LocalDate,Evento> exibirAgenda(){
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(this.eventos);
        return eventosOrdenados;
    }

}
