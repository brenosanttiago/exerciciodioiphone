package fabrica;

import aparelhos.Iphone;

public class testes {

	public static void main(String[] args) {
		
	Iphone iphone1 = new Iphone();
	
	//FUNÇÕES TELEFÔNICAS
	iphone1.atender();
	iphone1.ligar("4002-8922");
	iphone1.iniciarCorreioVoz();
	
	//FUNÇÕES MUSICAIS
	iphone1.tocar();
	iphone1.pausar();
	iphone1.selecionarMusica("Traço Teu - Ikki");
	
	//FUNÇÕES WEB
	iphone1.exibirPagina("www.youtube.com");
	iphone1.atualizarPagina();
	iphone1.adciocionarNovaAba();

	}

}
