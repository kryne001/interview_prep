import java.util.*;

public class App {

    public int findKthLargest(int[] nums, int k) {

        k = nums.length - k;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            final int j = partition(nums, lo, hi);
            if(j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                break;
            }
        }
        return nums[k];
    }

    private int partition(int[] a, int lo, int hi) {

        int i = lo;
        int j = hi + 1;
        while(true) {
            while(i < hi && less(a[++i], a[lo]));
            while(j > lo && less(a[lo], a[--j]));
            if(i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private void exch(int[] a, int i, int j) {
        final int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private boolean less(int v, int w) {
        return v < w;
    }
    public static void main(String[] args) throws Exception {
        // PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2) -> n1 - n2);
        // pq.add(10);
        // System.out.println(pq);
        // pq.add(15);
        // System.out.println(pq);
        // pq.add(12);
        // System.out.println(pq);
        // pq.add(11);
        // System.out.println(pq);
        // System.out.println(pq.poll());
        // System.out.println(pq);

        App myApp = new App();
        int nums[] = {3,2,1,5,6,4};
        System.out.println("answer is: " + myApp.findKthLargest(nums, 2));
        // for (int i : nums)
        // {
        //     pq.add(i);
        //     System.out.println(pq);
        //     if (pq.size() > 2) 
        //     {
        //         System.out.println(pq.poll());
        //         System.out.println(pq);
        //     }
        // }


    }
}
