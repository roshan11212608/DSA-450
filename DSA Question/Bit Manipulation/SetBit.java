public class SetBit{
    public static void main(String[] args) {
        int n=5; //101
        int i=1;
        int bitMask=1<<i;// 010
        
        int newNumber=bitMask | n;
        System.out.println(newNumber);
    }
} 