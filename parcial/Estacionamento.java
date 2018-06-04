package parcial;

import java.util.ArrayList;

public class Estacionamento {
	
	private double vagas;
		
	ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	
	public Estacionamento(int vagas) {
		super();
		this.vagas = vagas;
	}

	public double getVagas() {
		return vagas;
	}

	public void setVagas(double vagas) {
		this.vagas = vagas;
	}	

	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public void estacionarVeiculo(Veiculo veiculo){
	
		if (veiculo.verificaVagas(this) == true){
			veiculo.estacionarVeiculo(this);
			veiculos.add(veiculo);
		}
		else{	
			try{
			throw new EstacionamentoException();
			}catch (Exception e) {
		}
		}
		
		
		
	}
	public double retirarVeiculoDoEstacionamento(Veiculo veiculo) {
		double valorEstacionamento = 0;
		for (int i = 0; i <veiculos.size();i++){
			if (veiculos.get(i) == veiculo) {
				calcularValorDeCobranca(veiculo);
				valorEstacionamento = veiculo.calcularValorEstacionamento();
		}
	}
		return valorEstacionamento;
	}
	public double calcularValorDeCobranca(Veiculo veiculo) {
		
		veiculo.removerVeiculo(this);
		double valorEstacionamento = veiculo.calcularValorEstacionamento();
		
		for (int i = 0; i <veiculos.size();i++){
			if (veiculos.get(i) == veiculo) {
				veiculos.remove(i);
		}
		}
		return valorEstacionamento;
		
	}
	public ArrayList<Veiculo> findAll(){
		return veiculos;
	}
	
	
}
