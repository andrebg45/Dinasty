package fundamentos;

public class calculoImc {
	public static void main(String[] args) {
		double massa = 89.5;
		double altura = 1.89 ;
		double imc = massa / (altura * altura);
		
		System.out.println("O valor do IMC é " + imc);
	}
}
