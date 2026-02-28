import java.util.Arrays;

public class passing {
    public static void main(String[] args) {

        int[] nums = {23 , 43 , 21 ,32};
        change(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    
    static void change (int[] arr){
        arr[0]=12;
    }
}
