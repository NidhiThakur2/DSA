package PracticePrograms.Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int nums[]=new int []{7,10,4,3,20,15};
        PriorityQueue<Integer> mh=new PriorityQueue<>();
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        int k=3;
        int KthMin=0;
        int KthMax=0;
        for(int i=0;i<nums.length;i++){
            mh.add(nums[i]);
            maxheap.add(nums[i]);
        }
        for(int i=1;i<=k;i++){
            if(!mh.isEmpty()) {
                KthMin=mh.poll();
                KthMax=maxheap.poll();
            }
        }
        System.out.println(mh.size());
        System.out.println(KthMin);
        System.out.println(KthMax);
    }
}

