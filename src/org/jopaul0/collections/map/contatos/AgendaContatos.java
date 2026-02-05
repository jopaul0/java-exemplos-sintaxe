package org.jopaul0.collections.map.contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, String> contatos = new HashMap<>();

    
    public AgendaContatos(Map<String, String> contatos) {
        this.contatos = contatos;
    }
    public AgendaContatos() {
    }


    public Map<String, String> getContatos() {
        return contatos;
    }
    public void setContatos(Map<String, String> contatos) {
        this.contatos = contatos;
    }


    public void adicionarContato(String nome, String telefone) {
        this.contatos.put(nome, telefone);
    }
    public void removerContatoPeloNome(String nome) {
        this.contatos.remove(nome);
    }
    public String buscarContatoPeloNome(String nome) {
        return this.contatos.get(nome);
    }
    public int contarContatos() {
        return this.contatos.size();
    }

    
}
