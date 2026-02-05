package org.jopaul0.collections.set.contatos;

public class App {
    public static void main(String[] args){
        System.out.println("TESTE DE HASHSET");
        Contato contato1 = new Contato("João", "123456789");
        Contato contato2 = new Contato("João Paulo", "987654321");
        Contato contato3 = new Contato("Carlos", "555555555");
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);
        System.out.println("Contatos na agenda:");
        for (Contato contato : agenda.getContatos()) {
            System.out.println(contato);
        }
        System.out.println("Contagem de contatos: " + agenda.contarContatos());
        System.out.println("Contatos encontrados com nome 'João':");
        for (Contato contato : agenda.buscarContatoPorNome("João")) {
            System.out.println(contato);
        }
    }
}
