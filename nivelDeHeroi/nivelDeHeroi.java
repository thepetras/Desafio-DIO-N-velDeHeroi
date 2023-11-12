import java.util.Scanner;
public class nivelDeHeroi {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o nome do heroi: \n");
		String nomeHeroi = input.nextLine();		
			
		System.out.println("Entre com a quantidade de experiência do heroi: \n");
		int xp = input.nextInt();
		String nivel;
			
		if(xp > 0) {
			if(xp < 1000){
				nivel = "FERRO";
				System.out.printf("O heroi de nome %s está no nível de %s.\n", nomeHeroi, nivel); 
			} else if ((xp >= 1001) && (xp <= 2000)){
				nivel = "BRONZE";
				System.out.printf("O heroi de nome %s está no nível de %s.\n", nomeHeroi, nivel);
			} else if ((xp >= 2001) && (xp <= 5000)){
				nivel = "PRATA";
				System.out.printf("O heroi de nome %s está no nível de %s.\n", nomeHeroi, nivel);
			} else if ((xp >= 6001) && (xp <= 7000)){
				nivel = "OURO";
				System.out.printf("O heroi de nome %s está no nível de %s.\n", nomeHeroi, nivel);
			} else if ((xp >= 7001) && (xp <= 8000)){
				nivel = "PLATINA";
				System.out.printf("O heroi de nome %s está no nível de %s.\n", nomeHeroi, nivel);
			} else if ((xp >= 8001) && (xp <= 9000)){
				nivel = "ASCENDENTE";
				System.out.printf("O heroi de nome %s está no nível de %s.\n", nomeHeroi, nivel);
			} else if ((xp >= 9001) && (xp <= 10000)){
				nivel = "IMORTAL";
				System.out.printf("O heroi de nome %s está no nível de %s.\n", nomeHeroi, nivel);
			} else if (xp >= 10001){
				nivel = "RADIANTE";
				System.out.printf("O heroi de nome %s está no nível de %s.\n", nomeHeroi, nivel);
			}
		} else {
			System.out.println("Número xp inválido!\n");
		}		
	}
}