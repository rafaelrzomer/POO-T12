package rafael.poo;

import java.time.Duration;
import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");

		GerenciadorAeronaves gerenciaAero = new GerenciadorAeronaves();
		GerenciadorVoos gerenciaVoo = new GerenciadorVoos();
		GerenciadorRotas gerenciaRota = new GerenciadorRotas();
		GerenciadorCias gerenciaCia = new GerenciadorCias();
		GerenciadorAeroportos gerenciaAeroporto = new GerenciadorAeroportos();

		Aeronave boing = new Aeronave("353", "Boing",150);
		Aeronave tecoteco = new Aeronave("111", "Tecoteco",30);
		CiaAerea c1 = new CiaAerea("111", "GOL");
		Geo geoSalgadoF = new Geo(-29.9939, -51.1711);
		Geo geoGuarulhos = new Geo(-23.4356, -46.4731);
		Aeroporto SalgadoFilho = new Aeroporto("321", "GUARULHOS",geoSalgadoF);
		Aeroporto Guarulhos = new Aeroporto("653", "santos dumon", geoGuarulhos);

		Rota r1 = new Rota(c1, SalgadoFilho, Guarulhos, boing);

		Voo teste = new Voo(r1,Duration.ofHours(1));
		Voo teste2 = new Voo(r1, LocalDateTime.now(),Duration.ofHours(2));

		System.out.println(teste.toString());
		System.out.println(Geo.calculaDistancia(geoSalgadoF, geoGuarulhos));

		gerenciaVoo.Adicionar(teste);
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
