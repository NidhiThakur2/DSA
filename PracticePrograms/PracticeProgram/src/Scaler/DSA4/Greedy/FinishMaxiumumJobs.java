package Scaler.DSA4.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Job{
    int start;
    int end;
    public Job(int start,int end){
        this.start=start;
        this.end=end;
    }
}

public class FinishMaxiumumJobs {
    public static void main(String[] args) {
        int[]A=new int[]{1, 5, 7, 1};
        int[]B=new int[]{7, 8, 8, 8};
        Job[] jobs=new Job[A.length];
        for(int i=0;i<A.length;i++){
            jobs[i]=new Job(A[i],B[i]);
        }
        ArrayList<Job> jobsList=(ArrayList<Job>) Arrays.stream(jobs).sorted((job1, job2)->job1.end-job2.end).collect(Collectors.toList());

        int ans=1,endTime=jobsList.get(0).end;
        for(int i=1;i<A.length;i++){
            if(jobsList.get(i).start>=endTime){
                ans++;
                endTime=jobsList.get(i).end;
            }
        }
        System.out.println(ans);
    }
}
