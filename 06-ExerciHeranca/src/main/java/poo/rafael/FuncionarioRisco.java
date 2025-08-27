package poo.rafael;

public class FuncionarioRisco extends Funcionario {

    public enum CategoriaRisco {QUIMICO, ELETRO, NUCLEAR}

    private CategoriaRisco catRisco;

    private int insalubridade;
    
    public FuncionarioRisco(String matricula, String nome, double salarioBruto, CategoriaRisco cat){

        super(matricula, nome, salarioBruto);

        this.insalubridade = insalubridade;
        
    }
    @Override
    public double getSalarioLiquido(){
        double liquido = super.getSalarioLiquido();
        return liquido + liquido*0.25;
    }


    @Override
    public String toString() {

        return String.format(super.toString());
        
    }

}
