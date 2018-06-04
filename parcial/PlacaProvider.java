package parcial;

import java.util.Comparator;

public class PlacaProvider implements Comparator<Veiculo>{
	
	@Override
	public int compare (Veiculo o1, Veiculo o2){
		
		return o1.getPlaca().compareTo(o2.getPlaca());
	}

}
