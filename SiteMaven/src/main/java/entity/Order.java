
package entity;

import dao.OrderDao;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

public class Order extends Entity {
    
    private String codeOfOrder;
    private Long idTour;
    private Date from;
    private int countOfdays;
    private Long idUser;

    public Order() {
    }

    public Order(String codeOfOrder, Long idTour, Date from, int countOfdays, Long idUser, Long id) {
        super(id);
        this.codeOfOrder = codeOfOrder;
        this.idTour = idTour;
        this.from = from;
        this.countOfdays = countOfdays;
        this.idUser = idUser;
    }

    public String getCodeOfOrder() {
        return codeOfOrder;
    }

    public void setCodeOfOrder(String codeOfOrder) {
        this.codeOfOrder = codeOfOrder;
    }

    public Long getIdTour() {
        return idTour;
    }

    public void setIdTour(Long idTour) {
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

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.codeOfOrder);
        hash = 79 * hash + Objects.hashCode(this.idTour);
        hash = 79 * hash + Objects.hashCode(this.from);
        hash = 79 * hash + this.countOfdays;
        hash = 79 * hash + Objects.hashCode(this.idUser);
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
        if (!Objects.equals(this.idUser, other.idUser)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id: " + getId() + " Order{" + "codeOfOrder=" + codeOfOrder + ", idTour=" + idTour + ", from=" + from + ", countOfdays=" + countOfdays + ", idUser=" + idUser + '}';
    }

}