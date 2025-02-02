package Usuario;

import java.util.Scanner;

public class login {
    String nome_usuario;
    int senha;

    Scanner sc = new Scanner(System.in);

    public void VerificarUsuario() {
        System.out.println("Informe o seu usuario: ");
        nome_usuario = sc.nextLine();

        if(nome_usuario.equals("Andre")) {
            System.out.println("Usuário Correto!");
        } else {
            System.out.println("Usuário Incrorreto!");
        }
    }

    public void VerificacaoSenha() {
        System.out.println("Informe a sua senha: ");
        senha = sc.nextInt();

        if(senha == 7159) {
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }

    public String MostrarDados() {
        return "\n Dados do Login -->"+
                "\n Nome do Usuário: "+nome_usuario+
                "\n Senha do Usuário: "+senha;
    }
}