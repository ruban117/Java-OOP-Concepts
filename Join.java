class thOne extends Thread{
    int i=1;
    public void run(){
        while(i<=4){
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            System.out.println("Good Morning");
            i++;
        }
    }
}

class thTwo extends Thread{
    int i=1;
    public void run(){
        while(i<=4){
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            System.out.println("Good Evening");
            i++;
        }
    }
}

public class Join{
    public static void main(String[] args){
        thOne t1=new thOne();
        thTwo t2=new thTwo();
        t1.start();
        try{
            t1.join();
        }catch(Exception e){}
        t2.start();
    }
}