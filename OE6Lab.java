import java.util.Scanner;
import java.util.Random;

public class OE6Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Enter the size of the array:");
        int size = scanner.nextInt();
        
        System.out.println("Select a method to implement the elements of the array:");
        System.out.println("[1] user input ");
        System.out.println("[2] randomly generated ");
        int choice = scanner.nextInt();
        
        int[] arr = new int[size];
        
        switch (choice) {
            case 1:
                System.out.println("Enter " + size + " array elements:");
                for (int counter = 0; counter < size; counter++) {
                    arr[counter] = scanner.nextInt();
                }
                break;
            case 2:
                System.out.println("Generating " + size + " random array elements...");
                for (int counter = 0; counter < size; counter++) {
                    arr[counter] = random.nextInt(100);
                }
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
                break;
        }
        
        System.out.println("Original array:");
        printArray(arr);
        
        hybridSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
    
    public static void hybridSort(int[] arr, int low, int high) {
        if (low < high) {
            if (high - low + 1 <= 10) {
                // Insertion sort for small sub-arrays
                insertionSort(arr, low, high);
            } else {
                // Quicksort for larger sub-arrays
                int pivotIndex = partition(arr, low, high);
                hybridSort(arr, low, pivotIndex - 1);
                hybridSort(arr, pivotIndex + 1, high);
            }
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int counter = low + 1;
        int elementCounter = high;
        
        while (counter <= elementCounter) {
            if (arr[counter] <= pivot) {
                counter++;
            } else if (arr[elementCounter] > pivot) {
                elementCounter--;
            } else {
                // Swap elements at counter and elementCounter
                int temp = arr[counter];
                arr[counter] = arr[elementCounter];
                arr[elementCounter] = temp;
                counter++;
                elementCounter--;
            }
        }
        
        // Swap pivot with element at elementCounter
        int temp = arr[low];
        arr[low] = arr[elementCounter];
        arr[elementCounter] = temp;
        
        return elementCounter;
    }
    
    public static void insertionSort(int[] arr, int low, int high) {
        for (int counter = low + 1; counter <= high; counter++) {
            int key = arr[counter];
            int elementCounter = counter - 1;
            
            while (elementCounter >= low && arr[elementCounter] > key) {
                arr[elementCounter + 1] = arr[elementCounter];
                elementCounter--;
            }
            
            arr[elementCounter + 1] = key;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
