package model;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
    private final List<Veiculo> estoque = new ArrayList<>();
    private int idVeiculo = 1;
    Scanner leia = new Scanner(System.in);

    /**
     * Método para adicionar um veículo ao estoque
     */
    public void adicionarVeiculo() {

        try {

            int opcao;

            System.out.println(
                "Qual o tipo de veículo?\n" +
                        "1 - carro\n" +
                        "2 - moto\n"
            );

            opcao = Integer.parseInt(leia.nextLine());

            if (opcao == 1) {

                String marca, modelo, tipoCombustivel;
                double preco;
                System.out.println("Qual a marca do carro?");
                marca = leia.nextLine();
                System.out.println("Qual o modelo do carro?");
                modelo = leia.nextLine();
                System.out.println("Qual o preço do carro em reais?");
                preco = Double.parseDouble(leia.nextLine());
                System.out.println("Qual o tipo de combustível?");
                tipoCombustivel = leia.nextLine();
                Carro carro = new Carro(idVeiculo, marca, modelo, preco, tipoCombustivel);
                estoque.add(carro);
                System.out.printf("Carro adicionado ao estoque com o id %d\n\n\n", idVeiculo);
                idVeiculo++;

            } else if (opcao == 2) {

                String marca, modelo, tipoGuidao;
                double preco;
                System.out.println("Qual a marca da moto?");
                marca = leia.nextLine();
                System.out.println("Qual o modelo da moto?");
                modelo = leia.nextLine();
                System.out.println("Qual o preço da moto em reais?");
                preco = Double.parseDouble(leia.nextLine());
                System.out.println("Qual o tipo de guidão?");
                tipoGuidao = leia.nextLine();
                Moto moto = new Moto(idVeiculo, marca, modelo, preco, tipoGuidao);
                estoque.add(moto);
                System.out.printf("Moto adicionada ao estoque com o id %d\n\n\n", idVeiculo);
                idVeiculo++;

            } else {
                System.out.println("Valor informado é inválido\n");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Valor informado é inválido\n");
        }
    }
    /**
     * Método para remover um veículo do estoque a partir da leitura do id
     */
    public void removerVeiculo() {

        try {

            boolean flag = false;
            int idInformado;

            System.out.println("Qual o id de veículo que deseja remover do estoque?\n");
            idInformado = Integer.parseInt(leia.nextLine());

            for (Veiculo veiculo : estoque) {
                if (veiculo.getId() == idInformado) {
                    estoque.remove(veiculo);
                    System.out.println("Veículo removido com sucesso\n");
                    flag = true;
                    break;
                }
            }

            if (!flag) System.out.println("Veículo não encontrado\n");

        } catch (NumberFormatException nfe) {
            System.out.println("Valor informado é inválido\n");
        }
    }
    /**
     * Método para listar todos os veículos em estoque
     */
    public void listarVeiculos() {
        if (estoque.isEmpty()) {
            System.out.println("Não há veículos em estoque\n");
        } else {
            for (Veiculo veiculo : estoque) {
                System.out.println(veiculo.toString());
            }
            System.out.println();
        }
    }
    /**
     * Método para calcular o valor total dos veículos em estoque
     */
    public void calcularValorEstoque() {
        double valorEstoque = 0;
        for(Veiculo veiculo: estoque) {
            valorEstoque += veiculo.getPreco();
        }
        System.out.printf("O valor total do estoque é de %.2f reais\n\n", valorEstoque);
    }
}