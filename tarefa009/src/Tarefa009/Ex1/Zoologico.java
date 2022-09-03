package Tarefa009.Ex1;

import java.util.ArrayList;

public class Zoologico {
    
	ArrayList<Animal> jaula = new ArrayList<Animal>();
	
	
	public void addAnimal(Animal animal) {
		jaula.add(animal);
	}
	
	public ArrayList<Animal> getJaula(){
		return jaula;
	}
	
}
