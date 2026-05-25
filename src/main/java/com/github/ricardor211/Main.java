package com.github.ricardor211;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double valorTotalEstoque = 0;
        int qtdTotalEstoque = 0;

        //1.
        Produto produto1 = new Produto("Atum", 50, 10);
        Produto produto2 = new Produto("Pão", 100, 26);
        Produto produto3 = new Produto("Caneta", 7, 8);

        Produto[] produtos = {produto1, produto2, produto3};

        //2.
        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("\nNome: %S || Preco: %.2f || QtdEstoque: %d",
                    produtos[i].getNome(), produtos[i].getPreco(), produtos[i].getQtdEstoque());
            valorTotalEstoque += produtos[i].calcularValorTotalDoEstoque();

        }

        //Separando as respostas
        System.out.println("\n-----------------\n");

        //3.
        System.out.println("O valor total do estoque corresponde a: R$" + valorTotalEstoque);
        //4.
        System.out.println("O total de produtos criados foram: " + Produto.getQtdProdutosCriados());

        //Separando as respostas
        System.out.println("\n-----------------\n");

        //5
        produto1.setPreco(-2);
        produto3.setQtdEstoque(34);

        System.out.println(produto1.getPreco());
        System.out.println(produto3.getQtdEstoque());

    }
}