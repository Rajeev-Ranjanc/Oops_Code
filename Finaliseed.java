//
import java.lang.*;
class A{
    String name;
    A(String name){
        this.name = name;
    }
//    finaliser
//    garbage collector work's

    //it will run's when object will about to destroy then garbage collector will perform some to do so
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
public class Finaliseed {
    public static void main(String[] args) {
//        final A rajeev = new A("Rajeev");
//        rajeev.name ="Rajeev Ranjan Yadav"; // its final still we are able to do it because its refers the same object
//        System.out.println(rajeev.name);
//        rajeev= new A("Manmohan");//its producing error now it's final
        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("random name");
        }

    }
}
