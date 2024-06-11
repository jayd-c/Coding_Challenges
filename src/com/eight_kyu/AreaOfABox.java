package com.eight_kyu;

public class AreaOfABox {

    public static int[] getSize(int w,int h,int d) {
        int area = 2*(w*h + d*w + h*d);
        int volume = w*h*d;
        return new int[] {area, volume};
    }
}
