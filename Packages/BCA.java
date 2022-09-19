package TIH.BCA;
import java.util.Scanner;
import TIH.Template.*;

public class BCA extends Student implements Methods {
    private int comp;
    Scanner sc = new Scanner(System.in);

    public void Input() {
        getData();
        System.out.print("Enter Your HS Computer Marks: ");
        comp = sc.nextInt();
    }

    public void Output() {
        DispData();
        System.out.println("Higher Secondary Computer Percentage: " + comp);
    }
}