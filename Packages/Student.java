package TIH.Template;
import java.util.Scanner;

interface Methods{
    void Input();
    void Output();
}

abstract class Student {    //parent class or Super Class
    private String name;
    private String address;
    private String email;
    private int rno;
    private int secondary;
    private int hs;

    Scanner sc = new Scanner(System.in);

    public void getData() {
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Student Roll Number: ");
        rno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Address: ");
        address = sc.nextLine();
        System.out.print("Enter Student Email: ");
        email = sc.nextLine();
        System.out.print("Enter Student Secondary Percentage: ");
        secondary = sc.nextInt();
        System.out.print("Enter Student Higher Secondary Percentage: ");
        hs = sc.nextInt();
    }

    public void DispData() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rno);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Mashyamik Marks: " + secondary);
        System.out.println("Higher Secondary: " + hs);
    }
}