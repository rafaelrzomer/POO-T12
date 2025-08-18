package rafael.poo;
import java.util.ArrayList;


public class CadastroCliente {
    private ArrayList<Cliente> lista;

    public CadastroCliente(){
        lista = new ArrayList<>();
    }

    public void cadastrar(Cliente cliente){
        lista.add(cliente);
    }

    public void cadastrar(String nome, String cpf){
        Cliente cliente = new Cliente(nome,cpf);
        lista.add(cliente);
    }

    public Cliente pesquisa(String cpf){
        for (Cliente c : lista){
        if (c.getCpf().equals(cpf)){
           return c; 
            }
        }
        return null;
    }

    public String relatorio(){
        StringBuilder relatorio = new StringBuilder();
        for (int i = 0; i < lista.size(); i++){
            Cliente cliente = lista.get(i);
            relatorio.append(cliente.toString());
            relatorio.append("\n");
        }
        return relatorio.toString();
    }

        
    }
    
    
