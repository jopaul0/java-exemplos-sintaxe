package org.jopaul0.collections.map.eventos;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        System.out.println("Agenda de Eventos");
        AgendaEvento agenda = new AgendaEvento();
        Evento evento1 = new Evento("Reunião de Trabalho", "Discussão sobre o projeto X");
        Evento evento2 = new Evento("Festa de Aniversário", "Banda ao vivo e DJ");
        Evento evento3 = new Evento("Conferência de Tecnologia", "Palestras sobre as últimas tendências em tecnologia");
        agenda.adicionarEvento(java.time.LocalDate.of(2024, 7, 15), evento1);
        agenda.adicionarEvento(java.time.LocalDate.of(2024, 8, 20), evento2);
        agenda.adicionarEvento(java.time.LocalDate.of(2024, 6, 10), evento3);
        System.out.println("Eventos na agenda (ordenados por data):");
        for (Map.Entry e : agenda.exibirAgenda().entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
