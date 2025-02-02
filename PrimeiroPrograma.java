import java.util.Scanner;

public class PrimeiroPrograma {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        String nome;

        System.out.println("Digite a sua idade: \n");
        idade = sc.nextInt();
        System.out.println("Digite o seu nome: \n");
        nome = sc.next();

        System.out.println("Seu nome é: \n"+ nome);
        System.out.println("Sua idade é: \n"+ idade);
    }
}
