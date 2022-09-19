
class Mythread extends Thread{
    int i;
    @Override
   public void run(){
        i=1;
        while(i<=10){
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            System.out.println("I am cooking");
            System.out.println("I am very sad");
            i++;
        }
    }
}

class Mythread2 extends Thread{
    int i;
    public void run(){
        i=1;
        while(i<=10){
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            System.out.println("I am chatting with her");
            System.out.println("I am very happy");
            i++;
        }
    }
}


class Thread1{
    public static void main(String[] args){
        Mythread t1=new Mythread();
        Mythread2 t2=new Mythread2();
        t1.start();
        t2.start();
    }
}