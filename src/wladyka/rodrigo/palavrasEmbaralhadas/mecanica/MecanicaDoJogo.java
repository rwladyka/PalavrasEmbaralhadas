package wladyka.rodrigo.palavrasEmbaralhadas.mecanica;

import java.util.List;

import wladyka.rodrigo.palavrasEmbaralhadas.model.Erro;

public interface MecanicaDoJogo {

	public List<Erro> getErros();

	public List<String> getAcertos();

	public int quantidadeAcertos();

	public int quantidadeErros();

	public boolean continuarJogando(String palavra, String palavraIndicada);

}
