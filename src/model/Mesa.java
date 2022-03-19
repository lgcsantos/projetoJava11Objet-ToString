package model;

public class Mesa implements Produto{

    private String cor;
    private double valor;

    public Mesa(String cor, double valor) {
        this.cor = cor;
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "cor='" + cor + '\'' +
                ", valor=" + valor +
                '}';
    }
}
