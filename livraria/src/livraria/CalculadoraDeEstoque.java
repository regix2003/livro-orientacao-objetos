package livraria;

public class CalculadoraDeEstoque {
	public static void main(String[]args) {
		
		double livroJava8;
		double livroTDD;
		double soma = 0;
		int contador = 0;
		
		livroJava8 = 59.90;
		livroTDD = 59.90;
		
		//soma = livroJava8 + livroTDD;
		while(contador <35) {
			double valorDoLivro = 59.90;
			soma = soma + valorDoLivro;
			contador++;
		}
		
		System.out.println("O total em estoque é: "+soma);
		
		if (soma < 150) {
			System.out.println("Seu estoque está baixo!");
		} else if (soma >= 2000) {
			System.out.println("Seu estoque está muito alto!");
		} else {
			System.out.println("Seu estoque está bom!");
		}
		
	}
}
