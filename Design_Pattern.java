

public class Design_Pattern {
    public static void main(String[] args) {
       
        // Singleton f;
        // Singleton d;

        // f = Singleton.getInstance();
        // d = Singleton.getInstance();

        // if(f == d){
        //     System.out.println("Same");
        // }

        // Bridge
        Vehicle v1 = new Car(new Produce(), new Assemble());
        v1.manu();
        Vehicle v2 = new Bike(new Produce(), new Assemble());
        v2.manu();

    }
}

// final class Singleton{
//     private  static  final Singleton single = new Singleton();

//     private Singleton(){
//         System.out.println("Object created");
//     }
//     public static Singleton getInstance(){
//         return single;
//     }
// }

interface Workshop{
    public void work();
}
class Produce implements Workshop{

    @Override
    public void work() {
        System.out.print("Produced");
    } 
}
class Assemble implements Workshop{

    @Override
    public void work() {
        System.out.println("  and  Assembled");
    } 
}

abstract class Vehicle{
    protected Workshop w1;
    protected Workshop w2;
    
    Vehicle(Workshop w1 , Workshop w2){
        this.w1 = w1;
        this.w2 = w2;
    }
    abstract public void manu();
}
class Car extends Vehicle{

    Car(Workshop w1, Workshop w2) {
        super(w1, w2);
    }
    public void manu(){
        System.out.println("Car");
        w1.work();
        w2.work();
    } 
}
class Bike extends Vehicle{

    Bike(Workshop w1, Workshop w2) {
        super(w1, w2);
    }
    public void manu(){
        System.out.println("Bike");
        w1.work();
        w2.work();
    } 
}