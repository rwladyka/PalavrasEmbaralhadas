package wladyka.rodrigo.palavrasEmbaralhadas.embaralhador;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import wladyka.rodrigo.palavrasEmbaralhadas.embaralhador.Embaralhador;
import wladyka.rodrigo.palavrasEmbaralhadas.embaralhador.TrasPraFrente;

public class TrasPraFrenteTest {

	@Test
	public void embaralhar() {
		String palavra = "caixa";
		Embaralhador emb = new TrasPraFrente();
		assertEquals("axiac", emb.embaralhar(palavra));
	}

}
