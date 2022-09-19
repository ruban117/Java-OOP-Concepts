import java.util.Scanner;

class NegativeDimentionException extends Exception{
    public String toString(){
        return "This Is A Negative Dimention Exception";
    }
}

public class Throw_Throws {
    public static float Devide(float a, float b) throws ArithmeticException{
        float res=a/b;
        return res;
    }

    public static double AreaOfCircle(double radous) throws NegativeDimentionException{
        if(radous<0){
            throw new NegativeDimentionException();
        }
        double res= Math.PI*radous*radous;
        return res;
    }
    public static void main(String[] args) {
        float a,b;
        double r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number In Denominator: ");
        a=sc.nextFloat();
        System.out.println("Enter The Number In Numerator: ");
        b=sc.nextFloat();
        System.out.println("Enter The Readous Of A Circle: ");
        r=sc.nextDouble();
        try{
            System.out.println(Devide(a, b));
            System.out.println(AreaOfCircle(r));
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(NegativeDimentionException e){
            System.out.println(e);
        }
    }
}
