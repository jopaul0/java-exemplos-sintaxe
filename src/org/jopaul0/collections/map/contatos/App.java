package org.jopaul0.collections.map.contatos;

public class App {
    public static void main(String[] args) {
        System.out.println("TESTE DE AGENDA DE CONTATOS");
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", "1234-5678");
        agenda.adicionarContato("Maria", "9876-5432");
        System.out.println("Contatos: " + agenda.getContatos());
        System.out.println("Contagem de contatos: " + agenda.contarContatos());
        String telefoneMaria = agenda.buscarContatoPeloNome("Maria");
        System.out.println("Telefone de Maria: " + telefoneMaria);
        agenda.removerContatoPeloNome("João");
        System.out.println("Contatos após remoção: " + agenda.getContatos());
        System.out.println("Contagem de contatos após remoção: " + agenda.contarContatos());
    }
}
