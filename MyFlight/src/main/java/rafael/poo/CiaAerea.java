package rafael.poo;

public class CiaAerea{
	private static int totalDeCias = 0;
	private String codigo;
	private String nome;

	public CiaAerea(String codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
		totalDeCias ++;
	}

	public String getCodigo(){
		return codigo;
	}

	public String getNome(){
		return nome;
	}

	public static int getTotalDeCias(){
		return totalDeCias;
	}
}
