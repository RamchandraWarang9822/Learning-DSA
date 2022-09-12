public class selectionSort {
    
    void selectionSort(int[] arr, String sorted){

        //Selection Sort :
        //In this sorting algorithm we select and set a value as temp maximum
        //compare it with each value in array to find the actual true maximum value 
        //shift the maximum to the end
        
        //Time complexity : O(n^2)

        //Outer loop : no. of iterations
        for(int i = 0; i<arr.length; i++){
            int smallest = i;

            //Inner loop : no. of comparision and update in smallest 
            for( int j = i+1; j<arr.length; j++){
                //Updating the smallest value before swapping
                if( arr[smallest] > arr[j]){
                    smallest = j; 
                }
            }
            //Swapping
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        Main.printArray(arr, sorted = "Selection Sorted Array : ");
    }
}
