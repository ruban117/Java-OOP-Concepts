class prirorityThread extends Thread{
    String tname;
    prirorityThread(String tn){
        tname=tn;
    }
    public void run(){
        setName(tname);
        int i=1;
        while(i<=100){
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            System.out.println("Thread: "+getName());
            i++;
        }
    }
}

class Thread_Prirorities{
    public static void main(String[] args) {
        prirorityThread t1=new prirorityThread("Ruban Pathak");
        prirorityThread t2=new prirorityThread("Sk Md Altab");
        prirorityThread t3=new prirorityThread("Sovan Sen");
        prirorityThread t4=new prirorityThread("Souvik Banarjee");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}