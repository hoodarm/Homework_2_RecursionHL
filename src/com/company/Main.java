package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(recursiveF(5));
        System.out.println(nonRecursiveF(5));
    }

    static int recursiveF(int n)
    {
        if (n==0)
            return 1;
        return recursiveF(n-1)*n;
    }

    static int nonRecursiveF(int n)
    {   int result = 1;
        if (n==0)
            return 1;
        for (int i = n; i>=2; i--)
        {
            result = result*i;
        }
        return result;
    }
}
