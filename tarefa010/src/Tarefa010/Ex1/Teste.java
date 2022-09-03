package Tarefa010.Ex1;

import java.util.Random;

public class Teste {
    
	static MergeRecursivo recursivo = new MergeRecursivo();
    static MergeIterativo iterativo = new MergeIterativo();
	
    public static void main(String[] args) {

    	// 100 elements
        int array[] = generateArray( 100 );
        int copy[] = array.clone();
        
        //Recursivo
        long startTime1 = System.nanoTime();
        recursivo.mergeSort(array, 0, array.length);
        long endTime1 = System.nanoTime();
        
        //Iterativo
        long startTime2 = System.nanoTime();
        iterativo.mergeSort(copy, copy.length);
        long endTime2 = System.nanoTime();
        
        long totalTime1 = endTime1 - startTime1;
        long totalTime2 = endTime2 - startTime2;
        
        System.out.println("Ordenando 100 elementos:");
        System.out.println("Recursivo: " + totalTime1 + " ns\nIterativo: " + totalTime2 + " ns \n");

        // 1000 Elementos
        array = generateArray( 1000 );
        copy = array.clone();
        
        startTime1 = System.nanoTime();
        recursivo.mergeSort(array, 0, array.length);
        endTime1 = System.nanoTime();
        
        //Iterativo
        startTime2 = System.nanoTime();
        iterativo.mergeSort(copy, copy.length);
        endTime2 = System.nanoTime();
        
        totalTime1 = endTime1 - startTime1;
        totalTime2 = endTime2 - startTime2;
        
        System.out.println("Ordenando 1000 elementos:");
        System.out.println("Recursivo: " + totalTime1 + " ns\nIterativo: " + totalTime2 + " ns \n");
        
        // 10000 Elementos
        array = generateArray( 10000 );
        copy = array.clone();
        
        startTime1 = System.nanoTime();
        recursivo.mergeSort(array, 0, array.length);
        endTime1 = System.nanoTime();
        
        //Iterativo
        startTime2 = System.nanoTime();
        iterativo.mergeSort(copy, copy.length);
        endTime2 = System.nanoTime();
        
        totalTime1 = endTime1 - startTime1;
        totalTime2 = endTime2 - startTime2;
        
        System.out.println("Ordenando 10000 elementos:");
        System.out.println("Recursivo: " + totalTime1 + " ns\nIterativo: " + totalTime2 + " ns \n");
        
    }


    public static int[] generateArray( int size ){
    	int[] a = new Random().ints(size, 0, 1000).toArray(); // creating random array
        return a;
    } 


}
