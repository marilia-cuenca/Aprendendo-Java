
public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("Testando condicionais...");
		int idade = 15;
		int quantidadePessoas = 3;
	
		if(idade >= 18) {
			System.out.println("Voc� � maior de idade");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18 anos, mas pode entrar acompanhado.");
			}	else {
					System.out.println("Infelizmente voc� n�o pode entrar.");
		}
	}
}
}