package BuilderPattern;

public class Dog {
    
    private String breed;
    private String color;
    private int age;
    private String name;

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
