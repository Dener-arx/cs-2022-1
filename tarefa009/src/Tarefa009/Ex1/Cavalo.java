package Tarefa009.Ex1;

public class Cavalo extends Animal {
        
    public Cavalo( String nome, int idade ){
        super( nome, idade);
    }

    @Override
    public void sound(){
        System.out.println("Relincha");
    }

    @Override
    public void action(){
        System.out.println("Corre");
    }

}
