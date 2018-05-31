package br.com.caelum.livraria.webService;

import java.rmi.RemoteException;

public class TesteRequestSoapComJava {

	public static void main(String[] args) throws RemoteException {
		LivrariaWS cliente = new LivrariaWSProxy();
		Livro[] livros = cliente.getLivrosPeloNome("Arquitetura");
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo());
			System.out.println(livro.getAutor().getNome());
		}
	}

}
