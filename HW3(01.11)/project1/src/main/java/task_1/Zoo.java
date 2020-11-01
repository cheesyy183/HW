package task_1;

public class Zoo {
    public static void main(String[] args) {

        Animal[] arr = {new Cat(), new Dog(), new Cat(), new Dog(), new Dog()};

        for(Animal animal : arr) {
            animal.feed();
            animal.voice();
            System.out.println();
        }
    }
}

interface Animal {
    void voice();
    void feed();
}

class Cat implements Animal {
    public void voice() {
        System.out.println("Meow-Meow!");
    }

    public void feed() {
        System.out.println("I'm eating an cats feed!");
    }
}

class Dog implements Animal {
    public void voice() {
        System.out.println("Woof-Woof!");
    }

    public void feed() {
        System.out.println("I'm eating an dogs feed!");
    }
}
