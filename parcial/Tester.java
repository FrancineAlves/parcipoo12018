package parcial;

import java.util.Collections;


public class Tester {

	public static void main(String[] args){

		Automovel a1 = new Automovel("ARP1351", Marca.FORD, "Focus",new Motorista("Francine Alves","096.173.739-55"));
		Automovel a2 = new Automovel("MET1431", Marca.FIAT, "Palio",new Motorista("Brendhon Bonatti","971.325.086-95"));
		Automovel a3= new Automovel("MAS5465", Marca.RENAULT, "Clio",new Motorista("Maria Alves","193.426.850-05"));
		Automovel a4 = new Automovel("ASF17567", Marca.RENAULT, "Logan",new Motorista("José Cunha","195.320.748-05"));
		
		Motocicleta m1 = new Motocicleta("ADR3521", Marca.HONDA, "CG 150 Fan",new Motorista("João Alfredo","486.910.325-70"));
		Motocicleta m2 = new Motocicleta("MIT8561", Marca.HONDA, "CBR 1000RR Fireblade",new Motorista("Joana Smith","620.798.431-50"));
		Motocicleta m3 = new Motocicleta("MIT8561", Marca.YAMAHA, "XVS950A MIDNIGHT STAR",new Motorista("Lucas Silva","601.984.325-42"));
		Motocicleta m4 = new Motocicleta("AMP8561", Marca.SUZUKI, "Bandit 1250",new Motorista("Francisco Ribeiro","190.358.472-88"));
		
		Estacionamento estacionamento = new Estacionamento(60);
		
	
		estacionamento.estacionarVeiculo(m1);
		estacionamento.estacionarVeiculo(a1);
		estacionamento.estacionarVeiculo(m2);
		estacionamento.estacionarVeiculo(a2);
		estacionamento.estacionarVeiculo(m3);
		estacionamento.estacionarVeiculo(a3);
		estacionamento.estacionarVeiculo(m4);
		estacionamento.estacionarVeiculo(a4);

		for (int i = 0; i <estacionamento.veiculos.size();i++){
			System.out.println(estacionamento.veiculos.get(i).toString());
		}
		
		System.out.println("Valor de Cobrança: " + estacionamento.retirarVeiculoDoEstacionamento(m1));
		System.out.println("Valor de Cobrança: " + estacionamento.retirarVeiculoDoEstacionamento(a1));
		System.out.println("Valor de Cobrança: " + estacionamento.retirarVeiculoDoEstacionamento(m2));
		System.out.println("Valor de Cobrança: " + estacionamento.retirarVeiculoDoEstacionamento(a2));
		System.out.println("Valor de Cobrança: " + estacionamento.retirarVeiculoDoEstacionamento(m3));
		System.out.println("Valor de Cobrança: " + estacionamento.retirarVeiculoDoEstacionamento(a3));
		System.out.println("Valor de Cobrança: " + estacionamento.retirarVeiculoDoEstacionamento(m4));
		System.out.println("Valor de Cobrança: " + estacionamento.retirarVeiculoDoEstacionamento(a4));
		
		
		for (int i = 0; i <estacionamento.veiculos.size();i++){
			System.out.println(estacionamento.veiculos.get(i).toString());
		}
	
		PlacaProvider pp = new PlacaProvider();
		Collections.sort(estacionamento.veiculos,pp);
	

		for(Veiculo a:estacionamento.veiculos)
			System.out.println(a);	
		
	}
}

