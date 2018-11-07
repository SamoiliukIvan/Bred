
package Objects;

import java.util.Calendar;

public class Order {
    private int id;
    private Tour tour;
    private Calendar date;
    private int days_count;
    private String code;

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public int getDays_count() {
        return days_count;
    }

    public void setDays_count(int days_count) {
        this.days_count = days_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
}
