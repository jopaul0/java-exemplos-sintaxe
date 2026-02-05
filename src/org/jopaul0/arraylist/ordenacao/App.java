package org.jopaul0.arraylist.ordenacao;

public class App {
    public static void main(String[] args) {
        System.out.println("Ordenação de Pessoas por Idade");
        Pessoa pessoa1 = new Pessoa(1.75, 30, "João");
        Pessoa pessoa2 = new Pessoa(1.80, 25, "Maria");
        Pessoa pessoa3 = new Pessoa(1.65, 35, "Carlos");
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.getPessoas().add(pessoa1);
        ordenacaoPessoa.getPessoas().add(pessoa2);
        ordenacaoPessoa.getPessoas().add(pessoa3);
        System.out.println("Pessoas antes da ordenação:");
        for (Pessoa pessoa : ordenacaoPessoa.getPessoas()) {
            System.out.println(pessoa);
        }
        System.out.println("\nPessoas após a ordenação por idade:");
        for (Pessoa pessoa : ordenacaoPessoa.ordenarPorIdade()) {
            System.out.println(pessoa);
        }
    }
}
