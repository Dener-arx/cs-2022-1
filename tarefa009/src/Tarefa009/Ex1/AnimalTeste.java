package Tarefa009.Ex1;

import java.util.ArrayList;

public class AnimalTeste {

	public static void main(String[] args) {

		Animal a1 = new Cachorro("Rex", 5);
		Animal a2 = new Cavalo("Tristan", 7);
		Animal a3 = new Preguica("Gian", 3);
		
		System.out.println("--Animal Teste--");
		a1.sound();
		a2.sound();
		a3.sound();

		System.out.println("\n--Veterinario--");
		Veterinario veterinario = new Veterinario();
		veterinario.examinar(a1);
		veterinario.examinar(a2);
		veterinario.examinar(a3);

		System.out.println("\n--Zoologico--");
		Zoologico zoo = new Zoologico();
		zoo.addAnimal(a1);
		zoo.addAnimal(a2);
		zoo.addAnimal(a3);
		zoo.addAnimal(new Cavalo("a4", 5));
		zoo.addAnimal(new Cavalo("a4", 5));
		zoo.addAnimal(new Cachorro("a4", 5));
		zoo.addAnimal(new Preguica("a4", 5));
		zoo.addAnimal(new Preguica("a4", 5));
		zoo.addAnimal(new Cachorro("a4", 5));
		zoo.addAnimal(new Cavalo("a4", 5));
		
		
		ArrayList<Animal> list = zoo.getJaula();
		
		
		for (Animal i : list){
			i.sound();
		}
		
	}

}
