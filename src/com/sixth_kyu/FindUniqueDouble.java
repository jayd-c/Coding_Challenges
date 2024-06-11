package com.sixth_kyu;

import java.util.*;
import java.util.stream.Collectors;

public class FindUniqueDouble {
    public static void main(String[] args) {
        double[] arr = {0d, 0d, 0.55, 0d, 0d };
        System.out.println(findUniq(arr));
    }
    public static double findUniq(double arr[]) {
       double temp = 0.0;

       List<Double> doubles = Arrays.stream(arr).boxed().toList();
       List<Double> distictList =  doubles.stream().distinct().toList();
       for(Double d: doubles) {
           if(Objects.equals(distictList.get(0), d)) {
               temp++;

           }
       }

        if(temp>1) {
            return distictList.get(1);
        } else {
            return distictList.get(0);
        }
    }

}
