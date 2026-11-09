// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
  
        for (int i = 0; i < 6; i++) {

            
            for (int j = 0; j < 6 - i -1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }            System.out.println();
        }

        int wysokoscPnia = 2;
        for (int i = 0; i < wysokoscPnia; i++) {
            for (int j = 0; j < 6 - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
    

      
      
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}