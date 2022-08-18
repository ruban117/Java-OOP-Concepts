public class CommandLineArgs2 {
    public static void main(String[] args) {
        int max,min;
        max=Integer.parseInt(args[0]);
        min=Integer.parseInt(args[0]);
        for(int i=0;i<args.length;i++){
            if(Integer.parseInt(args[i])>max){
                max=Integer.parseInt(args[i]);
            }
            else if(Integer.parseInt(args[i])<min){
                min=Integer.parseInt(args[i]);
            }
        }
        //float avg=Float.parseFloat((max+min)/(args.length));
        System.out.println("The Maximum Number Is : "+max);
        System.out.println("The Minimum number is : "+min);
        System.out.println("The Average Is: "+(float)(max+min)/(args.length));
    }
}
