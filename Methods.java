public class Methods {
    public static int Factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        else{
            return num*Factorial(num-1);
        }
    }

    public static int Fibonacci(int num){
        if(num==1|| num==0){
            return num;
        }
        else{
            return Fibonacci(num-1)+Fibonacci(num-2);
        }
    }

    public static void main(String[] args) {
        int a=5,b=10;
        System.out.println("The Factorial of "+a+" is");
        System.out.println(Factorial(a));
        System.out.println("The Fibonacci Series Is: ");
        for(int i=0;i<b;i++){
            System.out.print(Fibonacci(i)+" ");
        }
    }
}
