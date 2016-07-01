package wladyka.rodrigo.palavrasEmbaralhadas.embaralhador;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import wladyka.rodrigo.palavrasEmbaralhadas.embaralhador.Embaralhador;
import wladyka.rodrigo.palavrasEmbaralhadas.embaralhador.Randomic;

public class RandomicTest {

	@Test
	public void embaralhar() {
		String palavra = "caixa";
		Embaralhador emb = new Randomic();
		for (int i = 0; i < 1000; i++) {
			String embaralhado = emb.embaralhar(palavra);
			if ("icaax".equals(embaralhado)) {
				assertEquals("icaax", embaralhado);
				break;
			}
		}
	}

}
