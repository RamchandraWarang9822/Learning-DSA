public class bubbleSort {

    void bubbleSort(int[] arr, String sorted){

        //Bubble Sort ( Sinking Sort ) :
        //Pushes the heavy value element to the end
        
        //Time complexity : O(n^2)

        //Outer loop : Number of iteration
        for(int i = 0; i<arr.length-1; i++){

            //Inner loop : number of swaps descreasing with number of iterations
            for(int j = 0; j<arr.length-i-1; j++){
                //Swapping
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        //Printing the Sorted array
        Main.printArray(arr,sorted = "Sorted Array : ");
    }
    
}
