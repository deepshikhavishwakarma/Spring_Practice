package com.nit.sbeans;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Employee {
    String name;
    String department;

    public Employee() {
    }

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void displayEmployeeInfo(){
        System.out.println("Employee Name : "+this.getName());
        System.out.println("Employee Department : "+this.getDepartment());
        Employee.solveArrayProb();
    }

    private static void solveArrayProb() {
        int ind = 0;
//         int[] arr={10,11,12};
//        int[] index = {1,0,2};
        int[] arr={50,40,70,60,90};
        int[] index = {3,0,4,1,2};
        int[] newArr = new int[arr.length];
        for (int i=0;i< arr.length;i++){
            newArr[index[i]] = arr[i] ;
        }
        System.out.println("Solved Array"+Arrays.toString(newArr));
        Arrays.sort(index);
        System.out.println("Index : "+Arrays.toString(index));


        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length-1;j++){
                if(index[i]>index[j]){
                    int temp = index[i];
                    index[i]=index[j];
                    index[j]=temp;

                    int temp1=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(index));
    }
}
