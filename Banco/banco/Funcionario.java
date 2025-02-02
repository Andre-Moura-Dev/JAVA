package Banco.banco;

import java.util.Scanner;

public class Funcionario extends Pessoa {

    Scanner sc = new Scanner(System.in);

    Double salarioBase;

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public Funcionario() {}

    public Funcionario(String nome, int idade, Double salario, Double salarioBase) {
        super(nome, idade, salario);
    }

    public void ReceberDados() {
        System.out.println("Informe o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe a sua idade: ");
        idade = sc.nextInt();
        System.out.println("Digite o seu salário: ");
        salario = sc.nextDouble();
    }

    public int verificarIdade() {
        System.out.println("Informe a sua idade: ");
        idade = sc.nextInt();

        if(idade == 23) {
            return calcularSalario()
        }
    }
}