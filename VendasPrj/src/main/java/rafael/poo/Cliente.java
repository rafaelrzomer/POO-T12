package rafael.poo;

public class Cliente{

    private String nome;
    private String cpf;

    
public Cliente(String umNome, String umCpf){

    this.nome = umNome;
    this.cpf = umCpf;

}

public String getNome(){
    return this.nome;
}

public String getCpf(){
    return this.cpf;
}

@Override
public String toString(){
    return String.format("Nome: %s \tCpf: %s",this.nome, this.cpf);
}

}

