import java.util.Scanner;

public class stackandqueue {
                    //void functions:

                    // Method to add an element to the stack
                    public static void push(int[] array, int element, int top) {
                    array[top + 1] = element;
                    }
            
                    // Method to remove an element from the stack
                    public static void pop(int[] array, int top) {
                    array[top] = 0;
                    }
            
                    // Method to print the elements in the stack
                    public static void printStack(int[] array, int top) {
                    for (int counter = top; counter >= 0; counter--) {
                    System.out.println("[" + array[counter] + "]");
                    }
                    }
                    
                    //void funchtion of enqueue in queue
                    public static void Enqueue(int[] array, int element, int rear) {
                        array[rear] = element;
                    }
                    
                    //void funchtion of dequeue in queue
                    public static void Dequeue(int[] array, int front) {
                        array[front] = 0;
                    }

                    //void function of print in queue
                    public static void printQueue(int[] array, int front, int rear) {
                        for (int counter = front; counter <= rear; counter++) {
                            System.out.println("["+ array[counter] + "] ");
                        }
                    }
            
    //Menu interface
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose what Data Structure to Use");
        System.out.println("[a] Stack");
        System.out.println("[b] Queue");

        String MenuInput = scanner.nextLine();
        switch(MenuInput){
            case "a":
            Stack();
            break;
            case "b":
            Queue();
        }
       
    }

    //Stack void
    static void Stack(){
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the elements in the stack
        int[] array = new int[100];

        // Initialize the top index of the stack to -1
        int top = -1;

        // Ask the user for the number of elements to add to the stack
        System.out.print("Enter the number of elements to add to the stack: ");
        int arrayMax = scanner.nextInt();

        // Ask the user to enter the elements and add them to the stack
        System.out.println("Enter the elements to add to the stack:");
        for (int counter = 0; counter < arrayMax; counter++) {
            int element = scanner.nextInt();
            push(array, element, top);
            top++;
            // Print the updated stack after each push operation
            System.out.println("Updated stack after push:");
            printStack(array, top);
        }
            //function peek
            System.out.println("The element at the top is ["+ array[top]+"]");

        // Ask the user for the number of pop operations to perform on the stack
        System.out.print("Enter the number of pop operations to perform on the stack: ");
        int numPops = scanner.nextInt();

        // Pop elements from the stack and print the new stack after each pop operation
        System.out.println("New stack after each pop operation:");
        for (int counter = 0; counter < numPops; counter++) {
            pop(array, top);
            top--;
            // Print the updated stack after each pop operation
            System.out.println("Updated stack after pop:");
            printStack(array, top);
        }

        //function peek
        System.out.println("The element at the top is "+ array[top]);
    }


    //Queue void
    static void Queue(){

        Scanner scanner = new Scanner(System.in);
    
            int[] array = new int[100];
    
            int front = 0;
            int rear = -1;
    
            // Ask the user for the number of elements to add to the queue
            System.out.print("Enter the number of elements to add to the queue: ");
            int arrayMax = scanner.nextInt();
    
            // Ask the user to enter the elements and add them to the queue
            System.out.println("Enter the elements to add to the queue:");
            for (int counter = 0; counter < arrayMax; counter++) {
                int element = scanner.nextInt();
                rear++;
                Enqueue(array, element, rear);

                // Print the updated queue after each push operation
                System.out.println("Updated queue after enqueue:");
                printQueue(array, front, rear);
            }
                //function peek
                //Print the front and rear of the queue
                System.out.println("The element at the front is ["+ array[front]+"]");
                System.out.println("The element at the back is ["+ array[rear]+"]");

            // Ask the user for the number of dequeue operations to perform on the queue
            System.out.print("Enter the number of dequeue operations to perform on the queue: ");
            int numPops = scanner.nextInt();
    
            // Pop elements from the queue and print the new queue after each dequeue operation
            System.out.println("New queue after each dequeue operation:");
            for (int counter = 0; counter < numPops; counter++) {
                Dequeue(array, front);
                front++;
                //function peek
                // Print the updated queue after each dequeue operation
                System.out.println("Updated queue after dequeue:");
                printQueue(array, front, rear);
            }
            System.out.println("The element at the front is ["+ array[front]+"]");
            System.out.println("The element at the back is ["+ array[rear]+"]");
        }
}




