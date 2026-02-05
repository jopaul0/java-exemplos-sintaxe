package org.jopaul0.arraylist.catalogolivros;

public class App {
    public static void main(String[] args) {
        System.out.println("CATÁLOGO DE LIVROS");
        CatalogoLivros catalogo = new CatalogoLivros();
        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogo.adicionarLivro(livro1);
        catalogo.adicionarLivro(livro2);
        System.out.println("Livros no catálogo: " + catalogo.contarLivros());
        Livro livroEncontrado = catalogo.buscarLivroPorTitulo("1984");
        if (livroEncontrado != null) {
            System.out.println("Livro encontrado: " + livroEncontrado.getTitulo() + " de " + livroEncontrado.getAutor());
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
