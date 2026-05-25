package com.github.ricardor211;

public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;
    private static int contadorProdutos;

    //Preco n pode ser negativo
    //qtdE n pode ser < 0

    //Parte 2 — Metodo Construtor
    public Produto (String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        if(preco < 0) preco = 0;
        this.preco = preco;

        if(qtdEstoque < 0) qtdEstoque = 0;
        this.qtdEstoque = qtdEstoque;
        contadorProdutos += 1;
    }

    //Parte 4 — Metodos da Classe
    public double calcularValorTotalDoEstoque() {
        return this.qtdEstoque * this.preco;
    }

    public static int getQtdProdutosCriados() {
        return Produto.contadorProdutos;
    }

    //Parte 3 — Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if(preco < 0) {
            System.out.println("Preço inválido. Preço continua não alterado");
            return;
        }
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        if(qtdEstoque < 0) {
            System.out.println("Quantidade inválida, quantidade mantida a mesma");
            return;
        }
        this.qtdEstoque = qtdEstoque;
    }

    public static int getContadorProdutos() {
        return contadorProdutos;
    }
}
