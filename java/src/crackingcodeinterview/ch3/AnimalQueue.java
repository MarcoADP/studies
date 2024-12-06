package crackingcodeinterview.ch3;

import queue.Queue;
import queue.QueueNode;

public class AnimalQueue {

    enum Species {
        CAT, DOG
    }

    static class Animal {
        String name;
        Integer position;
        Species species;

        public Animal(String name, Species species) {
            this.name = name;
            this.species = species;
        }

        @Override
        public String toString() {
            return "[%s] %s %s".formatted(position, species, name);
        }
    }

    Queue<Animal> dogs = new Queue<>();
    Queue<Animal> cats = new Queue<>();
    private int position = 0;

    public void enqueue(Animal animal) {
        animal.position = position;
        position++;
        switch (animal.species) {
            case CAT -> cats.add(animal);
            case DOG -> dogs.add(animal);
        }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty()) {
            return dequeueCat();
        }

        if (cats.isEmpty()) {
            return dequeueDog();
        }

        return cats.peek().getValue().position < dogs.peek().getValue().position ? dequeueCat() : dequeueDog();

    }

    public Animal dequeueDog() {
        return dogs.isEmpty() ? null : dogs.remove().getValue();
    }

    public Animal dequeueCat() {
        return cats.isEmpty() ? null : cats.remove().getValue();
    }

    public void print() {
        QueueNode<Animal> dog = dogs.peek();
        QueueNode<Animal> cat = cats.peek();
        while (dog != null || cat != null) {
            if (dog == null || (cat != null && cat.getValue().position < dog.getValue().position)) {
                System.out.printf("%s || ", cat);
                cat = cat.getNext();
                continue;
            }

            if (cat == null || dog.getValue().position < cat.getValue().position) {
                System.out.printf("%s || ", dog);
                dog = dog.getNext();
            }

        }
    }

}
