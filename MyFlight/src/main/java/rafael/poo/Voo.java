package rafael.poo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Voo {
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Status status;
	
	public Voo(LocalDateTime dh) {
		
		this.datahora = dh;
		this.status = Status.CONFIRMADO;
	}

	public LocalDateTime getDatahora() {
		return datahora;
	}

	public Status getStatus() {
		return status;
	}

	public abstract Rota getRota();
	public abstract Duration getDuracao();

	@Override
	public String toString(){
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return getStatus() + "em" + getDatahora().format(formatador);
	}

	
}
