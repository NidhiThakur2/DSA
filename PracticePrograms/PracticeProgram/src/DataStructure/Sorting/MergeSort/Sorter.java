package DataStructure.Sorting.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> array=new ArrayList<Integer>();
    ExecutorService service;

    public Sorter(List<Integer> array,ExecutorService service) {
        this.array = array;
        this.service=service;
    }
    @Override
    public List<Integer> call() throws Exception {
        if(array.size()<=1)
            return array;
        int mid=array.size()/2;
        List<Integer> leftArray=array.subList(0,mid);
        List<Integer> rightArray=array.subList(mid,array.size());

        Sorter leftSorter= new Sorter(leftArray,service);
        Sorter rightSorter= new Sorter(rightArray,service);

        Future<List<Integer>> leftSorted=service.submit(leftSorter);
        Future<List<Integer>> rightSorted=service.submit(rightSorter);

        return merge(leftSorted,rightSorted);
    }

    private List<Integer> merge(Future<List<Integer>> leftSorted, Future<List<Integer>> rightSorted) {
        List<Integer> sortedArray=new ArrayList<>();
        int first=0;
        int second=0;
        try {
            List<Integer> leftSortedArray=leftSorted.get();
            List<Integer> rightSortedArray=rightSorted.get();

            while(first<leftSortedArray.size() && second<rightSortedArray.size()){
                if(leftSortedArray.get(first)<rightSortedArray.get(second)){
                    sortedArray.add(leftSortedArray.get(first));
                    ++first;
                }else{
                    sortedArray.add(rightSortedArray.get(second));
                    ++second;
                }
            }
            while(first<leftSortedArray.size()){
                sortedArray.add(leftSortedArray.get(first));
                ++first;
            }
            while(second<rightSortedArray.size()){
                sortedArray.add(rightSortedArray.get(second));
                ++second;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        return sortedArray;
    }
}

