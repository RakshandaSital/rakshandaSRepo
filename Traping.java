package com.company;
import java.util.Scanner;
class Traping
{
    public static int trap(int[] bars)
    {
        int n = bars.length;
        int water = 0;

        int[] left = new int[n-1];
        left[0] = Integer.MIN_VALUE;

        for (int i = 1; i < n - 1; i++) {
            left[i] = Integer.max(left[i - 1], bars[i - 1]);
        }

        int right = Integer.MIN_VALUE;

        for (int i = n - 2; i >= 1; i--)
        {
            right = Integer.max(right, bars[i + 1]);

            if (Integer.min(left[i], right) > bars[i]) {
                water += Integer.min(left[i], right) - bars[i];
            }
        }

        return water;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n=sc.nextInt();
        int[] height = new int[20];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {
            height[i]=sc.nextInt();
        }

        System.out.print("The maximum amount of water that can be trapped is " + trap(height));
    }
}


