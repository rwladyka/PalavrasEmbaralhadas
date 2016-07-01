package wladyka.rodrigo.palavrasEmbaralhadas.mecanica;

import java.util.ArrayList;
import java.util.List;

import wladyka.rodrigo.palavrasEmbaralhadas.bancoPalavras.BancoDePalavras;
import wladyka.rodrigo.palavrasEmbaralhadas.model.Erro;

public abstract class MecanicaAbstract implements MecanicaDoJogo {

	private List<String> acertos = new ArrayList<>();
	private List<Erro> erros = new ArrayList<>();
	private BancoDePalavras banco;

	public MecanicaAbstract(BancoDePalavras banco) {
		this.banco = banco;
	}

	protected boolean hasNext() {
		return banco.hasNext();
	}

	public int quantidadeAcertos() {
		return acertos.size();
	}

	protected void adicionaAcerto(String palavra) {
		banco.remover(palavra);
		acertos.add(palavra);
	}

	public int quantidadeErros() {
		return erros.size();
	}

	public List<Erro> getErros() {
		return erros;
	}

	public List<String> getAcertos() {
		return acertos;
	}

	protected void adicionarErro(String palavra, String indicacao) {
		erros.add(new Erro(palavra, indicacao));
	}
}
