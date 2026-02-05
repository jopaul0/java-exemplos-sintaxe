package org.jopaul0.arraylist.listatarefa;

import java.util.ArrayList;
import java.util.List;


public class ListaTarefa {
    private List<String> tarefas;

    // Construtores
    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }
    public ListaTarefa(List<String> tarefas) {
        this.tarefas = tarefas;
    }

    // Get e Set
    public List<String> getTarefas() {
        return tarefas;
    }
    public void setTarefas(List<String> tarefas) {
        this.tarefas = tarefas;
    }

    // Operações de lista
    public void adicionarTarefa(String tarefa) {
        this.tarefas.add(tarefa);
    }

    public void removerTarefa(String tarefa) {
        this.tarefas.remove(tarefa);
    }

    public int contarTarefas() {
        return this.tarefas.size();
    }
}
