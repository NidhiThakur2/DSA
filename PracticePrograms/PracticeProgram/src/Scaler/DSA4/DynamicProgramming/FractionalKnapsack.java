package Scaler.DSA4.DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

class Knapsack{
    int weight;
    int value;
    double valuePerUnitWeight;
    Knapsack(int w, int v, double c){
        this.weight=w;
        this.value=v;
        this.valuePerUnitWeight=c;
    }
}

public class FractionalKnapsack {
    public static void main(String[] args) {
        int []value=new int[]{3};
        int[] weight=new int[]{20};
        int capacity=17;
        Knapsack []knapsackArray=new Knapsack[weight.length];
        for(int i=0;i<weight.length;i++){
            knapsackArray[i]=new Knapsack(weight[i],value[i],(double)value[i]/weight[i]);
        }
        Arrays.sort(knapsackArray, new Comparator<Knapsack>() {
            @Override
            public int compare(Knapsack o1, Knapsack o2) {
                if(o1.valuePerUnitWeight>o2.valuePerUnitWeight)
                    return -1;
                return 1;
            }
        });

        double totalValue=0;
        for(int i=0;i<weight.length;i++) {
            if(capacity<=knapsackArray[i].weight){
                totalValue=(double)totalValue+capacity*knapsackArray[i].valuePerUnitWeight;
                break;
            }else{
                capacity=capacity-knapsackArray[i].weight;
                totalValue=(double)totalValue+knapsackArray[i].value;
            }
        }
        System.out.println(totalValue*1000);
    }
}
