import java.util.Scanner;

class My_Exception extends Exception{
    //@Override
    /*public String toString(){
            return "Bokachoda Anko Jano Na?";
    }*/
    @Override
    public String getMessage(){
        return "Bokachoda Anko Jano Na?";
    }
}


public class Exception_Handling2 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter The 1st Number: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter The 2nd Number: ");
        b=sc.nextInt();
        if(b<=0){
            try{
                throw new My_Exception();
            }catch(My_Exception e){
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
        else{
            System.out.println(a/b);
        }
    }
}
