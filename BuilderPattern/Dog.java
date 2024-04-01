package BuilderPattern;

public class Dog {
    

    private String breed;
    private String color;
    private int age;
    private String name;


    // Constructor for Dog class which takes DogBuilder object as input and sets the attributes of Dog class based on the values set by the client in DogBuilder object.
    public Dog(DogBuilder builder) {
        this.breed = builder.breed;
        this.color = builder.color;
        this.age = builder.age;
        this.name = builder.name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    
    // private functions that can't be exposed to clients as these attributes are immutable and only set once
    private void setBreed(String breed){
        this.breed = breed;
    }

    private void setColor(String color){
        this.color = color;
    }

    private void setAge(int age){
        this.age = age;
    }

    private void setName(String name){
        this.name = name;
    }

    // Builder class for Dog class to create Dog objects with attributes based on the client's choice, which to set and which to not. Once object is created, it can't be modified.

    //Builder class is made static so that it can be accessed without creating an object of Dog class by the client.

    public static class DogBuilder {
        private String breed;
        private String color;
        private int age;
        private String name;

        public DogBuilder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public DogBuilder setColor(String color) {
            this.color = color;
            return this;
        }
        public DogBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public DogBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
    }

}
