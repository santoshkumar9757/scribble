package org.santosh.scribble.designpattern.structural.adapter;

public class BirdAdapter implements ToyDuck {

    private final Bird bird; // Adaptee

    public BirdAdapter(Bird bird) {
        // we need reference to the object we are adapting
        this.bird = bird;
    }

    @Override
    public void quack() {
        bird.makeSound();
    }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new Duck();

        // Wrap a bird in a birdAdapter so that it
        // behaves like toy duck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.quack();

        // toy duck behaving like a bird
        System.out.println("BirdAdapter...");
        birdAdapter.quack();
    }
}
