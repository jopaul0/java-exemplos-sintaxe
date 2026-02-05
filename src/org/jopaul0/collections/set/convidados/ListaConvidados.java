package org.jopaul0.collections.set.convidados;

import java.util.HashSet;
import java.util.Set;

public class ListaConvidados {
    private Set<Convidado> convidados = new HashSet<>();

    // Construtores
    public ListaConvidados() {}
    public ListaConvidados(Set<Convidado> convidados) {
        this.convidados = convidados;
    }

    // Get e Set
    public Set<Convidado> getConvidados() {
        return convidados;
    }

    public void setConvidados(Set<Convidado> convidados) {
        this.convidados = convidados;
    }

    // Operações de conjunto
    public void adicionarConvidado(Convidado convidado) {
        this.convidados.add(convidado);
    }
    public void removerConvidado(Convidado convidado) {
        this.convidados.remove(convidado);
    }
    public void removerConvidadoPorCodigo(int codigoConvite) {
        this.convidados.removeIf(c -> c.getCodigoConvite() == codigoConvite);
    }
    public int contarConvidados() {
        return this.convidados.size();
    }



}
