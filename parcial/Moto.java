package parcial;

public class Moto extends Veiculo{
	
	public Moto(String placa, Marca marca, String modelo, Motorista motorista){
		super(placa, marca, modelo, motorista);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calcularValorEstacionamento() {
		return horaEntrada;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void estacionarVeiculo(Estacionamento estacionamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verificaVagas(Estacionamento estacionamento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removerVeiculo(Estacionamento estacionamento) {
		// TODO Auto-generated method stub
		
	}
	
}
