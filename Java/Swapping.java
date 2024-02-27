public class Swapping {
    public static void Method(int x,int y){
        int z=0;
        z=x;
        x=y;
        y=z;
        System.out.println("Value of x is : "+x+"Value of Y is: "+y);


    }
    public static void main(String[] args) {
        int x=9;
        int y=7;
        Method(x, y);
        
    }
    
}
