package Tarefa009.Ex1;



public class Cachorro extends Animal {

    public Cachorro( String nome, int idade ){
        super( nome, idade);
    }

    @Override
    public void sound(){
        System.out.println("Late");
    }

    @Override
    public void action(){
        System.out.println("Corre");
    }

}
