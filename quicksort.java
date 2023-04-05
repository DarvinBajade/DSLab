import java.util.Scanner;

public class quicksort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int arraySize = input.nextInt();
        
        int[] arrayElement = new int[arraySize];
        System.out.print("Enter the elements: ");
        for (int counter = 0; counter < arraySize; counter++) {
            arrayElement[counter] = input.nextInt();
        }
        
        quickSort(arrayElement, 0, arraySize-1);
        
        System.out.print("Sorted array (after quicksort): ");
        for (int counter = 0; counter < arraySize; counter++) {
            System.out.print(arrayElement[counter] + " ");
        }
    }
    
    public static void quickSort(int[] arrayElement, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arrayElement, low, high);
            quickSort(arrayElement, low, pivotIndex - 1);
            quickSort(arrayElement, pivotIndex + 1, high);
        }
    }
    
    public static int partition(int[] arrayElement, int low, int high) {
        int pivot = arrayElement[high];
        int counter = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arrayElement[j] < pivot) {
                counter++;
                swap(arrayElement, counter, j);
            }
        }
        swap(arrayElement, counter + 1, high);
        return counter + 1;
    }
    
    public static void swap(int[] arrayElement, int counter, int j) {
        int temp = arrayElement[counter];
        arrayElement[counter] = arrayElement[j];
        arrayElement[j] = temp;
    }
}
