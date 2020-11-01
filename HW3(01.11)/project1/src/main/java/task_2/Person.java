package task_2;

public abstract class Person {
    public String name;

    public abstract void print();

    public static void main(String[] args) {
        System.out.println();

        Person[] people = {new Teacher("Olga", 15000), new Cleaner("Halya", 1000), new Student("Bohdan") };

        System.out.println();

        for(Person person : people) {
            person.print();

            if ((person instanceof Teacher) || (person instanceof Cleaner)) {
                ((Staff) person).salary_output();
            }

            System.out.println();
        }
    }
}

abstract class Staff extends Person {
    public double salary;

    public abstract void salary_output();
}

class Teacher extends Staff {
    private final String TYPE_PERSON = "teacher";

    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Created a " + TYPE_PERSON + ".");
    }

    public void print() {
        System.out.println("I am a " + this.name + ".");
    }

    public void salary_output() {
        System.out.println("Salary: " + salary);
    }
}

class Cleaner extends Staff {
    private final String TYPE_PERSON = "cleaner";

    public Cleaner(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Created a " + TYPE_PERSON + ".");
    }

    public void print() {
        System.out.println("I am a " + this.name + ".");
    }

    public void salary_output() {
        System.out.println("Salary: " + salary);
    }
}

class Student extends Person {
    private final String TYPE_PERSON = "student";

    public Student(String name) {
        this.name = name;
        System.out.println("Created a " + TYPE_PERSON + ".");
    }

    public void print() {
        System.out.println("I am a " + this.name + ".");
    }
}