package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TravelBooking {
   private Transportation transportation;
  @Autowired
  @Qualifier("flight")
   public void Transportation(Transportation transportation){
       this.transportation = transportation;
   }
   public void executeBooking(String destination,double price){
       transportation.bookTrip(destination,price);
   }


}
