package wladyka.rodrigo.palavrasEmbaralhadas.embaralhador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricaEmbaralhadores {

	private List<Embaralhador> embaralhadores = new ArrayList<>();

	public FabricaEmbaralhadores() {
		embaralhadores.add(new Randomic());
		embaralhadores.add(new TrasPraFrente());
	}

	public Embaralhador getEmbaralhador() {
		Random gerador = new Random();
		return embaralhadores.get(gerador.nextInt(embaralhadores.size()));
	}
}
