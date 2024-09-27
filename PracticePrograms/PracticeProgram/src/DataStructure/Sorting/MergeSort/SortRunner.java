package DataStructure.Sorting.MergeSort;

import PracticePrograms.A;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SortRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> array=List.of(2,5,3,10,32,1);
        ExecutorService executor= Executors.newCachedThreadPool();
        Sorter sorter=new Sorter(array,executor);
        Future<List<Integer>> sortedList=executor.submit(sorter);
        System.out.println(sortedList.get());
    }
}
