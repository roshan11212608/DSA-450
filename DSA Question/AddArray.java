public class AddArray {

    public static int sum(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans +=arr[i];
        }
        return ans;

    }
    public static void main(String[] args){
        int[] arr={10,20,30};
        System.out.println(sum(arr));
        //AddArray.sum(arr);

    }
}
