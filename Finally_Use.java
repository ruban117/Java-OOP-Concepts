import java.util.Scanner;

public class Finally_Use {
    static float Devide(float a, float b){
        try{
            return a/b;
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("But Still It Will Executed");
        }
        return 0;
    }
    public static void main(String[] args) throws InterruptedException {
        float a,b;
        System.out.println("Enter The 1st Number: ");
        Scanner sc =new Scanner(System.in);
        a=sc.nextFloat();
        System.out.println("Enter The 1st Number: ");
        b=sc.nextFloat();
        System.out.println(Devide(a, b));
        System.out.println("Enter The Starting Value: ");
        int st=sc.nextInt();
        System.out.println("Enter The Denominator: ");
        int den=sc.nextInt();
        while(true){
            try{
                Thread.sleep(500);
                System.out.println(den/st);
            }catch(ArithmeticException e){
                System.out.println(e);
                break;
            }
            finally{
                Thread.sleep(500);
                System.out.println("I will Alawyas Executed");
            }
            st--;
        }
    }
}
