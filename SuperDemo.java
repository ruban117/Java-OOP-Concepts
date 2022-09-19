class Base{
    int x;
    Base(){
        x=5;
    }
}
class SuperClass extends Base{
    int x;
    SuperClass(){
        x=10;
    }
    void display(){
        System.out.println("Value of SuperDuperClass Variable: "+super.x);
    }
}
class SubClass extends SuperClass{
    int x;
    SubClass(){
        x=20;
    }
    void display(){
        super.display();
        System.out.println("Value of SuperClass Variable: "+super.x);
        System.out.println("Value of SubClass Variable: "+x);
    }

}
public class SuperDemo {
    public static void main(String[] args) {
        SubClass obj=new SubClass();
        obj.display();
        
    }
}

