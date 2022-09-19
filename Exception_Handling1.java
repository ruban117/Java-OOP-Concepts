import java.util.Scanner;

public class Exception_Handling1 {
    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0] = 20;
        arr[1] = 25;
        arr[2] = 87;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter The Index Number Of The Array: ");
            int ind = sc.nextInt();
            System.out.println("Enter The Divided Number Of The Array: ");
            float div = sc.nextFloat();
            try {
                System.out.println("This Is Our 1st try block!");
                try {
                    System.out.println("The Number Is Accroing To Your Index Number: " + arr[ind]);
                    System.out.println("The Result Is :" + arr[ind] / div);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("The Exception Occurs Is: " + e);
                } catch (ArithmeticException e) {
                    System.out.println("The Exception Occurs Is: " + e);
                }
            } catch (Exception e) {
                System.out.println("The Exception Occurs Is: " + e);
            }
            System.out.println("Goodbye Asshole Exception Creater!!!");
        }
    }
}
