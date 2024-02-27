public class Method {
    int Add(){
        int a=10,b=20;
        int Sum= (a+b);
        return Sum;

    }
    
    
    public static void main(String[] args) {
       Method obj =new Method();
        //obj.Disp();
       // obj.Add();
       obj.Add();
       Disp();

    }
    static void Disp(){
        System.out.println("Jay Nepal");
    }
   
}
