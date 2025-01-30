package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
@Component
@Qualifier("selection")
public class Selection implements SortingStrategy {
    @Override
    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;
            // Find the minimum element in the unsorted portion of the array
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
        System.out.println(Arrays.toString(numbers));

    }

}


