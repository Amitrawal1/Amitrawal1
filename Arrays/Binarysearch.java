import java.util.*;
public class Binarysearch{
    public static int Binarys(int numbers[], int key){
        int start =0 ; int end = numbers.length -1;

        while(start <= end) {
            int mid = (start +end) / 2;
            // Comperision
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] <key){//right side
                start = mid+1;
            }else{// left side
                end = mid-1;

            }
            
        }
        return -1;
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {2,6,8,12,15,19,23,56};
        System.out.print("key: ");
        int key = sc.nextInt();
        

        System.out.println(" Index for key: " + Binarys(numbers,key));
        //System.out.print("NOT FOUND" + -1);

        
    }
}