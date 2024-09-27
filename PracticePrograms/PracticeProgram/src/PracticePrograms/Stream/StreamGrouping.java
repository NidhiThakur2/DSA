package PracticePrograms.Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
interface A {
    default void foo() { System.out.println("hello from A"); }
}
interface B {
    default void foo() { System.out.println("hello from B"); }
}
class C implements A, B{
    public int temp(int a,int...b){
        return b[1];
    }
    public int temp(int a, int c){
        return 1;
    }

    @Override
    public void foo() {
        A.super.foo();
    }
}
public class StreamGrouping {
    public static void main(String[] args) {
        Integer arr[]=new Integer[]{1, 3, 5, 1, 4, 5, 1, 7};
        List<String> strList=new ArrayList<>();
        strList.add("nidhi");
        strList.add("Nidhi");
        strList.add("Thkaur");
        Map<String,Integer> employee=new HashMap<>();
        employee.put("Nidhi",3000);
        employee.put("Thakur",4000);
        employee.put("Arjaria",5000);
      //  Map<Integer,Integer> result= Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        Map<String,Long> map=strList.stream().map(str->str.toLowerCase())
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.entrySet().stream().forEach(System.out::println);
        Integer sum=employee.entrySet().stream().map(emp->emp.getValue()).reduce(0,(x,y)->x+y);
        System.out.println(employee.entrySet().stream().map(emp->emp.getValue()).min((x,y)->x-y));
        int salarySum=employee.entrySet().stream().map(emp->emp.getValue()).reduce(0,(x,y)->x+y);
        System.out.println("salarySum"+salarySum);
        //
        // Arrays.asList(arr).stream().sorted().forEach(i-> System.out.println(i));

        String s = "My\\s aaab\\s is\\s aaab\\s name";
        String s1 = s.replace("\\s", "c");
        String s2 = s.replaceAll("\\s", "c");
        System.out.println(s1);
        System.out.println(s2);
        //C c = new C();
        //c.foo();

        //System.out.println(c.temp(1,2,3));

        /*String str=null;
        System.out.println(Optional.ofNullable(str));
        System.out.println(Optional.of(str).orElseGet(() ->  "temp"));
        System.out.println(Optional.of(str).orElse("temp"));*/
        //Map<C,String> treeMap=new HashMap<>();
        //treeMap.put(new C(),"1");
        //treeMap.put(new C(),"2");
        //System.out.println(treeMap.size());



    }


}
