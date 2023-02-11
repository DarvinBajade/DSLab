import java.util.Scanner;

public class PrelimSort {
  public static void main(String[] args) {
    
    //intitialization
    Scanner myObj = new Scanner(System.in);
    String[] MainArray;

    //input from user
    System.out.println("Enter the size of the array: ");
    int arraySize = myObj.nextInt();
    MainArray = new String[arraySize];
    System.out.println("Enter a String to be sorted: ");
    for (int counter = 0; counter < arraySize; counter++) {
      MainArray[counter] = myObj.next();
    }

    //unsorted print
    System.out.println("Unsorted String: ");
    for (String WordPrint : MainArray) {
      System.out.print("[" + WordPrint + "] ");
    }

    //bubble print
    System.out.println(" ");
    Bubble(MainArray);
    System.out.println("Array sorted with Bubble Sort: ");
    for (String WordPrint : MainArray) {
      System.out.print("[" + WordPrint + "] ");
    }

    //insertion print
    System.out.println(" ");
    Insertion(MainArray);
    System.out.println("Array sorted with Insertion Sort: ");
    for (String WordPrint : MainArray) {
      System.out.print("[" + WordPrint + "] ");
    }
  }

  //Bubble sort algorithm
  public static void Bubble(String[] MainArray) {
    int arraySize = MainArray.length;
    for (int counter = 0; counter < arraySize - 1; counter++) {
      for (int counter2 = 0; counter2 < arraySize - counter - 1; counter2++) {
        if (MainArray[counter2].compareTo(MainArray[counter2 + 1]) > 0) {
          String temp = MainArray[counter2];
          MainArray[counter2] = MainArray[counter2 + 1];
          MainArray[counter2 + 1] = temp;
        }
      }
    }
  }

  //Insertion sort algorithm
  public static void Insertion(String[] MainArray) {
    int arraySize = MainArray.length;
    for (int counter = 1; counter < arraySize; ++counter) {
      String key = MainArray[counter];
      int counter2 = counter - 1;
      while (counter2 >= 0 && MainArray[counter2].compareTo(key) > 0) {
        MainArray[counter2 + 1] = MainArray[counter2];
        counter2 = counter2 - 1;
      }
      MainArray[counter2 + 1] = key;
    }
  }
}