package rafael.poo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");

		GerenciadorAeronaves gerenciaAero = new GerenciadorAeronaves();
		GerenciadorVoos gerenciaVoo = new GerenciadorVoos();
		GerenciadorRotas gerenciaRota = new GerenciadorRotas();
		GerenciadorCias gerenciaCia = new GerenciadorCias();
		GerenciadorAeroportos gerenciaAeroporto = new GerenciadorAeroportos();

		
		Aeronave boing = new Aeronave("733", "Boeing 737-300",140);
		Aeronave airbus = new Aeronave("380", "Airbus Industrie A380",644);

		CiaAerea c1 = new CiaAerea("G3", "Gol Linhas Aéreas SA");
		CiaAerea c2 = new CiaAerea("JJ", "LATAM Linhas Aéreas");

		Geo geoSalgadoF = new Geo(-29.9939, -51.1711);
		Geo geoGuarulhos = new Geo(-23.4356, -46.4731);
		Geo geoLisbon = new Geo(38.7742, -9.1342);
		Geo geoMiami = new Geo(25.7933, -80.2906);

		Aeroporto SalgadoFilho = new Aeroporto("POA", "Salgado Filho Intl Apt",geoSalgadoF);
		Aeroporto Guarulhos = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", geoGuarulhos);
		Aeroporto Lisbon = new Aeroporto("LIS", "Lisbon", geoLisbon);
		Aeroporto Miami = new Aeroporto("MIA", "Miami International Apt", geoMiami);

		Rota r1 = new Rota(c1, SalgadoFilho, Guarulhos, boing);
		Rota r2 = new Rota(c2, Guarulhos, Lisbon, airbus);
		Rota poaXmia = new Rota(c2, SalgadoFilho, Miami, airbus);

		Voo teste = new Voo(r1,Duration.ofHours(1));
		Voo teste2 = new Voo(r1, LocalDateTime.now(),Duration.ofHours(2));
		Voo ve1 = new VooEscalas(r1, r2, LocalDateTime.now(), Duration.ofHours(1)); 

		ArrayList<Rota> escalas = new ArrayList<>();
		escalas.add(r1);
		escalas.add(r2);
		Voo variasEscalas = new VooVariasEscalas(poaXmia,escalas,LocalDateTime.now(),Duration.ofHours(5));


		System.out.println(ve1.toString());

		System.out.println("Voo com Várias Escalas:");
        System.out.println(variasEscalas.toString());

		System.out.println(Geo.calculaDistancia(geoSalgadoF, geoGuarulhos));
		System.out.println(geoSalgadoF.calculaDistancia(geoGuarulhos));
		System.out.println(CiaAerea.getTotalDeCias());

		gerenciaVoo.Adicionar(teste);
		gerenciaAero.Adicionar(boing);

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
