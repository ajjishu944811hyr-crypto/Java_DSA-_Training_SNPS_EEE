package Home.basics.Oops.Multiple;

public interface Icecream1{
    String icecream1();
}
interface Icecream2 {
    String icecream2();
}
interface Icecream3 {
    String icecream3();
}
class Icecreams implements Icecream1,Icecream2,Icecream3{

    @Override
    public String icecream1() {

        return "ButterScocth";
    }

    @Override
    public String icecream2() {
        return "Vanilla";
    }

    @Override
    public String icecream3() {
        return "BlueBerry";
    }

    public static void main(String[] args) {
        Icecreams icecream = new Icecreams();
        System.out.println("Customer likes: " + icecream.icecream1());
        System.out.println("Customer likes: " + icecream.icecream2());
        System.out.println("Customer likes: " + icecream.icecream3());
    }
}
