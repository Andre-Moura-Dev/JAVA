public class BuscaProgressaoAritmetica {
    public static int buscaPA(int primeiroTermo, int razao, int valorProcurado) {
        // Verifica se a razão é zero para evitar divisão por zero
        if (razao == 0) {
            if (primeiroTermo == valorProcurado) {
                return 1; // Se a razão for zero e o valor procurado é igual ao primeiro termo, retorna 1
            } else {
                return -1; // Se a razão for zero e o valor procurado é diferente do primeiro termo, retorna -1
            }
        }

        // Calcula o índice do termo na progressão
        int indice = (valorProcurado - primeiroTermo) / razao + 1;

        // Verifica se o índice é válido
        if (indice > 0 && primeiroTermo + (indice - 1) * razao == valorProcurado) {
            return indice; // Retorna o índice do termo na progressão
        } else {
            return -1; // Retorna -1 se o valor procurado não for encontrado na progressão
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso do método buscaPA
        int primeiroTermo = 1;
        int razao = 3;
        int valorProcurado = 10;

        int resultado = buscaPA(primeiroTermo, razao, valorProcurado);

        if (resultado != -1) {
            System.out.println("O valor " + valorProcurado + " está na posição " + resultado + " da progressão.");
        } else {
            System.out.println("O valor " + valorProcurado + " não está na progressão.");
        }
    }
}
