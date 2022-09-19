class Super{
    void Display(){
        System.out.println("I am a method from super class");
    }
}

class Sub extends Super{
    void Display(){
        System.out.println("I am a method from Sub Class");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Super ref;//refference
        if(Integer.parseInt(args[0])==0){
            ref=new Super();
            ref.Display();
        }
        else{
            ref=new Sub();
            ref.Display();
        }
    }
    
}
