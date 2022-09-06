import java.util.*;

public class array {
    
    int arr[] ;


    void takeArray(){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the array : ");
    int size = sc.nextInt();//Takes the size of the array
    int arr[] = new int[size];

    for(int i = 0;i < size;i++){
        System.out.print("Enter for " + i + " value : " );
        arr[i] = sc.nextInt();
    }

    System.out.print("Array  : ");

    for(int a=0;a<arr.length;a++){
        
        System.out.print(arr[a] + " ");
        
    }

    System.out.println("\n");
    }
}



