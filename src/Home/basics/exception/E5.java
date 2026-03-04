package Home.basics.exception;

import java.io.IOException;

public class E5 {
    static void readfile() throws IOException{  //ducking(avoiding)
       throw new IOException("Trying to read the file.");
    }
    public static void main(String[] args){
        try{
            function_a();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
    static void function_a() throws IOException{
        function_b();
    }
    static void function_b() throws IOException{
        readfile();
    }
}
/*
⭐ For checked exceptions we always use a try-catch block or throws
⭐ the 'throws' keyword doesn't handle the exception
⭐ it only passess on the information to calliing method
⭐ the calling method has to handle the exception
⭐ The 'throws' keyword is used to 'method signature'
⭐ The 'Process' of passing on the information is called 'DUCKING(kind of avoiding)'
 */