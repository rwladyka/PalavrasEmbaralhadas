package wladyka.rodrigo.palavrasEmbaralhas.embaralhador;

import java.util.ArrayList;
import java.util.List;

public class FabricaEmbaralhadores {

	private List<Embaralhador> embaralhadores = new ArrayList<>();

	public FabricaEmbaralhadores() {
		embaralhadores.add(new TrasPraFrente());
		embaralhadores.add(new Randomic());
	}

	public Embaralhador getEmbaralhador() {
		int random = (int) Math.random() * (embaralhadores.size() - 1);
		return embaralhadores.get(random);
	}
}
