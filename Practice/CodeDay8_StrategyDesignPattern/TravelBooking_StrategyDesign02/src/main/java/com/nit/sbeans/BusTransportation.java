package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bus")
public class BusTransportation implements Transportation{
    @Override
    public void bookTrip(String destination, double price) {
        System.out.println("Booked a trip to "+destination+" by Bus for "+price+".");
    }
}
