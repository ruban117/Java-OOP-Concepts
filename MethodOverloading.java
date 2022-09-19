public class MethodOverloading {
    static int Area(int w, int l){ //it is a static midifier so we don't have to create an object
        return w*l;
    }
    static int Area(int a){
        return a*a;
    }
    public static void main(String[] args) {
        int w=5,l=10,a=4;
        System.out.println("Area Of A Rectangle Is: "+Area(w,l));
        System.out.println("Area Of A Square Is: "+Area(a));
    }
}
/*public class Main {
	static int foo(int a) { return 10; }

	// compiler error: foo() is already defined
	static char foo() { return 'a'; }

	public static void main(String args[])
	{
	}
}*/

