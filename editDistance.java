package com.company;

import java.util.Scanner;

class editDistance {

    static int min(int a, int b, int c)

    {

        if (a <= b && a <= c)

            return a;

        if (b <= a && b <= c)

            return b;

        else

            return c;

    }


    static int editDist(String str1, String str2, int x, int y)

    {

        if (x == 0)

            return y;

        if (y == 0)

            return x;

        if (str1.charAt(x - 1) == str2.charAt(y - 1))

            return editDist(str1, str2, x - 1, y - 1);


        return 1

                + min(editDist(str1, str2, x, y - 1),

                editDist(str1, str2, x - 1, y),

                editDist(str1, str2, x - 1, y - 1)

        );

    }

    public static void main(String args[])

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String str1 = sc.next();
        System.out.println("enter Second string");
        String str2 = sc.next();

        System.out.println(editDist(str1, str2, str1.length(), str2.length()));

    }
}