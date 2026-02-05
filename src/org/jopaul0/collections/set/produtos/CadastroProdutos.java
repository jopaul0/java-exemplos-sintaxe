package org.jopaul0.collections.set.produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos = new HashSet<>();

    
    public CadastroProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }
    public CadastroProdutos() {
    }


    public Set<Produto> getProdutos() {
        return this.produtos;
    }
    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }


    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }
    public void removerProduto(Produto produto){
        this.produtos.remove(produto);
    }
    public int contarProdutos(){
        return this.produtos.size();
    }
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(this.produtos);
        return produtosPorNome;
    }
    
    
}
