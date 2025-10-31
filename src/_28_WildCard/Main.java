package _28_WildCard;

import _26_Singleton.LogManager;

public class Main {
    public static void main(String[] args) {
        Box<Dog> dogbox = new Box<>();
        Dog dog = new Dog();
        dogbox.setValue(dog);
        Box<Cat> catBox = new Box<>();
        Cat cat = new Cat();
        catBox.setValue(cat);

        Unbounded.inspect(dogbox);
        Unbounded.inspect(catBox);

        Box<Corgi> corgiBox = new Box<>();
        corgiBox.setValue(new Corgi());

        UpperBounded.inspect(dogbox);
        UpperBounded.inspect(corgiBox);

        System.out.println("==============================");
        Box<Animal> animalBox = new Box<>();
        Box<Object> objectBox = new Box<>();
        LowerBounded.putDog(animalBox);
        LowerBounded.putDog(objectBox);

        System.out.println(dogbox.getValue());

    }
}
