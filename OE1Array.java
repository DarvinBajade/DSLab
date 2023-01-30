import java.util.Scanner;

public class OE1Array{
    static void Traverse(){
        int counter;
        int MainArray[] = {10,20,30,40,50,60};
        System.out.println("Traverse Switch");
        System.out.println("The original array elements are :");
        for(counter = 0;counter < MainArray.length; counter++){
            System.out.println("Array["+ counter + "]" + "   " + MainArray[counter]);
        }
    }
    static void Delete(){
        System.out.println("Delete Switch");
        Scanner myObj = new Scanner(System.in);
        int counter = 0,delete;
        int MainArray[] = {10,20,30,40,50,60};
        System.out.println("The original array elements are :");
        for(counter = 0;counter < MainArray.length; counter++){
            System.out.println("Array["+ counter + "]" + "   " + MainArray[counter]);
        }
        System.out.println("Select which array to delete [' ']");
        delete = myObj.nextInt();
        System.out.println("The array after the deletion:");
        
        for(counter = 0;counter < (MainArray.length); counter++){
            while(delete == counter){
            counter = counter + 1;
        }
            System.out.println("Array["+ counter + "]" + "   " + MainArray[counter]);
        }
    }
    static void Search(){
        System.out.println("Search Switch");
        Scanner myObj = new Scanner(System.in);
        int counter = 0,search;
        int MainArray[] = {10,20,30,40,50,60};
        System.out.println("The original array elements are :");
        for(counter = 0;counter < MainArray.length; counter++){
            System.out.println("Array["+ counter + "]" + "   " + MainArray[counter]);
        }
        System.out.println("Select what array to search ");
        search = myObj.nextInt();
        System.out.println("The array Element of "+ search + " is :" + MainArray[search]);
    }
    static void Update(){
        System.out.println("Update Switch");
        Scanner myObj = new Scanner(System.in);
        int counter = 0,select, replace;
        int MainArray[] = {10,20,30,40,50,60};
        System.out.println("The original array elements are :");
        for(counter = 0;counter < MainArray.length; counter++){
            System.out.println("Array["+ counter + "]" + "   " + MainArray[counter]);
        }
        System.out.println("Select what array to Edit [ ] :");
        select = myObj.nextInt();
        System.out.println("Select what value to replace the element : ");
        replace = myObj.nextInt();
        System.out.println("The Updated array is : ");
        for(counter = 0; counter < MainArray.length; counter++){
            while(select == counter){
                System.out.println("Array["+ counter + "]" + "   " + replace);
                counter = counter + 1;
            }
            System.out.println("Array["+ counter + "]" + "   " + MainArray[counter]);
        }
    }

    static void TryAgain(){
        Scanner myObj = new Scanner(System.in);
        int ans = 1;
        System.out.println("Do you want to try again?");
        System.out.println("Yes [1]");
        System.out.println("No  [2]");
        ans = myObj.nextInt();
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Choose Which Array Implementation To Use");
        System.out.println("[a] Traverse");
        System.out.println("[b] Delete");
        System.out.println("[c] Search");
        System.out.println("[d] Update");

            String MenuInput = myObj.nextLine();
            switch(MenuInput){
            case "a":
            Traverse();
            break;
            case "b":
            Delete();
            break;
            case "c":
            Search();
            break;
            case "d":
            Update();
            break;
        }
    }
}