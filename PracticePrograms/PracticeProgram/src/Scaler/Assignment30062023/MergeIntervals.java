package Scaler.Assignment30062023;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

class Interval{
    int start;
    int end;
    Interval(){
        start=0;
        end=0;
    }
    Interval(int s,int e){
        start=s;
        end=e;
    }
}

public class MergeIntervals {
    public static void main(String[] args) {
        ArrayList<Interval> intervals=new ArrayList<Interval>();
        Interval i1=new Interval(1,3);
        Interval i2=new Interval(6,9);
        intervals.add(i1);
        intervals.add(i2);
        ArrayList<Interval> result=mergeIntervals(intervals,new Interval(2,5));
        result.stream().forEach(i-> System.out.println(i.start +" : "+i.end));
    }

    private static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result=new ArrayList<Interval>();
        for(int i=0;i<intervals.size();i++){
            Interval temp=intervals.get(i);
            if(newInterval.start>temp.end){//non overlapping temp start is smaller
                result.add(temp);
            }else if(temp.start>newInterval.end){//non overlapping newInterval start is smaller
                result.add(newInterval);
                for(int j=i;j<intervals.size();j++){
                    result.add(intervals.get(j));
                }
                return result;
            }
            else{ //overlapping updating newInterval start and end
                if(temp.start<newInterval.start)
                    newInterval.start=temp.start;
                if(temp.end>newInterval.end)
                    newInterval.end=temp.end;
            }
        }
        result.add(newInterval);
        return result;
    }
}
