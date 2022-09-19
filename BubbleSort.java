public class BubbleSort {
    public static void main(String[] args) {
        int arr[]=new int[args.length];
        int i;
        for(i=0;i<args.length;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        System.out.println();
        System.out.println("Before Bubble Sort!!");
        for(i=0;i<args.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<args.length;i++){
            for(int j=0;j<args.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Bubble Sort!!");
        for(i=0;i<args.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
