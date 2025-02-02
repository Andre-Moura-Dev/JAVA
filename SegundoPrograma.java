import java.util.Scanner;

public class SegundoPrograma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int idade, num1, num2;
        char op;

        System.out.println("Digite o seu nome: ");
        nome = sc.next();

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();

        if(idade == 18) {
           System.out.println("Voce e maior de idade: ");
        } else if (idade >= 18) {
           System.out.println("Voce ja e adulto: ");
        }

        System.out.println("Escolha a sua opcao: (ana para soma e maria para multiplicacao)");
        op = sc.next().charAt(0);

        System.out.println("Digite dois numeros para fazer operacoes: \n");
        
        System.out.println("Digite o primeiro numero: \n");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt(); 

        switch(op) {
            case 1:
               System.out.println("Nome: ana \n");
               System.out.println("Voce selecionou ana: \n");
               System.out.println("A soma e: "+ num1 + num2);
            case 2:
               System.out.println("Nome: maria \n");
               System.out.println("Voce selecionou maria: \n");
               System.out.println("A subtracao e: "+ num1 * num2);      
        }
    }
}