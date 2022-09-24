import java.util.Scanner;

class Stack {
    int arr[];

    Stack(int SIZE) {
        this.arr = new int[SIZE];
    }

    int top = -1;

    Boolean IsEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    Boolean IsFull() {
        if (top == arr.length - 1)
            return true;
        else
            return false;
    }

    void push(int n) {
        top++;
        arr[top] = n;
        System.out.println("Element Pushed");
    }

    int PoP() {
        int val;
        val = arr[top];
        top--;
        return val;
    }

    int PEEK(){
        return arr[top];
    }
}

public class StackDatastructure {
    public static void main(String[] args) {
        int n, a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Stack");
        n = sc.nextInt();
        Stack s = new Stack(n);
        // s.top=-1;
        while (true) {
            System.out.println("Press 1 To PUSH");
            System.out.println("Press 2 To PoP");
            System.out.println("Press 3 To PeeK");
            System.out.println("Enter The Case You Want To Do: ");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    if (s.IsFull()) {
                        System.out.println("Stack Overflow!!");
                    } else {
                        System.out.println("Enter The Element You Want To Push: ");
                        b = sc.nextInt();
                        s.push(b);
                    }
                    break;
                case 2:
                    if (s.IsEmpty()) {
                        System.out.println("Stack Underflow!!");
                    } else {
                        System.out.print(s.PoP());
                        System.out.println();
                    }
                    break;
                case 3:
                if (s.IsEmpty()) {
                    System.out.println("Stack Underflow!!");
                } else {
                    System.out.print(s.PEEK());
                    System.out.println();
                }
                break;
            }
        }
    }
}
