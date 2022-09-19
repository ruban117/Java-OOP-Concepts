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

class BCA extends Student implements Methods {
    private int comp;
    Scanner sc = new Scanner(System.in);

    @Override
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

final class MCA extends BCA {
    private int bca;
    Scanner sc = new Scanner(System.in);

    public void Input() {
        super.Input();
        System.out.print("Enter Your BCA Marks: ");
        bca = sc.nextInt();
    }

    public void Output() {
        super.Output();
        System.out.println("BCA Percentage: " + bca);
    }
}

class BBA extends Student{
    private int bba;
}

public class Inheritance2 {
    public static void main(String[] args) {
        BCA ruban = new BCA();
        System.out.println("Enter The Details For Admitting BCA Department:::");
        ruban.Input();
        System.out.println();
        ruban.Output();
        System.out.println();
        MCA ankan = new MCA();
        System.out.println("Enter The Details For Admitting MCA Department:::");
        ankan.Input();
        System.out.println();
        ankan.Output();
    }

}
