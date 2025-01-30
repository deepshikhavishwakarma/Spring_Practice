package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
@Qualifier("bubble")
public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int flag = 0;
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }

            }
            if(flag ==0){
                break;
            }
            System.out.println("Using Bubble sort : "+Arrays.toString(arr));
        }
    }
}
