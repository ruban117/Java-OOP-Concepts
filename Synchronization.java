class Util{
    public static void sleep(int n){
        try{
            Thread.sleep(n);
        }catch(Exception e){}
    }
}

class Table{
    synchronized public void PrintTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
            Util.sleep(1000);
        }
    }
}

class threadone extends Thread{
    Table t;
    int n;
    threadone(Table t, int n){
        this.t=t;
        this.n=n;
    }
    public void run(){
        t.PrintTable(n);
    }
}

class threadtwo extends Thread{
    Table t;
    int n;
    threadtwo(Table t, int n){
        this.t=t;
        this.n=n;
    }
    public void run(){
        t.PrintTable(n);
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Table t=new Table();
        threadone t1=new threadone(t, 5);
        threadtwo t2=new threadtwo(t,100);
        t1.start();
        t2.start();
    }
}
