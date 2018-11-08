
package entity;

import java.util.Date;
import java.util.Objects;

public class Order {
    private Long id;
    private String codeOfOrder;
    private Tour idTour;
    private Date from;
    private int countOfdays;
    private User idUser;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeOfOrder() {
        return codeOfOrder;
    }

    public void setCodeOfOrder(String codeOfOrder) {
        this.codeOfOrder = codeOfOrder;
    }

    public Tour getIdTour() {
        return idTour;
    }

    public void setIdTour(Tour idTour) {
        this.idTour = idTour;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public int getCountOfdays() {
        return countOfdays;
    }

    public void setCountOfdays(int countOfdays) {
        this.countOfdays = countOfdays;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.id);
        hash = 73 * hash + Objects.hashCode(this.codeOfOrder);
        hash = 73 * hash + Objects.hashCode(this.idTour);
        hash = 73 * hash + Objects.hashCode(this.from);
        hash = 73 * hash + this.countOfdays;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.codeOfOrder, other.codeOfOrder)) {
            return false;
        }
        if (!Objects.equals(this.idTour, other.idTour)) {
            return false;
        }
        if (!Objects.equals(this.from, other.from)) {
            return false;
        }
        if (this.countOfdays != other.countOfdays) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", codeOfOrder=" + codeOfOrder + ", idTour=" + idTour + ", from=" + from + ", countOfdays=" + countOfdays + '}';
    }
    
    
}
