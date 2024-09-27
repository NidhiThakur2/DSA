package Scaler.Assignment30062023;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

class Interval_1{
    int start;
    int end;
    Interval_1(){
        start=0;
        end=0;
    }
    Interval_1(int s,int e){
        start=s;
        end=e;
    }
}
public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        ArrayList<Interval> intervals=new ArrayList<Interval>();
        Interval i1=new Interval(10, 10);
        Interval i2=new Interval(2,6);
        Interval i3=new Interval(8,9);
        Interval i4=new Interval(1,9);
       // Interval i4=new Interval(4,5);
        intervals.add(i1);
        intervals.add(i2);
        intervals.add(i3);
        intervals.add(i4);
        intervals=intervals.stream().sorted(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        }).collect(Collectors.toCollection(ArrayList<Interval>::new));
        intervals.stream().forEach(i-> System.out.println( i.start+" : " +i.end));
        ArrayList<Interval> result=mergeIntervals(intervals);
       // result.stream().forEach(i-> System.out.println( i.start+" : " +i.end));
    }

    private static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals) {
        ArrayList<Interval> result=new ArrayList<Interval>();
        int s=intervals.get(0).start;
        int e=intervals.get(0).end;
        for(int i=0;i<=intervals.size()-1;i++) {
            int is = intervals.get(i).start;
            int ie = intervals.get(i).end;
            if (is > e) {
                result.add(new Interval(s,e));
                s = is;
                e = ie;
            } else {
                s = Math.min(s, is);
                e = Math.max(e, ie);

            }
        }
        result.add(new Interval(s,e));
        return result;

    }
}
