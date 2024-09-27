package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstElementOfStream {

    public static void main(String[] args) {
        Integer[]A={1,2,3,4,5,5,6,7,7,8,9,10};
        //1. finding the first element of the stream
        int result=Stream.of(A).reduce((first,second)-> first).get();
        System.out.println(Stream.of(A).findFirst().get());
        System.out.println(result);
        //2. finding duplicate elements in the stream
        Set<Integer> duplicates=new HashSet<>();
        System.out.println(Stream.of(A).filter(i-> !duplicates.add(i)).collect(Collectors.toSet()));
        //3. count character in string
        String s="hello";
        char ch='l';
        long count = s.chars().filter(i-> i==ch).count();
        System.out.println(count);
        //4. Converting Map to Stream
        Map<Integer,String> map=new HashMap<>();
        map.put(1, "Geeks");
        map.put(2, "forGeeks");
        map.put(3, "A computer Portal");
        Stream<Map.Entry<Integer,String>> stream=convertToStream(map);
        System.out.println(Arrays.toString(stream.toArray()));
        //5. Converting List of String to List of Integer
        List<String> list=Arrays.asList("1","2","3","4","5");
        List<Integer> intList=list.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(intList);
        //6. Sum of List
        System.out.println(Arrays.stream(A).reduce(0,(x,y)->x+y));
        //7. Sum of List using filters with some condition
        System.out.println(Arrays.stream(A).filter(i->i>=5).mapToInt(i->i).sum());



    }

    private static Stream<Map.Entry<Integer, String>> convertToStream(Map<Integer, String> map) {
        return map.entrySet().stream();
    }


}
