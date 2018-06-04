package parcial;

import java.util.Date;

public class Motocicleta extends Veiculo{
	
	private static int precoPrimeiraHora = 2;
	private static double precoHoraAdicional = 1.5;
	
	Date data = new Date();
	
	public Motocicleta(String placa, Marca marca, String modelo, Motorista motorista) {
		super(placa, marca, modelo, motorista);
	}
	
	@Override
	public void estacionarVeiculo(Estacionamento estacionamento) {
		this.setHoraEntrada(data.getHours());
		double vagas=estacionamento.getVagas();
		vagas=vagas-0.5;
		estacionamento.setVagas(vagas);
	}

	@Override
	public void removerVeiculo(Estacionamento estacionamento) {
		this.setHoraSaida(data.getHours());
		double vagas=estacionamento.getVagas();
		vagas=vagas+0.5;
		estacionamento.setVagas(vagas);
	}
	
	@Override
	public double calcularValorEstacionamento() {
		if((this.horaSaida - this.horaEntrada) == 0)
			return precoPrimeiraHora;
					
		return precoPrimeiraHora+((this.horaSaida - this.horaEntrada)*precoHoraAdicional);
	}
	
	@Override
	public boolean verificaVagas(Estacionamento estacionamento){
		if((estacionamento.getVagas()-0.5) >= 0) return true;
		return false;
	}	
}
