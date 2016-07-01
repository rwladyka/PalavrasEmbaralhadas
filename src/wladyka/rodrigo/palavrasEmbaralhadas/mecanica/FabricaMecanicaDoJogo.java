package wladyka.rodrigo.palavrasEmbaralhadas.mecanica;

import java.util.HashMap;
import java.util.Map;

import wladyka.rodrigo.palavrasEmbaralhadas.bancoPalavras.BancoDePalavras;

public class FabricaMecanicaDoJogo {

	private Map<Integer, MecanicaDoJogo> mecanicas = new HashMap<Integer, MecanicaDoJogo>();

	public FabricaMecanicaDoJogo(BancoDePalavras banco) {
		mecanicas.put(0, new AteOFim(banco));
		mecanicas.put(1, new TresErros(banco));
		mecanicas.put(2, new MorteSubita(banco));
	}
	
	public MecanicaDoJogo get(int index){
		return mecanicas.get(index);
	}

}
