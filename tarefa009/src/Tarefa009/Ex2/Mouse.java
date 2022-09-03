package Tarefa009.Ex2;



public class Mouse extends Produto{
    
    private String tipo;

    public Mouse(String descricao, String tipo){
    	super();
    	setDescricao(descricao);
    	setTipo(tipo);
    }
    
    public void setTipo( String tipo ) {
    	this.tipo = tipo;
    }
    
    public String getTipo() {
    	return tipo;
    }
 
    @Override
    public String getDescricao() {
    	return descricao + " - " + tipo;
    }
    
}
