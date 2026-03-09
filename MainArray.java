import java.util.Scanner;
class StackArray
{
    private int[] arr;
    private int top;
    private int capacity;

    StackArray(int size) 
    {
        arr=new int[size];
        capacity=size;
        top=-1;
    }

    void push(int item)
    {
        if(top==capacity-1) 
        {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top]=item;
        System.out.println(item + " pushed into stack.");
    }

    int pop()
    {
        if(top==-1) 
        {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int val=arr[top--];
        System.out.println(val+" popped from stack.");
        return val;
    }

    int peek()
    {
        if (top==-1) 
        {
            System.out.println("Stack is Empty!");
            return -1;
        }
        System.out.println("Top element is: "+ arr[top]);
        return arr[top];
    }

    void display() 
    {
        if(top==-1) 
        {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}

public class MainArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StackArray stack=new StackArray(5);
        int choice,item;
        String cont;

        do {
            System.out.println("\n--- Stack using Array ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter element to push: ");
                    item=sc.nextInt();
                    stack.push(item);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            if (choice!=5)
            {
                System.out.print("Do you want to continue (Yes/No)? ");
                cont=sc.next();
            } else {
                cont="No";
            }
        } while(cont.equalsIgnoreCase("Yes"));
    }
}