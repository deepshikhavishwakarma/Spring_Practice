package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flight {
    @Value("${flight.number}")
    String flightNumber;
    @Value("${flight.departure}")
    String departureCity;
    @Value("${flight.destination}")
    String destinationCity;
    @Value("${flight.price}")
    double ticketPrice;

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", destinationCity='" + destinationCity + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
