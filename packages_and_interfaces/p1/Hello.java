package p1;

public class Hello{
    public int m =33;
    protected int h =344;
    // public static void main(String[] args){
    //     System.out.println("Test");
    // }
    protected Hello(){
        System.out.println("base constructer");
    }
    public void test(){
        System.out.println(m);
    }
}