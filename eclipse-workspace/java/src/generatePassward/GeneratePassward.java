
package PassWordGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class PassWordGenerator {
    static int size;
    //question No.1
    static List<Character> word = new ArrayList<Character>();
    //{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 's', 'y', 'z'};
    
    static int min = 3;
    static int max = 9;
    public static void main(String[] args) {
        String password = "";
        Scanner scanner = new Scanner(System.in);
        //question No.3
        int size = generateRandomNumber(min, max);
        lowerCase();
        UpperCase();
        Number();
        
        
        //question No.2
        for (int i = 0; i <= size; i++) {
            
            password += word.get(generateRandomNumber(0, word.size() - 1));
        }
        
        System.out.println(password);
        
    }
    
    public static void lowerCase() {
        for (int i = 'a'; i <= 'z'; i++) {
            word.add((char) i);
        } 
    }
    
    public static void UpperCase() {
        for (int i = 'A'; i <= 'Z'; i++) {
            word.add((char) i);
        } 
    }
    
    public static void Number() {
        for (int i = '0'; i <= '9'; i++) {
            word.add((char) i);
        } 
    }
    
//  public static void Number() {
//      for (int i = '0'; i <= '9'; i++) {
//          word.add((char) i);
//      } 
//  }
    
    
    public static int generateRandomNumber (int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
