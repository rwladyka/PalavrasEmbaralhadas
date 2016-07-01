package wladyka.rodrigo.palavrasEmbaralhadas.bancoPalavras;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import wladyka.rodrigo.palavrasEmbaralhadas.bancoPalavras.BancoDePalavras;

public class BancoDePalavrasTest {

	private static BancoDePalavras palavras;

	@BeforeClass
	public static void beforeClass() {
		palavras = new BancoDePalavras();
	}

	@Test
	public void carregamento() {
		assertTrue(palavras.hasNext());
	}

	@Test
	public void palavras() {
		assertTrue(palavras.contains("teste"));
		assertTrue(palavras.contains("abraço"));
		assertTrue(palavras.contains("cavalo"));
		assertTrue(palavras.contains("coelho"));
		assertTrue(palavras.contains("campo"));
		assertTrue(palavras.contains("prova"));
		assertTrue(palavras.contains("passo"));
		assertTrue(palavras.contains("poeta"));
		assertTrue(palavras.contains("teste"));
		assertTrue(palavras.contains("poesia"));
		assertTrue(palavras.contains("pano"));
		assertTrue(palavras.contains("preço"));
		assertTrue(palavras.contains("bolha"));
		assertTrue(palavras.contains("bacia"));
		assertTrue(palavras.contains("banco"));
		assertTrue(palavras.contains("branco"));
		assertTrue(palavras.contains("posso"));
		assertTrue(palavras.contains("caixa"));
		assertTrue(palavras.contains("prato"));
		assertTrue(palavras.contains("preto"));
		assertTrue(palavras.contains("azul"));
	}

	@Test
	public void size() {
		assertEquals(20, palavras.quantidade());
	}

	@Test
	public void remover() {
		palavras.remover("teste");
		assertEquals(19, palavras.quantidade());
		assertTrue(!palavras.contains("teste"));
	}

}
