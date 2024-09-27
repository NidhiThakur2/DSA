package ReasoningQuentions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketLabel {
    public static void main(String[] args) {
        List<String> apples=new ArrayList<String>();
        apples.add(new Apple().toString());
        apples.add(new Apple().toString());
        apples.add(new Apple().toString());
        apples.add(new Apple().toString());

        List<String> oranges=new ArrayList<String>();
        oranges.add(new Orange().toString());
        oranges.add(new Orange().toString());
        oranges.add(new Orange().toString());
        oranges.add(new Orange().toString());
        oranges.add(new Orange().toString());

        List<String> both =new ArrayList<String>();
        both.add(new Apple().toString());
        both.add(new Orange().toString());
        both.add(new Orange().toString());
        both.add(new Orange().toString());
        both.add(new Apple().toString());

        Map<String, List<String>> baskets= new HashMap<>();
        baskets.put("apples", oranges);
        baskets.put("oranges", both);
        baskets.put("both", apples);
        baskets.entrySet().stream().forEach(System.out::println);
        correctLabels("apples",baskets);
    }

    private static void correctLabels(String peekedBasketLabel, Map<String, List<String>> baskets) {
        List<String> fruitList=baskets.get(peekedBasketLabel);
        boolean isOrange=fruitList.stream().allMatch(f->f.toString().equals("Orange"));
        boolean isApple=fruitList.stream().allMatch(f->f.toString().equals("Apple"));
        if(isOrange){
            List<String> tempFruitList=baskets.get("oranges");
            baskets.put("oranges",fruitList);
            if(tempFruitList.stream().allMatch(f->f.toString().equals("Apple"))){
                baskets.put("both",baskets.get("apples"));
                baskets.put("apples",tempFruitList);
            }else{
                baskets.put("apples",baskets.get("both"));
                baskets.put("both",tempFruitList);
            }
        }else if(isApple){
            List<String> tempFruitList=baskets.get("apples");
            baskets.put("apples",fruitList);
            if(tempFruitList.stream().allMatch(f->f.toString().equals("Orange"))){
                baskets.put("both",baskets.get("oranges"));
                baskets.put("oranges",tempFruitList);
            }else{
                baskets.put("oranges",baskets.get("both"));
                baskets.put("both",tempFruitList);

            }
        }else{
            List<String> tempFruitList=baskets.get("both");
            baskets.put("both",fruitList);
            if(tempFruitList.stream().allMatch(f->f.toString().equals("Orange"))){
                baskets.put("apples",baskets.get("oranges"));
                baskets.put("oranges",tempFruitList);
            }else{
                baskets.put("oranges",baskets.get("apples"));
                baskets.put("apples",tempFruitList);
            }
        }
        baskets.entrySet().stream().forEach(System.out::println);
    }
}

class Fruit
{
}

class Apple extends Fruit
{
    @Override
    public String toString() {
        return "Apple";
    }
}

class Orange extends Fruit
{
    @Override
    public String toString() {
        return "Orange";
    }
}
