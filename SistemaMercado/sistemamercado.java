package SistemaMercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sistemamercado {

    static class Produto {
        int codigo;
        String nome;
        float preco;

        public Produto(int codigo, String nome, float preco) {
            this.codigo = codigo;
            this.nome = nome;
            this.preco = preco;
        }

        @Override
        public String toString() {
            return "Codigo: " + codigo + ", Nome: " + nome + ", Preco: " + String.format("%.2f", preco);
        }
    }

    static class ItemCarrinho {
        Produto produto;
        int quantidade;

        public ItemCarrinho(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
        }
    }

    static List<Produto> produtos = new ArrayList<>();
    static List<ItemCarrinho> carrinho = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcao;

        do {
            System.out.println("\n=== Menu do Supermercado ===");
            System.out.println("1. Cadastrar Produtos");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Comprar Produtos");
            System.out.println("4. Visualizar Carrinho");
            System.out.println("5. Fechar Pedido");
            System.out.println("6. Sair");
            System.out.println("Escolha um opcao: ");

            opcao = sc.nextInt();
            sc.nextLine(); // Consome a quebra de linha pendente

            switch(opcao) {
                case 1:
                    CadastrarProdutos();
                    break;
                case 2:
                    ListarProdutos();
                    break;
                case 3:
                    ComprarProdutos();
                    break;
                case 4:
                    VisualizarCarrinho();
                    break;
                case 5:
                    FecharPedido();
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente");
            }

        } while(opcao != 6);
    }

    // Cadastrar Novo Produto
    public static void CadastrarProdutos() {
        System.out.println("Código do produto: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.println("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.println("Preço do produto");
        float preco = sc.nextFloat();
        sc.nextLine();

        Produto p = new Produto(codigo, nome, preco);
        produtos.add(p);
        System.out.println("Produto cadastrado com sucesso!");
    }

    // Listar Produtos
    public static void ListarProdutos() {
        System.out.println("\n=== Produtos Cadastrados ===");
        for(Produto p : produtos) {
            System.out.println(p);
        }
    }

    // Realizar a compra de um produto
    public static void ComprarProdutos() {
        System.out.println("Informe o codigo do produto que deseja comprar: ");
        int codigo = sc.nextInt();
        sc.nextLine(); //Consumir nova Linha

        Produto p = pegarProdutoPorCodigo(codigo);
        if(p != null) {
            int index = temNoCarrinho(codigo);
            if(index != -1) {
                carrinho.get(index).quantidade++; //Se o produto estiver no carrinho, incrementa a quantidade
            } else {
                carrinho.add(new ItemCarrinho(p, 1)); // Caso contrário, adiciona um novo item no carrinho
            }

            System.out.println("Produto adicionado ao carrinho.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    // Visualizar os itens do carrinho
    public static void VisualizarCarrinho() {
        System.out.println("\n=== Carrinho ===");
        if(carrinho.isEmpty()) {
            System.out.println("Carrinho vazio");
            return;
        }

        for(ItemCarrinho item : carrinho) {
            System.out.println("Produto: " + item.produto.nome + 
                                ", Preço: "+ String.format("%.2f", item.produto.preco) + 
                                ", Quantidade: " + item.quantidade);
        }
    }

    // Exibe a fatura, fecha o pedido e esvazia o carrinho
    public static void FecharPedido() {
        System.out.println("\n=== Fatura ===");
        float total = 0;
        for(ItemCarrinho item : carrinho) {
            float subtotal = item.produto.preco * item.quantidade;
            System.out.println("Produto: " + item.produto.nome + 
                                ", Quantidade: " + item.quantidade + 
                                ", Subtotal: " + String.format("%.2f", subtotal));

            total += subtotal;
        }

        System.out.println("Valor total: " + String.format("%.2f", total));
        carrinho.clear(); // Esvazia o carrinho
        System.out.println("Pedido finalizado com sucesso!");
    }

    // Método que verifica se o produto já está no carrinho
    // Retorna o índice do item se encontrado ou -1 caso contrário
    public static int temNoCarrinho(int codigo) {
        for(int i = 0; i < carrinho.size(); i++) {
            if(carrinho.get(i).produto.codigo == codigo) {
                return i;
            }
        }
        return -1;
    }

    public static Produto pegarProdutoPorCodigo(int codigo) {
        for (Produto p : produtos) {
            if (p.codigo == codigo) {
                return p;
            }
        }
        return null;
    }
}