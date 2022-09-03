package Tarefa009.Ex1;

public class Preguica extends Animal {
    
    public Preguica( String nome, int idade ){
        super( nome, idade);
    }

    @Override
    public void sound(){
        System.out.println("Balido");
    }

    @Override
    public void action(){
        System.out.println("Sobe Em Arvore");
    }

}
