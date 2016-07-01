package wladyka.rodrigo.palavrasEmbaralhas.mecanica;

public class TresErros extends MecanicaAbstract {

	public boolean continuarJogando(String palavra, String indicacao) {
		if (palavra.equals(indicacao)) {
			adicionaAcerto(palavra);
			return true;
		}
		adicionarErro(palavra, indicacao);
		return quantidadeErros() < 3;
	}

}
