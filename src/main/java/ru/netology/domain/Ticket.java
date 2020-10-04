package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Ticket implements Comparable {
    int id;
    int cost;
    String startAirport;
    String endAirport;
    int travelTime;

    @Override
    public int compareTo(Object o) {
        Ticket t = (Ticket) o;
        return cost - t.cost;
    }

    public boolean matches (String from, String to) {
        return (this.startAirport.equalsIgnoreCase(from)) && (this.endAirport.equalsIgnoreCase(to));
    }
}
