import java.util.*;

class EqualSumSwap {

    //Naive
    static boolean isEqualSum(int[] a, int[] b) {
        int sumA = Arrays.stream(a).sum();
        int sumB = Arrays.stream(b).sum();

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++) {
                if (sumA - a[i] + b[j] == sumB - b[j] + a[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {4, 1, 2, 1, 1, 2};
        int[] b = {3, 6, 3, 3};
        
        System.out.println(isEqualSum(a, b));
    }
}