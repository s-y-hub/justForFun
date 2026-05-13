import java.util.Scanner; //somehow import only Scanner

public class name {
// still don't know what to make in java....
    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
       Scanner scanner = new Scanner(System.in);
       String name = scanner.nextLine();
       System.out.print("Hello, " + name);
       
       scanner.close();
    }
    
}
