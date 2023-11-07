interface Sortable {
    void sortArray(int[] array);
}

class BubbleSort implements Sortable {
    @Override
    public void sortArray(int[] array) {
        int n = array.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(array[j-1] > array[j]){  
                    //swap elements  
                    temp = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = temp;  
                }  
            }  
        }  
    }
}

class MergeSort implements Sortable {
    @Override
    public void sortArray(int[] array) {
        if(array.length > 1){
            int mid = array.length / 2;

            // Split left part 
            int[] left = new int[mid];
            System.arraycopy(array, 0, left, 0, mid);

            // Split right part 
            int[] right = new int[array.length - mid];
            System.arraycopy(array, mid, right, 0, array.length - mid);

            sortArray(left);
            sortArray(right);

            int i = 0;
            int j = 0;
            int k = 0;

            // Merge left and right arrays
            while(i < left.length && j < right.length){
                if(left[i] < right[j]){
                    array[k] = left[i];
                    i++;
                }else{
                    array[k] = right[j];
                    j++;
                }
                k++;
            }
            while(i < left.length){
                array[k] = left[i];
                i++;
                k++;
            }
            while(j < right.length){
                array[k] = right[j];
                j++;
                k++;
            }
        }
    }
}

class SelectionSort implements Sortable {
    @Override
    public void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < array.length; j++){  
                if (array[j] < array[index]){  
                    index = j; //searching for lowest index  
                }  
            }  
            int smallerNumber = array[index];   
            array[index] = array[i];  
            array[i] = smallerNumber;  
        }  
    }
}

public class ImpSort {
    public static void main(String[] args) {
        Sortable sorter = new BubbleSort(); 
        int[] array = {5, 3, 8, 1, 2}; 
        sorter.sortArray(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}