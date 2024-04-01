package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog.DogBuilder()
            .setBreed("Golden Retriever")
            .setColor("Golden")
            .setAge(5)
            .setName("Buddy")
            .build();
        System.out.println(dog1);

        Dog dog2 = new Dog.DogBuilder()
            .setBreed("Labrador Retriever")
            .setColor("Black")
            .setAge(3)
            .setName("Max")
            .build();
        System.out.println(dog2);
    }
}
