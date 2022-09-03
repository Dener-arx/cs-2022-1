package Tarefa010.Ex1;



public class MergeIterativo {
    
	public void mergeSort(int[] array, int arraySize) {
		
		int subArraySize = 1;
				
		while( true ) {
			if ( subArraySize > arraySize ) {
				break;
			}
			
			int offset = 0;
			
			while( true ) {
				if ( offset > arraySize - 1) {
					break;
				}
				
				int begin = offset;
				int mid = offset + subArraySize;
				int end = mid + subArraySize;
				
				if ( end > arraySize-1 ) {
					end = arraySize - 1;
					mid = (begin+end)/2;
				}
				
				merge(array, begin, mid, end );
				
				offset += subArraySize * 2;
			}
			
			subArraySize = subArraySize * 2;
			
		}
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
