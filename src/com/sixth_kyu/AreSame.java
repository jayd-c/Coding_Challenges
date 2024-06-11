package com.sixth_kyu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have the "same" elements, with the same multiplicities (the multiplicity of a member is the number of times it appears). "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

 */
public class AreSame {
    public static void main(String[] args) {
        int[] a =  {121, 144, 19, 161, 19, 144, 19, 114};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a,b));

    }
    private static boolean comp (int[] a, int[] b) {
        int[] newArr = new int[a.length];
        int[] tempArrB = Arrays.stream(b).sorted().toArray();
        System.out.println(Arrays.toString(tempArrB));

        if(a==null  || b == null ) return false;
        else if (a.length != b.length) return  true;
        else if (a.length == 0 && b.length == 0) return true;
        else {
            for(int i = 0; i<a.length; i++) {
                newArr[i] = a[i] * a[i];
            }
            int[] tempArrA = Arrays.stream(newArr).sorted().toArray();
            System.out.println(Arrays.toString(tempArrA));
            return Arrays.equals(tempArrA, tempArrB);
        }

    }

    public static boolean comp1(int[] a, int[] b) {
        if( a == null || b == null ) {
            return false;

        } else if (a.length != b.length) {
            return false;
        } else if(a.length == 0 || b.length ==0) {
            return true;
        } else {
            List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
            List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());
            Collections.sort(aList);
            Collections.sort(bList);

            for(int i = 0; i<aList.size(); i++) {
                if(aList.get(i) !=  Math.sqrt(bList.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }
}
