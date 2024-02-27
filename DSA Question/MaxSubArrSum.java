public class MaxSubArrSum {
    
    public static void SubArray(int[] arr){
        int Sum=0;
        int MaxSum=0;
        for(int i=0;i<arr.length;i++){
          
            for(int j=0;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                   
                    
                    System.out.print("[ "+ arr[k]+" ]");
                    Sum+=arr[k];
                    if (Sum>MaxSum){
                         MaxSum=Sum;

        }
                }
                System.out.println(Sum);
                 Sum=0;
                

            }
        }
        
        System.out.println("Max Sum Value are: "+ MaxSum);
       
    }

    public static void main(String[] args) {
        int[] Array={1,2,3,-4};
        SubArray(Array);
    }

}
