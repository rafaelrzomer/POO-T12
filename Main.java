//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Imovel.setVr(5);

        CadastroImoveis cadastrar = new CadastroImoveis();

        Imovel a = new Residencial("casarao", 100,new Geo(-1223,2442),200);
        Imovel b = new Comercial("casarao", 150,new Geo(-1223,2442));
        Imovel c = new Residencial("impostao", 300,new Geo(-231,8665),1001);

        cadastrar.add(a);
        cadastrar.add(b);
        cadastrar.add(c);

        System.out.println(cadastrar.listar());
        System.out.println(cadastrar.listar("casarao"));

    }
}