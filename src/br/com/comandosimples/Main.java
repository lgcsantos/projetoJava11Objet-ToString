package br.com.comandosimples;


import model.CarrinhoDeCompras;
import model.Livro;
import model.Mesa;

public class Main {

        public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adiciona(new Mesa("Roxo", 165));
        carrinhoDeCompras.adiciona(new Mesa("Verde", 140));
        carrinhoDeCompras.adiciona(new Livro("Banco de Dados", "Lucas Santos", 100));
        carrinhoDeCompras.adiciona(new Livro("Refatoração", "Martin Flowler", 65));
        carrinhoDeCompras.adiciona(new Mesa("Branca", 250));
        carrinhoDeCompras.adiciona(new Mesa("Rosa", 120));
        carrinhoDeCompras.adiciona(new Mesa("Vermelho", 530));

        System.out.println( " Valor Total dos Produtos: " + carrinhoDeCompras.getTotal());
    }
}
