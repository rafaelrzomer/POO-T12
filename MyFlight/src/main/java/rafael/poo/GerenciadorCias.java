package rafael.poo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}
 /* 
	public void carregaDados() throws IOException{
		Path path2 = Paths.get("dados.txt");

		try (Scanner sc = new Scanner(Files.newBufferedReader(path2, Charset.forName("utf8")))) {
		  sc.useDelimiter("[;\n]"); // separadores: ; e nova linha
		  String header = sc.nextLine(); // pula cabeçalho
		  String nome, data, cpf, pal;
		  while (sc.hasNext()) {
			nome = sc.next();
			data = sc.next();
			cpf = sc.next();
			System.out.format("%s - %s (%s)%n", nome, data, cpf);
		  }
		}
		//catch (IOException x) {
		 // System.err.format("Erro de E/S: %s%n", x);
		}
	/* */	
	}


