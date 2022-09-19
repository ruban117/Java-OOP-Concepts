public class sleep {
    public static void main(String[] args)throws InterruptedException {
        for(int i=1;i<=100;i++){
            Thread.sleep(500);
            System.out.println(i);
        }
    }
}
