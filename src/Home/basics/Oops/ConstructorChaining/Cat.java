package Home.basics.Oops.ConstructorChaining;

public interface Cat {
    default void sound(){
        System.out.println("Meow!");
    }
}
interface Dog {
    default void sound(){
        System.out.println("Woof");
    }
}
class Cog implements Cat, Dog{
    public void sound(){
        System.out.println("Some new sound ");//if i want to print parent sound like cat or dog
        Dog.super.sound();                    // like this and also --> Cat.super.sound();
    }
}
class Demo{
    public static void main(String[] args) {
        Cog cog = new Cog();
        cog.sound();
    }
}