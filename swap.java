import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int [] a ={ 1,3,2,5};
        int index1=1;
        int index2=3;
        swap( a, index1, index2);
        System.out.println(Arrays.toString(a));

    }

    static void swap(int a[], int index1, int index2){
        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;
    }
    
}
