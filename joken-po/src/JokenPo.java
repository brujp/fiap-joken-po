import java.util.Random;
import java.util.Scanner;

public class JokenPo {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		// Variáveis
		String nomeDoJogador;
		int pedra, papel, tesoura, jogadaDoUsuario, jogadaDoComputador;

		System.out.print("Jogador, digite o seu nome: ");
		nomeDoJogador = sc.nextLine();
		
		System.out.println();

		System.out.println("Olá, " + nomeDoJogador + "! Vamos iniciar!");

		pedra = 1;
		papel = 2;
		tesoura = 3;
		
		System.out.println("===============");
		System.out.println("Pedra = 1");
		System.out.println("Papel = 2");
		System.out.println("Tesoura = 3");
		System.out.println("===============");

		System.out.println();
		
		System.out.print(nomeDoJogador + ", escolha qual será a sua jogada: ");
		jogadaDoUsuario = sc.nextInt();

		if (jogadaDoUsuario != pedra && jogadaDoUsuario != papel && jogadaDoUsuario != tesoura) {
			System.out.println("Insira um valor válido!");
		} else {
			System.out.println("Perfeito, " + nomeDoJogador + "!");
			
			System.out.println();

			jogadaDoComputador = random.nextInt(3) + 1;

			if ((jogadaDoComputador == pedra && jogadaDoUsuario == pedra)
					|| (jogadaDoComputador == papel && jogadaDoUsuario == papel)
					|| (jogadaDoComputador == tesoura && jogadaDoUsuario == tesoura)) {
				System.out.println("Jogada do(a) " + nomeDoJogador + ": " + jogadaDoUsuario);
				System.out.println("Jogada do computador: " + jogadaDoComputador);
				System.out.println("As jogadas foram iguais! Houve um empate");
			} else if (jogadaDoComputador == pedra && jogadaDoUsuario == papel) {
				System.out.println("Jogada do(a) " + nomeDoJogador + ": " + jogadaDoUsuario);
				System.out.println("Jogada do computador: " + jogadaDoComputador);
				System.out.println("Papel ganha de pedra. " + nomeDoJogador + ", você ganhou esta.");
			} else if (jogadaDoUsuario == pedra && jogadaDoComputador == papel) {
				System.out.println("Jogada do(a) " + nomeDoJogador + ": " + jogadaDoUsuario);
				System.out.println("Jogada do computador: " + jogadaDoComputador);
				System.out.println("Papel ganha de pedra. O computador ganhou esta.");
			} else if (jogadaDoUsuario == pedra && jogadaDoComputador == tesoura) {
				System.out.println("Jogada do(a) " + nomeDoJogador + ": " + jogadaDoUsuario);
				System.out.println("Jogada do computador: " + jogadaDoComputador);
				System.out.println("Pedra ganha de tesoura. " + nomeDoJogador + ", você ganhou esta.");
			} else if (jogadaDoComputador == pedra && jogadaDoUsuario == tesoura) {
				System.out.println("Jogada do(a) " + nomeDoJogador + ": " + jogadaDoUsuario);
				System.out.println("Jogada do computador: " + jogadaDoComputador);
				System.out.println("Pedra ganha de tesoura. O computador ganhou esta.");
			} else if (jogadaDoUsuario == tesoura && jogadaDoComputador == papel) {
				System.out.println("Jogada do(a) " + nomeDoJogador + ": " + jogadaDoUsuario);
				System.out.println("Jogada do computador: " + jogadaDoComputador);
				System.out.println("Tesoura ganha de papel. " + nomeDoJogador + ", você ganhou esta.");
			} else {
				System.out.println("Tesoura ganha de papel. O computador ganhou esta.");
			}
		}
		
		sc.close();
	}
}
