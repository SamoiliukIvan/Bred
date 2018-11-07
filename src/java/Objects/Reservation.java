
package Objects;

import java.util.Calendar;

public class Reservation {
    
    private int id;
    private User fk_user;
    private Tour fk_tour;
    private Calendar date;
    private String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getFk_user() {
        return fk_user;
    }

    

    public Tour getFk_tour() {
        return fk_tour;
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
    private int days_count;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
    
}
