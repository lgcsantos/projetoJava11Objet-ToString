package model;

public class Livro implements Produto {

    private String nome;
    private String autor;
    private double valor;

    public Livro(String nome, String autor, double valor){
        this.nome = nome;
        this.autor = autor;
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", valor=" + valor +
                '}';
    }
}
