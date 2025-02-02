package Banco.banco;

public abstract class Pessoa {
    String nome;
    int idade;
    Double salario;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public Pessoa() {}

    public Pessoa(String nome, int idade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public abstract Double calcularSalario();
    public abstract int verificarIdade();
}