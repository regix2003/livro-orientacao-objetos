package livraria;

public class CadastroDeLivros {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.nome = "Java 8 Pr�tico";
		livro.descricao = "Novos Recursos da linguagem";
		livro.valor = 59.90;
		livro.isbn = "978-85-66250-46-6";
		
		livro.mostrarDetalhes();
		
		Livro outroLivro = new Livro();
		outroLivro.nome = "L�gica de Programa��o";
		outroLivro.descricao = "Crie seu primeiros programas";
		outroLivro.valor = 59.90;
		outroLivro.isbn = "978-85-66250-22-0";

		outroLivro.mostrarDetalhes();
	}

}
