import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLL {
    private Node top;

    StackLL() {
        top = null;
    }

    void push(int item) {
        Node nn = new Node(item);
        nn.next = top;
        top = nn;
        System.out.println(item + " pushed into stack");
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow!");
            return -1;
        }

        int val = top.data;
        top = top.next;
        System.out.println(val + " popped from stack");
        return val;
    }

    int peek() {
        if (top == null) {
            System.out.println("Stack is Empty!");
            return -1;
        }

        System.out.println("Top element is: " + top.data);
        return top.data;
    }

    void display() {
        if (top == null) {
            System.out.println("Stack is Empty!");
            return;
        }

        System.out.print("Stack elements: ");
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class MainLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLL stack = new StackLL();

        int choice, item;
        String cont;

        do {
            System.out.println("\n--- Stack using Linked List ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    item = sc.nextInt();
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
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            if (choice != 5) {
                System.out.print("Do you want to continue (Yes/No)? ");
                cont = sc.next();
            } else {
                cont = "No";
            }

        } while (cont.equalsIgnoreCase("Yes"));

        sc.close();
    }
}