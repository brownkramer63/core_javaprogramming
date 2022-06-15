package Replits;

import java.util.Scanner;

public class CubeMethod {

    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();

        cube(n);
    }

    public static void cube(int n) {
        int answer = n*n*n;
        System.out.println(answer);
    }
}
