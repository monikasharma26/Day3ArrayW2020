package com.lambton;

public class ArrayCheck {
    public static void main(String[] args) {
        int a[];
        int a1;
        int[] b;
        int c[] = new int[5];
        c[0] = 4;
        c[1] = 2;
        c[2] = 41;
        c[3] = 21;
        c[4] = 3;
        a = new int[2];
        a[0] = 100;
        a[1] = 200;
        int Test[] = new int[10];
        int d[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int c1 = d.length;
        System.out.println(c1);

        for (int i = 0; i < c1; i++) {
            System.out.println(d[i]);
        }

        int[] x, y; ///both are array;
        int x1, b2[]; ///error

        int x3[], y3; // 1- array ;  2--int
        int[] x4, x5[];// x4--1d array ,//2 2d array
        // int [] x6,[] x7;// Error in syntax;

        for (int p : d) {
            System.out.println(p);
        }
    findArray();

    }

    public static void findArray() {
        //int d[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int test[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int sum = 0, avgValue = 0, miVa = 0, maValue = 0;

        int min = test[0];
        int max = test[0];
        int sum = test[0];
        for (int i = 0; i < test.length; i++) {
            System.out.println("Array: " + test[i]);
            if (test[i] < min) {
                min = test[i];
            }
            if (test[i] > max) {
                max = test[i];
            }
            sum = sum + test[i];
        }
        float avg = (float) sum / test.length;
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        int j = 0;
        System.out.print("Reverse Number : ");
        for (j = test.length - 1; j >= 0; j--) {
            System.out.print(test[j] + " ");
        }
        System.out.println();
        String[] Name = new String[]{"Monika Sharma"};
        // String[] p = new String[];
        for (int i = 0; i < Name.length; i++) {
            System.out.println(Name[i]);
        }
        String str1[];
        str1 = new String[10];
        str1[0] = "Canada";
        str1[1] = "India";
        str1[2] = "Nepal";
        str1[3] = "Toronto";
        str1[4] = "New Year";
        str1[5] = "Patel";
        str1[6] = "Raman";
        str1[7] = "Sharma";
        str1[8] = "SCp";
        str1[9] = "North York";
        StringBuilder sp = new StringBuilder();

        int c = str1.length - 1;
        int temp;
        String reverse[] = new String[10];
        for (int t = str1.length - 1; t >= 0; t--) {
            reverse[t] = str1[t];
            System.out.println(reverse[t]);
        }
     // int n= sizeof(str1)/sizeof(str1[0]);

      //  reverseArray(str1,0,);
        //for(int i=0;i<n;i++)
        //    System.out.println(str1[i]);
       for(int i=0;i<str1.length;i++)
        {
            System.out.println("Swap String", reverse(str1[i]));
        }

    }
    public String reverse(String s)
    {

        Char ch[] = s.toCharArray();
        int j = 1;
        String rev = "";
        if (ch.length % 2 == 0) {
            for (int i = 0; i < ch.length; i += 2) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                rev += ch[i];
                rev += ch[i + 1];
                j += 2;
            }
        }
    }


}



