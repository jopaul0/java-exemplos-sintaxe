package org.jopaul0.collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoas = new ArrayList<>();

    // Construtores
    public OrdenacaoPessoa() {}
    public OrdenacaoPessoa(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    // Get e Set
    public List<Pessoa> getPessoas() {
        return pessoas;
    }
    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    // Operações de ordenação
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasOrdenadas = new ArrayList<>(this.pessoas);
        Collections.sort(pessoasOrdenadas);
        return pessoasOrdenadas;
    }
}
