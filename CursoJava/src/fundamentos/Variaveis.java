package fundamentos;

public class Variaveis {
	public static void main(String[] args) {
		int qtde = 3;
		double valor = 4.20;
		double total = valor * qtde;
		
		System.out.println("O valor da compra será de " + total);
		System.out.printf("O valor da compra será de %f \n ", total);
		System.out.printf("O valor da compra será de %.2f ", total);
		// notação %f vai colocar um numero com ponto flutuante
		// vai substituir dentro do texto, o %f pela variável que passamos depois da virgula
		// imprimir de forma formatada %f será substituido por variaveis
		
	}
	
}
