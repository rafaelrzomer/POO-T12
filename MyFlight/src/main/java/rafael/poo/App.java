package rafael.poo;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");

		GerenciadorAeronaves gerenciaAero = new GerenciadorAeronaves();
		GerenciadorVoos gerenciaVoo = new GerenciadorVoos();

		Aeronave boing = new Aeronave("353", "Boing",150);
		Aeronave tecoteco = new Aeronave("111", "Tecoteco",30);

		gerenciaAero.Adicionar(boing);
		gerenciaAero.Adicionar(tecoteco);

		System.out.println(gerenciaAero.toString());

		/* 
		System.out.println("Lista de Aeronaves");
		for (Aeronave aero : gerenciaAero.listarTodas()){
			System.out.println(aero.toString());
		}

		System.out.println("Buscando aeronave codigo 353");
		Aeronave buscou = gerenciaAero.buscarPorCodigo("353");
		System.out.println(buscou);
		*/


		
		

		

	}
}
