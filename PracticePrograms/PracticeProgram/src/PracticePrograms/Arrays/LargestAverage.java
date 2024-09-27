package PracticePrograms.Arrays;

import javax.swing.*;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LargestAverage {
    public static void main(String[] args) {
        String scores[][]= new String[][]{{"jerry","65"},{"bob","91"}, {"jerry","23"}, {"Eric","83"}};
        Optional<Integer> max=Arrays.stream(scores).flatMap(str-> Stream.of(str)).filter(str->{
            try{
                Integer.parseInt(str);
            }
            catch(Exception e){
                return false;
            }
            return true;
        }).map(str-> Integer.valueOf(str)).max((i,j)->i-j);
        System.out.println(max.get());
    }
}
