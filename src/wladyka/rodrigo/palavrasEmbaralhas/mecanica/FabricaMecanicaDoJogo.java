package wladyka.rodrigo.palavrasEmbaralhas.mecanica;

import java.util.HashMap;
import java.util.Map;

public class FabricaMecanicaDoJogo {

	private Map<Integer, MecanicaDoJogo> mecanicas = new HashMap<Integer, MecanicaDoJogo>();

	public FabricaMecanicaDoJogo() {
		mecanicas.put(0, new AteOFim());
		mecanicas.put(1, new TresErros());
		mecanicas.put(2, new MorteSubita());
	}

}
