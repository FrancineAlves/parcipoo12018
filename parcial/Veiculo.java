package parcial;

public abstract class Veiculo {
	
	protected String placa;
	protected Marca marca;
	protected String modelo;
	protected Motorista motorista;
	
	protected double horaEntrada;
	protected double horaSaida;
	
	public Veiculo(String placa, Marca marca, String modelo, Motorista motorista){
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.motorista = motorista;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(double horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public double getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(double horaSaida) {
		this.horaSaida = horaSaida;
	}

	public abstract void estacionarVeiculo(Estacionamento estacionamento);
	
	public abstract double calcularValorEstacionamento();

	public abstract boolean verificaVagas(Estacionamento estacionamento);

	public abstract void removerVeiculo(Estacionamento estacionamento);
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}

	public String toString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", motorista=" + motorista
				+ ", horaEntrada=" + horaEntrada + ", horaSaida=" + horaSaida + "]";
	}
}
