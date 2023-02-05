import java.util.Scanner;


public class OE2BubbleInsertion{
    static void Bubble(){
        int counter,itereationCounter = 1;
        Boolean swapped = false;
        Boolean swapImplemented = true;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input the size of the Array : ");
        int arraySize =myObj.nextInt();
        int MainArray[]= new int [arraySize];
        System.out.println("Select the Array Elements : ");
        for (counter=0;counter<arraySize;counter++){
            MainArray[counter]=myObj.nextInt();
        }
        
        
        //Print the array
        System.out.print("Original Array : ");

        while(swapImplemented == true){
            
        for(counter = 0; counter < MainArray.length; counter++){
            System.out.print(MainArray[counter]+ " ");
        }
            swapImplemented = false;
            for(counter = 0; counter < MainArray.length - 1; counter++){
            if(MainArray[counter] > MainArray[counter + 1]){
                int temp = MainArray[counter];
                MainArray[counter] = MainArray[counter + 1];
                MainArray[counter + 1] = temp;
                swapImplemented = true;
                swapped = true;
                if(swapped == true){
                    System.out.println(" ");
                    System.out.println(MainArray[counter+1] + " " + MainArray[counter] + " <== swapped" );
                }
            }else{
                System.out.println(" ");
                System.out.println(MainArray[counter] + " " + MainArray[counter+1] + " <== didn't swap" );
            }
            
            
    
        }
        if(swapImplemented==true){System.out.println(" ");
            System.out.print("Iteration no. " + itereationCounter + " Array : ");
            itereationCounter++;}
    }
    System.out.print("Final Sorted Array : ");
    for(counter = 0;counter < MainArray.length; counter++){
        System.out.print( MainArray[counter] + " ");
    }
    
}
    static void Insertion(){
        int iterrationcounter = 1;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input the size of the Array : ");
        int arraySize =myObj.nextInt();
        int MainArray[]= new int [arraySize];
        System.out.println("Select the Array Elements : ");
        for (int counter=0;counter<arraySize;counter++){
            MainArray[counter]=myObj.nextInt();
        }

        for(int counter = 1; counter < MainArray.length; counter++) 
        {
            int temp = MainArray[counter];
            int counter2 = counter - 1;
        
            while(counter2 >= 0 && MainArray[counter2] > temp)
            {
                MainArray[counter2 + 1] = MainArray[counter2];
                System.out.println("This number moved to the right: "+ MainArray[counter2]);

                counter2--;
               
            }
            MainArray[counter2 + 1] = temp;
            int displaycounter = counter2 + 1;
            System.out.println(temp+ " inserted at ["+ displaycounter + "]");
            System.out.println("");
            System.out.print("Iterration no." + iterrationcounter);
            iterrationcounter++;
            printarray(MainArray);
            
            
        }
        System.out.println("Final Sorted Array : ");
        printarray(MainArray);
    }

     static void printarray(int[]MainArray){
        System.out.println(" ");
        for(int counter : MainArray) 
        {
            System.out.print(counter + " ");
        }
        System.out.println(" ");

    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Choose what Sorting algorithm to Use");
        System.out.println("[a] Bubble");
        System.out.println("[b] Insertion");

        String MenuInput = myObj.nextLine();
        switch(MenuInput){
            case "a":
            Bubble();
            break;
            case "b":
            Insertion();
        }
    }
}