package livraria;

public class Livro {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	//construtor
	public Livro(Autor autor) {
		this.autor = autor;
		
	}
	
	//segundo construtor, para quando não passar um autor
	public Livro() {
		System.out.println("Novo livro criado!!");
	}
	
	void mostrarDetalhes() {
		String mensagem = "Mostrando detalhes do livro; ";
		System.out.println(mensagem);
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(valor);
		System.out.println(isbn);
		if (this.temAutor()) {
		autor.mostrarDetalhes();
		}
		System.out.println("--");
	}
	
	public void aplicaDescontoDe(double porcentagem) {
		this.valor = this.valor * porcentagem;
	}
	
	boolean temAutor() {
		return this.autor != null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	
}
