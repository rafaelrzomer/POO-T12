package rafael.poo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VooDireto extends Voo {
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	
	public VooDireto(Rota rota, LocalDateTime datahora) {
		this.rota = rota;
		this.datahora = datahora;
		this.status = Status.CONFIRMADO;
	}

	public VooDireto(Rota rota, Duration duracao){

		this.rota = rota;
		this.duracao = duracao;
		this.datahora = LocalDateTime.of(2016,8,12,12,00,00);
		this.status = Status.CONFIRMADO;
	}

	@Override
	public String toString(){
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return getStatus() + " Voo: " + getRota().getCia().getCodigo() + " de: " + getRota().getOrigem().getCodigo() +
		" para: " + getRota().getDestino().getCodigo() + " dia: " + getDatahora().format(formatador);
	}
	
	public Rota getRota() {
		return rota;
	}
	
	public LocalDateTime getDatahora() {
		return datahora;
	}
	
	public Duration getDuracao() {
		return duracao;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status novo) {
		this.status = novo;
	}

}
