package aparelhos;


public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	
	//FUNÇÕES TELEFÔNICAS
	public void ligar(String numero) {
		System.out.println("Ligando via Iphone para o número: " + numero);
	}

	public void atender() {
		System.out.println("atendendo via Iphone");

	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz via Iphone");

	}

	//FUNÇÕES MUSICAIS
	public void tocar() {
		System.out.println("Tocando música via Iphone");

	}

	public void pausar() {
		System.out.println("Pausando música via Iphone");

	}

	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a música: " + musica + " via Iphone");

	}

	//FUNÇÕES DA WEB
	public void exibirPagina(String url) {
		System.out.println("Exibindo a página: " + url + " via Iphone");

	}

	public void adciocionarNovaAba() {
		System.out.println("Adicionando aba via Iphone");

	}

	public void atualizarPagina() {
		System.out.println("Atualizando página via Iphone");

	}
	
}
