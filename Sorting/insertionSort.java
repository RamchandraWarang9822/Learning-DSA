public class insertionSort {

    void insertionSort(int[] arr,String sorted){

        //Insertion Sort :
        //Considering two parts of array
        //One as sorted and another as unsorted
        //we take a value from the unsorted  part and 'insert' it at the right position in the sorted part

        //Time Complexity : 

        //Outer loop : Number of Iterations
        for(int i = 1; i<arr.length; i++){

            int current = arr[i];
            int j = i-1; //taking the last index of sorted part

            //Checks within the sorted part of the array
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
        }
        Main.printArray(arr, sorted = "Insertion Sort Array : ");
    }
}
