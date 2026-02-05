package org.jopaul0.collections.map.eventos;

import java.util.Objects;

public class Evento {
    private String nome;
    private String atracao;


    public Evento() {
    }
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAtracao() {
        return atracao;
    }
    public void setAtracao(String atracao) {
        this.atracao = atracao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Evento{");
        sb.append("nome=").append(nome);
        sb.append(", atracao=").append(atracao);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evento other = (Evento) obj;
        return Objects.equals(this.nome, other.nome);
    }

    
    
}
