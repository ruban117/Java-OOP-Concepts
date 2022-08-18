public class Constructor_Overloading {
    Constructor_Overloading(String Name){
        System.out.println("Your Name Is: "+Name);
    }
    Constructor_Overloading(String Name, int val){
        System.out.println("Your Name Is: "+Name);
        System.out.println(("Your Is Is: "+val));
    }
    Constructor_Overloading(int age){
        System.out.println("Your Age Is: "+age);
    }
    public static void main(String[] args) {
        Constructor_Overloading c=new Constructor_Overloading("Ruban");
        Constructor_Overloading c1=new Constructor_Overloading("Ruban",117);
        Constructor_Overloading c3=new Constructor_Overloading(18);
    }
}
