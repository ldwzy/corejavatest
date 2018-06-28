import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;

public class Test_Main{
    public static int m=2 ;
    
    public static void main(String[] args) throws IOException {
        int i = 0b100_00_000_000;
        m = 12;
        String s = "first blood.";
        int[] codePoints = s.codePoints().toArray();
        System.out.print(" "+codePoints[0]); 
        System.out.print(" "+codePoints[1]);  
        System.out.print(" "+codePoints[2]); 
        System.out.print(" "+codePoints[3]); 
        System.out.print(" "+codePoints[4]);         
        /*
        System.out.println(s.substring(2, 5));
        System.out.println(String.join(" rst ", "a", "get", "est.my"));
        System.out.println(Math.pow(2,5));
        System.out.println(Math.floorMod(25,11));
        System.out.println("we will not go."+i);
        System.out.printf("we will not go. %d\n", m);
        Scanner in = new Scanner(System.in);
        System.out.println("what's your name?");
        String name = in.nextLine();
        System.out.println(name);
        System.out.println("what's your first name?");
        String firstName = in.next();
        System.out.println("first name:"+firstName);
        System.out.println("how old are you?");
        int age = in.nextInt();
        System.out.println(age);
        */
        /*
        Console cons = System.console();
        String username = cons.readLine("User name: ");
        System.out.println(username);
        char[] passwd = cons.readPassword("Password: ");
        System.out.println(passwd);
        */
        System.out.println(LocalDate.now());
        //Scanner in = new Scanner(Paths.get("myfile.txt"), "UTF-8");
        Test_Main t = new Test_Main();
        
        
    }
}