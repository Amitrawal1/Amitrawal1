import java.util.*;

public static void update(int janta[]){
    for(i=0; i<janta.length ; i++){
        janta[i] = janta[i]++;

    }
}
public class ArraysCCs {
    public static void main(String args[]){
        int janta[] = {96,64,96};

        update(janta);

        for(int i = 0; i<janta.length; i++){
            System.out.println(janta[i] + " ");
        }
        System.out.println();

    }
    


}