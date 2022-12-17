import java.util.*;

public static void linearsearch(int numbers[],int key){
    for(i= 0; i<numbers.length; i++) {
        if(numbers == key){
            return i;
        }

    }
return -1;

}
public static void main(Strin args[]){
    int numbers[] = {1,6,64,85,5,15,24,12};
    int key = 15;
    int index =linearsearch(numbers,key);
    if(index== -1){
        System.out.println("NOT FOUND");
    }
    else{
        System.out.println("key is at index" + index);

    }

   

}