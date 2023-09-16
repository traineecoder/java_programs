public class NestedInterface {
    public static void main(String[] args) {
        Bharat b = new Bharat();
        b.india();
    }
}

interface A{
    void india();
    interface B{
        void japan();
    }
}

// you don't need to implement nested interfaces.
class Bharat implements A{
    public void india(){
        System.out.println("I am indian");
    }
    
}
