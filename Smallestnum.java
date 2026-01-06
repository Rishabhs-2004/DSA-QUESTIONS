import java.util.*;
public class Smallestnum {

public static int getSmallest(int nums[]){
    int Smallest = Integer.MAX_VALUE;

    for(int i=0; i<nums.length; i++){
        if(Smallest > nums[i]){
            Smallest = nums[i];
        }
    }
    return Smallest;
}

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,45};
        System.out.println("Smallest value is : " +getSmallest(nums));
    }
}
