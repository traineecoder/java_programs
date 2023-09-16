package p1;

class SamePackage{
    public static void main(String[] args) {
        m abc = new m();
        System.out.println(abc.a);
    }
}

class m{
    protected int a =9;
}