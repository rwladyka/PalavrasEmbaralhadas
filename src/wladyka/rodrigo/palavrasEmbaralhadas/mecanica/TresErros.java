package wladyka.rodrigo.palavrasEmbaralhadas.mecanica;

import wladyka.rodrigo.palavrasEmbaralhadas.bancoPalavras.BancoDePalavras;

public class TresErros extends MecanicaAbstract {

	public TresErros(BancoDePalavras banco) {
		super(banco);
	}

	public boolean continuarJogando(String palavra, String indicacao) {
		if (palavra.equals(indicacao)) {
			adicionaAcerto(palavra);
			return hasNext();
		}
		adicionarErro(palavra, indicacao);
		return quantidadeErros() < 3;
	}

	@Override
	public String toString() {
		return "3 Erros";
	}

}
