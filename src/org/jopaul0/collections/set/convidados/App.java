package org.jopaul0.collections.set.convidados;

public class App {
    public static void main(String[] args) {
        System.out.println("Lista de Convidados para a Festa");
        ListaConvidados listaConvidados = new ListaConvidados();
        Convidado convidado1 = new Convidado("Ana", 101);
        Convidado convidado2 = new Convidado("Bruno", 102);
        Convidado convidado3 = new Convidado("Carla", 102);
        listaConvidados.adicionarConvidado(convidado1);
        listaConvidados.adicionarConvidado(convidado2);
        listaConvidados.adicionarConvidado(convidado3);
        System.out.println("Convidados após adição:");
        for (Convidado c : listaConvidados.getConvidados()) {
            System.out.println(c);
        }
        System.out.println("Total de convidados: " + listaConvidados.contarConvidados());
        listaConvidados.removerConvidadoPorCodigo(102);
        System.out.println("Convidados após remoção do código 102:");
        for (Convidado c : listaConvidados.getConvidados()) {
            System.out.println(c);
        }
        System.out.println("Total de convidados após remoção: " + listaConvidados.contarConvidados());

    }
}
