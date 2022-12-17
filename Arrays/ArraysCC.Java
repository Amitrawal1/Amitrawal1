import java.util.*;
public class ArraysCC {
   
    public static int linearsearch(int numbers[],int key){
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key){
                return i;
            }
    
        }
    return -1;
    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1,6,64,85,5,15,24,12};
        int key = sc.nextInt();
        int index =linearsearch(numbers,key);
        if(index== -1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("key is at index: " + index + " ");
    
        }
    
       
    
    }

}

