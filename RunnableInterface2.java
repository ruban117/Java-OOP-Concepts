class TIHRunnable implements Runnable{
    String tname;
    TIHRunnable(String tn){
        tname = tn;
    }
    
    public void run(){
        for(int i=1;i<=10;i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            System.out.println("Thread: "+ tname +" Count: "+i);
        }
    }
}


public class RunnableInterface2 {
    public static void main(String[] args) {
        TIHRunnable mt1=new TIHRunnable("First Thread");
        Thread t1=new Thread(mt1);
        TIHRunnable mt2=new TIHRunnable("Second Thread");
        Thread t2=new Thread(mt2);
        t1.start();
        t2.start();
    }
}
