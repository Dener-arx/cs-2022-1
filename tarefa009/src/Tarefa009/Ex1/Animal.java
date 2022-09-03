package Tarefa009.Ex1;

public class Animal {

    private String nome;
    private int idade;


    public void sound(){
        System.out.println("Late");
    }

    public void action(){
        System.out.println("Corre");
    }



    /// Constructors, Getters and Setters
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }




}
