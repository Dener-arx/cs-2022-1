package Tarefa009.Ex2;

public class Produto {

    private String nomeloja;
    private double preco;
    protected String descricao;


    public Produto() {
    }
   
    public String getNomeloja() {
        return nomeloja;
    }

    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return "Produto de Informatica";
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
