public class bubbleSort extends array{

    array array = new array();

    public static void bubbleSort(arr[]){

            //Taking values in array 
            array.takeArray();
        
            
            //Bubble Sort (Sinking Sort): 
            // In this sorting algorithm we push the heavy value element to the end of the array.
            // by swapping two elements with each other until the array is sorted 
            
            //Time complexity : O(n^2)
            
            
                //Outer loop
                for(int i = 0;i < arr.length-1; i++){
                
                    //Inner loop
                    for(int j=0;j<arr.length-i-1;j++){
                
                        if(arr[j] > arr[j+1]){
                
                            //Swapping
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                
                        }
                    }
                }
                
                System.out.print("Sorted : ");
                
                for(int a=0;a<arr.length;a++){
                
                    System.out.print(arr[a] + " ");
                
                }
                
                System.out.println("\n");
            }
}