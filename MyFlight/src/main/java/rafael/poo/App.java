package rafael.poo;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");

		GerenciadorAeronaves gerencia = new GerenciadorAeronaves();

		Aeronave boing = new Aeronave("353", "Boing",150);
		Aeronave tecoteco = new Aeronave("111", "Tecoteco",30);


		gerencia.Adicionar(boing);
		gerencia.Adicionar(tecoteco);

		System.out.println("Lista de Aeronaves");
		for (Aeronave aero : gerencia.listarTodas()){
			System.out.println(aero.toString());
		}



		
		

		

	}
}
