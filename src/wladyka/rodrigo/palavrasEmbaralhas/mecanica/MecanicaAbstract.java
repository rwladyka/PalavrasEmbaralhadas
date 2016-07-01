package wladyka.rodrigo.palavrasEmbaralhas.mecanica;

import java.util.ArrayList;
import java.util.List;

import wladyka.rodrigo.palavrasEmbaralhas.model.Erro;

public abstract class MecanicaAbstract implements MecanicaDoJogo {

	private List<String> acertos = new ArrayList<>();
	private List<Erro> erros = new ArrayList<>();

	public int quantidadeAcertos() {
		return acertos.size();
	}

	protected void adicionaAcerto(String palavra) {
		acertos.add(palavra);
	}

	public int quantidadeErros() {
		return erros.size();
	}

	protected void adicionarErro(String palavra, String indicacao) {
		Erro erro = new Erro(palavra, indicacao);
		erros.add(erro);
	}
}
