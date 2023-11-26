package model;

public class Moto extends Veiculo {
    private String tipoGuidao;
    /**
     * Método construtor da classe Moto
     */
    public Moto(int id, String marca, String modelo, double preco, String tipoGuidao) {
        super(id, marca, modelo, preco);
        this.tipoGuidao = tipoGuidao;
    }
    /**
     * Retorna todas as informações da moto
     */
    @Override public String toString() {
        return super.toString() + ", Tipo de Guidão: " + tipoGuidao;
    }
    /**
     * Retorna o tipo do guidão
     */
    public String getTipoGuidao() {
        return tipoGuidao;
    }
    /**
     * Atualiza o tipo do guidão
     */
    public void setTipoGuidao(String tipoGuidao) {
        this.tipoGuidao = tipoGuidao;
    }
}

