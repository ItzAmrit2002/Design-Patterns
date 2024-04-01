package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Television tv1 = Television.getInstance();
        System.out.println(tv1);

        Television tv2 = Television.getInstance();
        System.out.println(tv2);
    }    
}
