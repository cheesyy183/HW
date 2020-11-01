package task_1;

public abstract class Bird {
    public String name;
    public String feathers;

    public abstract String fly();

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", feathers='" + feathers + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Bird[] birds = {new Eagle(), new Swallow(), new Penguin(), new Kiwi()};

        for (Bird o : birds) {
            System.out.println(o + "\n" + o.fly());
        }
    }
}

class FlyingBird extends Bird{
    public String fly() {
        return "I am flying!";
    }
}

class NonFlyingBird extends Bird{
    public String fly() {
        return "I amn't flying!";
    }
}

class Eagle extends FlyingBird {
    public Eagle() {
        this.name = "Eagle";
        this.feathers = "Gray-Brown";
    }
}

class Swallow extends FlyingBird {
    public Swallow() {
        this.name = "Swallow";
        this.feathers = "Blue-Green";
    }
}

class Penguin extends NonFlyingBird {
    public Penguin() {
        this.name = "Penguin";
        this.feathers = "Black-Brown";
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        this.name = "Kiwi";
        this.feathers = "Brown";
    }
}