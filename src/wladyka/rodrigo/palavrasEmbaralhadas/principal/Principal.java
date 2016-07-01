package wladyka.rodrigo.palavrasEmbaralhadas.principal;

import java.util.Scanner;

import wladyka.rodrigo.palavrasEmbaralhadas.bancoPalavras.BancoDePalavras;
import wladyka.rodrigo.palavrasEmbaralhadas.embaralhador.FabricaEmbaralhadores;
import wladyka.rodrigo.palavrasEmbaralhadas.mecanica.FabricaMecanicaDoJogo;
import wladyka.rodrigo.palavrasEmbaralhadas.mecanica.MecanicaDoJogo;
import wladyka.rodrigo.palavrasEmbaralhadas.model.Erro;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BancoDePalavras banco = new BancoDePalavras();
		FabricaMecanicaDoJogo fabricaMecanica = new FabricaMecanicaDoJogo(banco);
		FabricaEmbaralhadores embaralhadores = new FabricaEmbaralhadores();
		System.out.println("Bem vindo ao Jogo Palavras Embaralhadas!");
		System.out.println("Este jogo foi desenvolvido por Rodrigo Wladyka.");
		System.out.println("Escolha a forma de jogo:");
		System.out.println("(0) Até o fim");
		System.out.println("(1) 3 Erros");
		System.out.println("(2) Morte Súbita");
		int selecao = 0;
		do {
			selecao = scanner.nextInt();
		} while (selecao < 0 || selecao > 2);
		scanner.nextLine();
		MecanicaDoJogo mecanica = fabricaMecanica.get(selecao);
		System.out.println("Sua seleção de jogo foi: " + mecanica);
		String indicacao = "";
		String palavra = "";
		do {
			palavra = banco.next();
			System.out.println("Qual é a palavra:" + embaralhadores.getEmbaralhador().embaralhar(palavra));
			indicacao = scanner.nextLine();
		} while (mecanica.continuarJogando(palavra, indicacao));

		System.out.println("O jogo acabou!");
		System.out.println("");
		System.out.println("Você acertou " + mecanica.quantidadeAcertos() + " palavras.");
		System.out.println("Você errou " + mecanica.quantidadeErros() + " palavras.");
		System.out.println("");
		System.out.println("Seus erros foram: ");
		for (Erro erro : mecanica.getErros()) {
			System.out.println(erro);
		}
		System.out.println("");
		System.out.println("--------------------------------------");
		System.out.println("");
		System.out.println("Seus acertos foram: ");
		for (String acerto : mecanica.getAcertos()) {
			System.out.println(acerto);
		}
	}

}
