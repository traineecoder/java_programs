package p2;
import p1.Hello;

class World extends Hello{
    World(){
        System.out.println("TEST "+m+" "+h);
    }
        public static void main(String[] args){
        World w = new World();
        System.out.println("TEST "+m+" "+h);
    }
}