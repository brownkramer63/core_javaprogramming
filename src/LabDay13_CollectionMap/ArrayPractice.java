package LabDay13_CollectionMap;

import lab12_oop_exceptions.RestraurantTask.Chef;
import lab12_oop_exceptions.RestraurantTask.Employee;
import lab12_oop_exceptions.RestraurantTask.Server;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] blah ={1,2,3,4,5};

        int[] nums= new int[4];
        nums[0]=120;
        nums[1]=102;
        nums[2]=101;
        nums[3]=110;

        System.out.println(Arrays.toString(nums));

        System.out.println("----------------------------");

        int[] scores = {1020,30,40,50};

        int[][] arr2d ={};
        int[][][] arr3d = {};

        System.out.println("----------------------");

        Employee[] employees={new Chef("Mike",34,'M',"45321","Chef",45000),new Server("emily",19,'F',"d5679","Server",30000)};

        System.out.println(Arrays.toString(employees));

        System.out.println("-------------------");
//collections
















    }
}
