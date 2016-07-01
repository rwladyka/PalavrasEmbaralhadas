package wladyka.rodrigo.palavrasEmbaralhadas.mecanica;

import wladyka.rodrigo.palavrasEmbaralhadas.bancoPalavras.BancoDePalavras;

public class MorteSubita extends MecanicaAbstract {

	public MorteSubita(BancoDePalavras banco) {
		super(banco);
	}

	public boolean continuarJogando(String palavra, String indicacao) {
		if (palavra.equals(indicacao)) {
			adicionaAcerto(palavra);
			return hasNext();
		}
		adicionarErro(palavra, indicacao);
		return false;
	}

	@Override
	public String toString() {
		return "Morte Súbita";
	}

}
