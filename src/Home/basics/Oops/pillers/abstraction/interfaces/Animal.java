package Home.basics.Oops.pillers.abstraction.interfaces;

public interface Animal {
    void run();
    void loves_to_eat();
}
class Rat implements Animal{
     //ℹ️interface have methods with completely empty bodies
    //❌interface don't have normal methods
    // ✅ℹso its exhibits 100% abstraction
    // ℹ️The methods are defined in the child class
    @Override
    public void run() {
        System.out.println("Rats run fast.");

    }

    @Override
    public void loves_to_eat() {
        System.out.println("Rats love to eat cheese");

    }

}
class Cat implements Animal{

    @Override
    public void run() {
        System.out.println("cat run very fast.");

    }

    @Override
    public void loves_to_eat() {
        System.out.println("cat love to eat rat");

    }
}
class interfaceDemo{
    public static void main(String[] args) {
        Rat rat = new Rat();
        rat.run();
        rat.loves_to_eat();
        Cat cat = new Cat();
        cat.run();
        cat.loves_to_eat();
    }
}

