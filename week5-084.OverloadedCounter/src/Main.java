public class Main {
    public static void main(String[] args) {
        // write testcode here
        
        Counter counter = new Counter(true);
        
        counter.decrease();
        System.out.println(counter.value());
        counter.increase();
        counter.increase();
        counter.increase();
        System.out.println(counter.value());
        
    }
}
