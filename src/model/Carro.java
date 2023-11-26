package model;

public class Carro extends Veiculo {
    private String tipoCombustivel;
    /**
     * Método construtor da classe Carro
     */
    public Carro(int id, String marca, String modelo, double preco, String tipoCombustivel) {
        super(id, marca, modelo, preco);
        this.tipoCombustivel = tipoCombustivel;
    }
    /**
     * Retorna todas as informações do carro
     */
    @Override public String toString() {
        return super.toString() + ", Tipo de Combustível: " + tipoCombustivel;
    }
    /**
     * Retorna o tipo do combustível do carro
     */
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    /**
     * Atualiza o tipo do combustível do carro
     */
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}