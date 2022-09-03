package Tarefa009.Ex2;



public class Livro extends Produto{

    private String autor;

    public Livro(String descricao, String autor){
    	super();
    	setDescricao(descricao);
    	setAutor(autor);
    }
    
    public void setAutor( String autor ) {
    	this.autor = autor;
    }
    
    public String getAutor() {
    	return autor;
    }
 
    @Override
    public String getDescricao() {
    	return descricao + " - " + autor;
    }

}
