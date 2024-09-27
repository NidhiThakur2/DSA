package PracticePrograms.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class LogPattern {
    public static void main(String[] args) {
        String lines[]=new String[]{
                "10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234",

                "10.0.0.2 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234",

                "10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234",
                "10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234"
        };
        List<String> frequentIPList=findFrequentIPs(lines);
        frequentIPList.stream().forEach(System.out::println);
    }

    private static List<String> findFrequentIPs(String[] lines) {
        Map<String,Integer> frequencyMap=new HashMap<>();
        List<String> frequentIps=new ArrayList<>();
        int max=1;
        for (String line:lines){
           String ip=line.split("-")[0];
           if(!frequencyMap.containsKey(ip)){
               frequencyMap.put(ip,1);
           }else{
               Integer value=frequencyMap.get(ip);
               value++;
               frequencyMap.put(ip,value);
               if(value>max)
                   max=value;
           }
        }
        for(Map.Entry<String,Integer> entry:frequencyMap.entrySet()){
            if(entry.getValue()>=max) {
                frequentIps.add(entry.getKey());
            }
        }
        return frequentIps;
    }
}
