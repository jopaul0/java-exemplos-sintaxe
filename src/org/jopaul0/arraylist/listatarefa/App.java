package org.jopaul0.arraylist.listatarefa;

public class App {
    public static void main(String[] args) {
        System.out.println("TESTE DE ARRAYLIST");
        ListaTarefa lista = new ListaTarefa();
        lista.adicionarTarefa("Comprar pão");
        lista.adicionarTarefa("Comprar leite");
        lista.adicionarTarefa("Comprar ovos");
        System.out.println("Tarefas: " + lista.getTarefas());
        System.out.println("Contagem de tarefas: " + lista.contarTarefas());
        lista.removerTarefa("Comprar leite");
        System.out.println("Tarefas após remoção: " + lista.getTarefas());
        System.out.println("Contagem de tarefas após remoção: " + lista.contarTarefas());
    }
}
