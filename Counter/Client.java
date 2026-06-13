package Counter;

public class Client {
    static void main(){
        Counter counter = new Counter();
        counter.increment();
        counter.reset();
        System.out.println(counter.getCount());
        counter.increment();
        counter.reset();
        counter.increment();
        counter.increment();
        counter.decrement();
        System.out.println(counter.getCount());
    }
}
