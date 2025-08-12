package rafael.poo;

public class Produto{

    private int codigo;
    private String nome;
    private double preco;


public Produto(int umCodigo, String umNome, double umPreco){

    this.codigo = umCodigo;
    this.nome = umNome;
    this.preco = umPreco;

}

public int getCodigo(){
    return this.codigo;
}

public String getNome(){
    return this.nome;
}

public double getPreco(){
    return this.preco;
}

@Override
public String toString(){
    return String.format("Código: %d \nNome: %s \nPreço: %.2f", this.codigo, this.nome, this.preco);
}

}