package ProjetoFlightsInformation;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Fly {
    private String origin;
    private String destination;
    private String airline;
    private ZonedDateTime departure;
    private ZonedDateTime arrival;
    private BigDecimal price;
    private Long time;

    public Fly(String origin, String destination, String airline, String departure, String arrival, String price) {
        this.origin = origin;
        this.destination = destination;
        this.airline = airline;
        this.departure = ZonedDateTime.parse(departure,DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss '('zzz')'"));
        this.arrival = ZonedDateTime.parse(arrival,DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss '('zzz')'"));
        this.price = new BigDecimal(price);
        this.time = this.departure.until(this.arrival, ChronoUnit.HOURS);
    }
    public static String getLineCSV(Fly fligthsInformation) {
        return fligthsInformation.getOrigin() + ";" +
                fligthsInformation.getDestination() + ";" +
                fligthsInformation.getAirline() + ";" +
                fligthsInformation.getDeparture() + ";" +
                fligthsInformation.getArrival() + ";" +
                fligthsInformation.getPrice() + ";" +
                fligthsInformation.getTime();
    }
    public String getOrigin() {return origin;}
    public String getDestination() {return destination;}
    public String getAirline() {return airline;}
    public ZonedDateTime getDeparture() {return departure;}
    public ZonedDateTime getArrival() {return arrival;}
    public BigDecimal getPrice() {return price;}
    public Long getTime() {return time;}

    public void setOrigin(String origin) {this.origin = origin;}
    public void setDestination(String destination) {this.destination = destination;}
    public void setAirline(String airline) {this.airline = airline;}
    public void setDeparture(ZonedDateTime departure) {this.departure = departure;}
    public void setArrival(ZonedDateTime arrival) {this.arrival = arrival;}
    public void setPrice(BigDecimal price) {this.price = price;}
    public void setTime(Long time) {this.time = time;}

    @Override
    public String toString() {
        return "Fly{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", airline='" + airline + '\'' +
                ", departure=" + departure +
                ", arrival=" + arrival +
                ", price=" + price +
                ", time=" + time +
                '}';
    }
}