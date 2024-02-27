//package DSA Question.Bit Manipulation;
import java.util.*;
public class GetBit {
    public static void main(String[] args) {
        int n=5;//0101
        int pos=3;//1000
        int bitMask=1<<pos;
        
        if((bitMask & n)==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Non-one");
        }
    }
    
}
