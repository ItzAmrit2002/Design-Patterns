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

        // Dog Builder class is used to create Dog objects with attributes based on the client's choice, which to set and which to not. Once object is created, it can't be modified.

        // It was made static so that it can be accessed without creating an object of Dog class by the client.
        // If it was not static, then the client would have to create an object of Dog class to access the DogBuilder class, which would defeat the purpose of using the Builder pattern.

        Dog dog2 = new Dog.DogBuilder()
            .setBreed("Labrador Retriever")
            .setColor("Black")
            .setAge(3)
            .setName("Max")
            .build();
        System.out.println(dog2);
    }
}
