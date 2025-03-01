package SistemaNotas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sistemaNotas {
    private static double nota1, nota2, nota3;

    private static JLabel area;
    private static JFrame janela;

    public static void main(String[] args) {
        // Janela Principal
        janela = new JFrame("Sistema de notas: ");
        janela.setSize(500, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Área texto
        area = new JLabel("Clique no botão para acessar...");
        area.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        janela.add(area);

        // Entrada 
        JButton botaoEntrada = new JButton("Acessar");
        botaoEntrada.setAlignmentX(JButton.CENTER_ALIGNMENT);
        botaoEntrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada();
            }
        });
        janela.add(botaoEntrada);

        // Exibir Janela
        janela.setVisible(true);
    }

    private static void entrada() {
        String nome = JOptionPane.showInputDialog(janela, "Informe seu nome: ");
        String curso = JOptionPane.showInputDialog(janela, "Informe o seu curso");

        if (nome == null || nome.isEmpty() || curso == null || curso.isEmpty()) {
            JOptionPane.showMessageDialog(janela, "Ops, algo de errado não está certo!");
            area.setText("Clique no botão para acessar...");
        } else {
            area.setText("Bem-vindo, "+ nome +", ao curso de " + curso + "!");
        }

        JButton botaoSair = new JButton("Sair da conta");
        botaoSair.setAlignmentX(JButton.CENTER_ALIGNMENT);
        botaoSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sair();
            }
        });
        janela.add(botaoSair);
        janela.revalidate();

        solicitarNotas();
    }

    private static void solicitarNotas() {
        while (true) {
            try {
                nota1 = Double.parseDouble(JOptionPane.showInputDialog(janela, "Digite a 1ª nota: "));
                nota2 = Double.parseDouble(JOptionPane.showInputDialog(janela, "Digite a 2ª nota: "));
                nota3 = Double.parseDouble(JOptionPane.showInputDialog(janela, "Digite a 3ª nota: "));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(janela, "Por favor, insira valores numéricos válidos para as  notas: ");
            }
        }

        calculaMedia();

    }

    private static void calculaMedia() {
        double media = (nota1 + nota2 + nota3) / 3;

        JOptionPane.showMessageDialog(janela, "Média: "+ String.format("%.2f", media));

        if (media >= 7) {
            JOptionPane.showMessageDialog(janela, "Aluno Aprovado! ");
        } else {
            JOptionPane.showMessageDialog(janela, "Aluno Reprovado! ");
        }
    }

    private static void sair() {
        JOptionPane.showMessageDialog(janela, "Até mais, meu caro! ");
        area.setText("Você Saiu! ");
    }
}