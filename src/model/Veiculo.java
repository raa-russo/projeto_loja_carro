package model;

public class Veiculo {
    private String marca;
    private String modelo;
    private double preco;
    private int id;
    /**
     * Método construtor da classe Veiculo
     */
    public Veiculo(int id, String marca, String modelo, double preco) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }
    /**
     * Retorna todas as informações da classe veículo
     */
    @Override public String toString() {
        return String.format("id: %d, marca: %s, modelo: %s, preço: R$ %,.2f", id, marca, modelo, preco);
    }
    /**
     * Retorna a marca do veículo
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Atualiza a marca do veículo
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Retorna o modelo do veículo
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * Atualiza o modelo do veículo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Retorna o preço do veículo
     */
    public double getPreco() {
        return this.preco;
    }
    /**
     * Atualiza o preço do veículo
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    /**
     * Retorna o id do veículo
     */
    public int getId() {
        return this.id;
    }
    /**
     * Atualiza o id do veículo
     */
    public void setId(int id) {
        this.id = id;
    }
}
