import java.util.*;
public class Reversearrays{
    public static void ReverseArrays(int numbers[],key){
        int first =0 ; int last = numbers.length -1;

        while(first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {2,3,5,6,12,18,19,23};
        int key = sc.nextInt();

        ReversArrays(numbers);
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        
    }
}