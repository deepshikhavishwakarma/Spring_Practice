package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SortingContext {
    private SortingStrategy strategy;

    @Autowired
@Qualifier("selection")
    public void setStrategy(SortingStrategy strategy){
        this.strategy=strategy;
    }
   public void executeSort(int[] numbers){
        strategy.sort(numbers);
    }
}
