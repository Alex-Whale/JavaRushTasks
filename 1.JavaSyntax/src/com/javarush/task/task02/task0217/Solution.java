package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        int m1 = min (a, b);
        int m;
        if (m1 < c)
            m = m1;
        else
            m = c;
        if (d < m)
            m = d;

        return m;
    }

    public static int min(int a, int b) {
        int m;
        if (a < b)
            m = a;
        else m = b;

        return m;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}