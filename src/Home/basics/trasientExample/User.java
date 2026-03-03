package Home.basics.trasientExample;
//import javax.imageio.IOException;
import java.io.*;
//To achieve  srialization we use interface serialization

public class User implements Serializable {
    String username = "Saurav";
    transient String password = "12345";
}
class TransientDemo{
    public static void main(String[] args) throws Exception {
        User user = new User();
        ObjectOutputStream oos =
                new ObjectOutputStream
                        (new FileOutputStream("user.ser"));

        oos.writeObject(user);
        oos.close();
        ObjectInputStream ois =
                new ObjectInputStream
                        (new FileInputStream("User.ser"));
        User user1 = (User) ois.readObject();
        oos.close();

        System.out.println(user1.username);
        System.out.println(user1.password);
    }

}
