package fundamentos;

public class Variaveis {
	public static void main(String[] args) {
		int qtde = 3;
		double valor = 4.20;
		double total = valor * qtde;
		
		System.out.println("O valor da compra ser� de " + total);
		System.out.printf("O valor da compra ser� de %f \n ", total);
		System.out.printf("O valor da compra ser� de %.2f ", total);
		// nota��o %f vai colocar um numero com ponto flutuante
		// vai substituir dentro do texto, o %f pela vari�vel que passamos depois da virgula
		// imprimir de forma formatada %f ser� substituido por variaveis
		
	}
	
}
