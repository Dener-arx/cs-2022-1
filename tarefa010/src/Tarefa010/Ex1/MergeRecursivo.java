package Tarefa010.Ex1;

public class MergeRecursivo {
	

    public void mergeSort(int[] array, int begin, int end) {
        if ((end-begin)<2){
            return;
        }
        
        int mid = (begin+end)/2;
        
        mergeSort(array, begin, mid);
        mergeSort(array, mid, end);
        merge(array, begin, mid, end);
        
    }

    public void merge(int[] array, int begin, int mid, int end){
    	
    	int[] left = new int[mid-begin];
    	int[] right = new int[end-mid];
    	
    	for( int i=0 ; i<left.length ; i++ ) {
    		left[i] = array[begin+i];
    	}
    	
    	for( int i=0 ; i<right.length ; i++ ) {
    		right[i] = array[mid+i];
    	}
    	
    	int i = begin;
    	int j = 0;
    	int k = 0;
    	
    	while ( j<left.length && k<right.length ) {
    		if ( left[j] <= right[k] ) {
    			array[i] = left[j];
    			i++;
    			j++;
    		}
    		else {
    			array[i] = right[k];
    			i++;
    			k++;
    		}
    	}
    	
    	while ( j<left.length ) {
    		array[i] = left[j];
    		i++;
			j++;
    	}
    	
    	while ( k<right.length ) {
    		array[i] = right[k];
    		i++;
			k++;
    	}
    }
}
