package Tarefa009.Ex2;

import java.util.ArrayList;

public class ProdutoTeste {
    
	public static void main(String[] args) {
		
		ArrayList<Produto> carrinho = new ArrayList<Produto>();
		
		
        carrinho.add(new Mouse("Mouse otico, Saida USB. 1.600 dpi", "Produto de Informatica"));
		carrinho.add(new Mouse("Mouse Gamer Redragon Cobra", "Produto de Informatica"));
        carrinho.add(new Mouse("Mouse Logitech M100 Optico", "Produto de Informatica"));
        carrinho.add(new Livro("Principios de Analise e Projeto de Sistemas com UML", "BEZERRA, Eduardo"));
        carrinho.add(new Livro("Guide to the Software Engineering Body of Knowledge", "IEEE Computer Society"));
		
        
        for(Produto i : carrinho){
            System.out.println(i.getDescricao());
        }

	}
    

    
    
}
