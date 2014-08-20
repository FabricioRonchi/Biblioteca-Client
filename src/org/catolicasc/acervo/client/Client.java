package org.catolicasc.acervo.client;

import java.util.List;

import org.catolicasc.acervo.service.ListagemLivros;
import org.catolicasc.acervo.service.ListagemLivrosService;
import org.catolicasc.acervo.service.Livro;

public class Client {

		public static void main(String[] args) {
			ListagemLivrosService service = new ListagemLivrosService();
			ListagemLivros client = service.getListagemLivrosPort();
			
			List<Livro> livros = client.listarLIvros();
			for(Livro livro : livros) {
				System.out.print("Nome: " + livro.getNome());							
			}		
	}

}
