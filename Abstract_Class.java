import java.util.*;
abstract class Depertment{
    Depertment(){}
    abstract void DepertmentName();
    abstract void SubjectInCharge();
    abstract void Output();
    String dept;
    String tec;
}

class BCA extends Depertment{
    BCA(){
        System.out.println("We Are In BCA Depertment");
    }
    Scanner sc=new Scanner(System.in);
    @Override
    void DepertmentName(){
        System.out.print("Enter Depertment Name: ");
        dept=sc.nextLine();
    }
    @Override
    void SubjectInCharge(){
        System.out.print("Enter Depertment techer Name: ");
        tec=sc.nextLine();
    }
    void Output(){
        System.out.println("Depertment Name: "+dept);
        System.out.println("Subject In Charge: "+tec);
    }
}

class MCA extends Depertment{
    MCA(){
        System.out.println("We Are In MCA Depertment");
    }
    Scanner sc=new Scanner(System.in);
    @Override
    void DepertmentName(){
        System.out.print("Enter Depertment Name: ");
        dept=sc.nextLine();
    }
    @Override
    void SubjectInCharge(){
        System.out.print("Enter Depertment techer Name: ");
        tec=sc.nextLine();
    }
    @Override
    void Output(){
        System.out.println("Depertment Name: "+dept);
        System.out.println("Subject In Charge: "+tec);
    }
}

public class Abstract_Class {
   public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        BCA b=new BCA();
        b.DepertmentName();
        b.SubjectInCharge();
        b.Output();
        MCA m=new MCA();
        m.DepertmentName();
        m.SubjectInCharge();
        m.Output();
   }
    
}
