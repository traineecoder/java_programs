public class InheritedInterfaces {
    public static void main(String[] args) {
        MyClass m = new MyClass();
        m.meth1();
        m.meth2();
        m.meth3();
    }
}

interface A{
    void meth1();
    void meth2();
}

interface B extends A{
    void meth2(); // it is valid as there is not definition of method
    void meth3();
}

class MyClass implements B{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
}