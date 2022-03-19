package model;

public class CarrinhoDeCompras {

    private Produto[] produtos = new Produto[10];
    private double total = 0;
    private int contador = 0;

    public void adiciona(Produto produto){
        System.out.println("Adiciona: " + produto.toString());

        this.produtos[contador] =  produto;
        contador++;

        total += produto.getValor();

    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public double getTotal() {
        return total;
    }

    public int getContador() {
        return contador;
    }
}
