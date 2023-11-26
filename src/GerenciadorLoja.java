import java.util.Scanner;
import model.*;

public class GerenciadorLoja {
    public static void main(String[] args) {

        // Variavel onde será guardada a opção do usuário
        int opcao = 0;

        // Instanciando o objeto loja
        Loja loja = new Loja();

        // Instanciando o objeto scanner
        Scanner leia = new Scanner(System.in);

        while (opcao != 5) {

            System.out.println(
                        "Escolha uma das opções:\n" +
                        "  1 - Adicionar veículo ao estoque\n" +
                        "  2 - Remover veículo do estoque\n" +
                        "  3 - Listar veículos em estoque\n" +
                        "  4 - Calcular o valor total do estoque\n" +
                        "  5 - Encerrar o programa\n"
            );

            try {
                opcao = Integer.parseInt(leia.nextLine());

                switch (opcao){
                    case 1:
                        loja.adicionarVeiculo();
                        break;
                    case 2:
                        loja.removerVeiculo();
                        break;
                    case 3:
                        loja.listarVeiculos();
                        break;
                    case 4:
                        loja.calcularValorEstoque();
                        break;
                    case 5:
                        System.out.println("Obrigado por utilizar nosso Sistema!");
                        break;
                    default:
                        System.out.println("Valor informado é inválido\n");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Valor informado é inválido\n");
            }
        }
    }
}