import java.util.Random;
import java.util.Scanner;

public class jogo_advinhacao {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner sc = new Scanner(System.in);

        int SecretNumber = random.nextInt(100) + 1;
        int tentativas = 0;
        int chute;

        System.out.println("Seja Bem-vindo ao jogo de advinhação!\n");
        System.out.println("Tente advinhar o número entre 1 e 100\n");

        do {
            System.out.println("Informe o seu palpite: \n");
            chute = sc.nextInt();
            tentativas++;

            if(chute < SecretNumber) {
                System.out.println("Muito baixo! Tente Novamente.");
            } else if(chute > SecretNumber) {
                System.out.println("Muito alto! Tente Novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em "+tentativas+ "tentativas");
            }
        }while(chute != SecretNumber);

        sc.close();

    }
}
