package org.jopaul0.collections.set.contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos = new HashSet<>();

    // Construtores
    public AgendaContatos(Set<Contato> contatos) {
        this.contatos = contatos;
    }
    public AgendaContatos() {
    }

    // Get e Set
    public Set<Contato> getContatos() {
        return contatos;
    }
    public void setContatos(Set<Contato> contatos) {
        this.contatos = contatos;
    }

    // Operações de Set
    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
    }
    public void removerContato(Contato contato) {
        this.contatos.remove(contato);
    }
    public int contarContatos() {
        return this.contatos.size();
    }
    public Set<Contato> buscarContatoPorNome(String nome) {
        Set<Contato> contatosBuscados = new HashSet<>();
        if (!this.contatos.isEmpty()) {
            for (Contato contato : this.contatos) {
                if (contato.getNome().startsWith(nome)) {
                    contatosBuscados.add(contato);
                }
            }
        }
        return contatosBuscados;
    }
    
    
    
}
