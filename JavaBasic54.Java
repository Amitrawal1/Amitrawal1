import java.util.*;
public class ArraysCC {
    public static void main(Strings args[]) {
        int marks[] = new int[100];
         
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); //Physics
        marks[1] = sc.nextInt(); // Math
        marks[2] = sc.nextInt(); // Chem
        marks[3] = sc.nextInt(); // Eng
         
        System.out.println("math: "+ marks[1]);
        System.out.println("Phys: " + marks[0]);
        System.out.println("Chem; " + marks[2]);
        System.out.println("Eng: " + marks[3]); 
        
    }
}
