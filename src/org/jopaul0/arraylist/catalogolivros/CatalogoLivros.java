package org.jopaul0.arraylist.catalogolivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros = new ArrayList<>();

    // Construtores
    public CatalogoLivros() {}
    public CatalogoLivros(List<Livro> livros) {
        this.livros = livros;
    }

    // Get e Set
    public List<Livro> getLivros() {
        return this.livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    // Operações do catálogo
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        this.livros.remove(livro);
    }

    public int contarLivros() {
        return this.livros.size();
    }

    public Livro buscarLivroPorTitulo(String titulo){
        for (Livro livro : this.livros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        return null;
    }
}
