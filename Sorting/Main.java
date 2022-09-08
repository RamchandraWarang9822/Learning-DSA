import java.util.Scanner;

public class Main {
    
    static String sorted , unsorted;
    static Scanner sc = new Scanner(System.in);
    static int n;

    //Printing array
    static void printArray(int[] arr,String sorted){

            System.out.print("\n"+sorted);
            for (int i = 0; i<arr.length;i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n");
    }
    
    

    public static void main(String[] args) {

        
        //Takes the size of the array 
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        //Taking values in array
        for (int i = 0; i<size;i++) {
            System.out.print("Enter value for " + i + ":");
            arr[i] = sc.nextInt();
        }
        
        //printing the unsorted array
        printArray(arr,sorted = "Array : ");
        
        //Objects
        bubbleSort bubbleSort = new bubbleSort();
        selectionSort selectionSort = new selectionSort();
        

        //Selecting type of Sorting algorithm
        System.out.println("Enter number to select Sorting algorithm\n");
        System.out.println("1 : Bubble Sort");
        System.out.println("2 : Selection Sort");
        System.out.println("3 : ");
        System.out.println("4 : ");
        System.out.println("5 : ");
        System.out.println("6 : ");
        System.out.print("\n=> ");
        n = sc.nextInt();
        
        
        //running algorithm according the selection
        switch (n) {
            case 1: bubbleSort.bubbleSort(arr, sorted);
            break;
            case 2: selectionSort.selectionSort(arr, sorted);
            break;
        }
    
    }
}
