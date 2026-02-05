package org.jopaul0.collections.set.produtos;

public class App {
    public static void main(String[] args) {
        System.out.println("TESTE DE HASHSET COM PRODUTOS");
        CadastroProdutos cadastro = new CadastroProdutos();
        Produto produto1 = new Produto(3500l, "Laptop");
        Produto produto2 = new Produto(1200l, "Smartphone");
        Produto produto3 = new Produto(500l, "Tablet");
        cadastro.adicionarProduto(produto1);
        cadastro.adicionarProduto(produto2);
        cadastro.adicionarProduto(produto3);
        System.out.println("Produtos cadastrados:");
        for (Produto produto : cadastro.getProdutos()) {
            System.out.println(produto);
        }
        System.out.println("Produtos ordenados por nome:");
        for (Produto produto : cadastro.exibirProdutosPorNome()) {
            System.out.println(produto);
        }
        System.out.println("Contagem de produtos: " + cadastro.contarProdutos());
        cadastro.removerProduto(produto2);
        System.out.println("Produtos após remoção:");
        for (Produto produto : cadastro.getProdutos()) {
            System.out.println(produto);
        }
        System.out.println("Contagem de produtos após remoção: " + cadastro.contarProdutos());

    }
}
