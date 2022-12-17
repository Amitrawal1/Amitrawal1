import java.util.*;
public class TrappedRainWater {
    public static int trappedWater(int height[]) {
        int n = height.length;
        // Calculate left max boundary - Array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1; i< n; i++){ 
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        // Calculate reight max boundary - Array
        int reightmax[] = new int[n];
        reightmax[n-1] = height[n-1];
        for(int i = n-2; i>= 0; i--){
            reightmax[i] = Math.max(height[i], reightmax[i+1]);
        }
        int trappedwater = 0;
        // loop
        for(int i =0; i<n ; i++){
            // WaterLevel = min(Leftmax bound, Reightmax bound)
            int waterlevel = Math.min(leftmax[i], reightmax[i]);
            // Traped Water =waterlevel -height
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;

    }
    
public static void main(String args[]){
    int height[] = {4,2,0,6,3,2,5};
    System.out.println("Trapped Water : " + trappedWater(height));

}
}
