package Home.basics.Oops.inheritance.single;

public class Library {
    String name;
    int id;
    Library(String name, int id){
        this.name = name;
        this.id = id;
    }

}
class Book extends Library{
    double price;
    Book(String name , int id , double price){
        super(name, id);
        this.price = price;
    }
    void details(){
        System.out.println(name + " " + id + " " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("48 Laws Of Power" , 5 , 250);
        book.details();
    }
}
