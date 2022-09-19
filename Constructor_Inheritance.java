class Base{
    Base(){
        System.out.println("We are in base class now!!!");
    }
    Base(int x){
        System.out.println("We are in Base class now with the value of x= "+x);
    }
}

class Intermidiate extends Base{
    Intermidiate(){
        System.out.println("We are in Intermidiate class now!!!");
    }
    Intermidiate(int x, int y){
        super(x);
        System.out.println("We are in Intermidiate class now with the value of y= "+y);
    }
}

class Derived extends Intermidiate{
    Derived(){
        System.out.println("We are in Derived class now!!!");
    }
    Derived(int x, int y, int z){
        super(x,y);
        System.out.println("We are in Intermidiate class now with the value of z= "+z);
    }
}




public class Constructor_Inheritance {
    public static void main(String[] args) {
        Derived d=new Derived(10,20,30);
    }
}
