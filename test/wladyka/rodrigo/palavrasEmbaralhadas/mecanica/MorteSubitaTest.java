package wladyka.rodrigo.palavrasEmbaralhadas.mecanica;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import wladyka.rodrigo.palavrasEmbaralhadas.bancoPalavras.BancoDePalavras;
import wladyka.rodrigo.palavrasEmbaralhadas.mecanica.FabricaMecanicaDoJogo;
import wladyka.rodrigo.palavrasEmbaralhadas.mecanica.MecanicaDoJogo;

public class MorteSubitaTest {

	private BancoDePalavras banco;
	private MecanicaDoJogo mecanica;

	@Before
	public void before() {
		banco = new BancoDePalavras();
		FabricaMecanicaDoJogo fabricaMecanica = new FabricaMecanicaDoJogo(banco);
		mecanica = fabricaMecanica.get(2);
	}

	@Test
	public void continuarJogandoSemErros_test() {
		String palavra = banco.next();
		String indicacao = palavra;
		while (mecanica.continuarJogando(palavra, indicacao)) {
			palavra = banco.next();
			indicacao = palavra;
		}
		assertEquals(0, banco.quantidade());
		assertEquals(20, mecanica.quantidadeAcertos());
		assertEquals(0, mecanica.quantidadeErros());
	}

	@Test
	public void fimDeJogo_test() {
		String palavra = banco.next();
		String indicacao = palavra;
		for (int i = 1; mecanica.continuarJogando(palavra, indicacao); i++) {
			palavra = banco.next();
			if (i % 5 == 0) {
				indicacao = "asdf";
			} else {
				indicacao = palavra;
			}
		}
		assertEquals(15, banco.quantidade());
		assertEquals(5, mecanica.quantidadeAcertos());
		assertEquals(1, mecanica.quantidadeErros());
	}

}
