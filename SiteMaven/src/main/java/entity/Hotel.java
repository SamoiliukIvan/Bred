
package entity;

import dao.HotelDao;
import java.util.List;
import java.util.Objects;

public class Hotel extends Entity {
    
    private String nameRU;
    private String nameEN;
    private Long idRegion;
    private String shortDescriptionRU;
    private String shortDescriptionEN;
    private String fullDescriptionRU;
    private String fullDescriptionEN;
    private int stars;

    public Hotel() {
    }

    public Hotel(String nameRU, String nameEN, Long idRegion, String shortDescriptionRU, String shortDescriptionEN, String fullDescriptionRU, String fullDescriptionEN, int stars, Long id) {
        super(id);
        this.nameRU = nameRU;
        this.nameEN = nameEN;
        this.idRegion = idRegion;
        this.shortDescriptionRU = shortDescriptionRU;
        this.shortDescriptionEN = shortDescriptionEN;
        this.fullDescriptionRU = fullDescriptionRU;
        this.fullDescriptionEN = fullDescriptionEN;
        this.stars = stars;
    }

    public String getNameRU() {
        return nameRU;
    }

    public void setNameRU(String nameRU) {
        this.nameRU = nameRU;
    }

    public String getNameEN() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    public Long getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Long idRegion) {
        this.idRegion = idRegion;
    }

    public String getShortDescriptionRU() {
        return shortDescriptionRU;
    }

    public void setShortDescriptionRU(String shortDescriptionRU) {
        this.shortDescriptionRU = shortDescriptionRU;
    }

    public String getShortDescriptionEN() {
        return shortDescriptionEN;
    }

    public void setShortDescriptionEN(String shortDescriptionEN) {
        this.shortDescriptionEN = shortDescriptionEN;
    }

    public String getFullDescriptionRU() {
        return fullDescriptionRU;
    }

    public void setFullDescriptionRU(String fullDescriptionRU) {
        this.fullDescriptionRU = fullDescriptionRU;
    }

    public String getFullDescriptionEN() {
        return fullDescriptionEN;
    }

    public void setFullDescriptionEN(String fullDescriptionEN) {
        this.fullDescriptionEN = fullDescriptionEN;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nameRU);
        hash = 37 * hash + Objects.hashCode(this.nameEN);
        hash = 37 * hash + Objects.hashCode(this.idRegion);
        hash = 37 * hash + Objects.hashCode(this.shortDescriptionRU);
        hash = 37 * hash + Objects.hashCode(this.shortDescriptionEN);
        hash = 37 * hash + Objects.hashCode(this.fullDescriptionRU);
        hash = 37 * hash + Objects.hashCode(this.fullDescriptionEN);
        hash = 37 * hash + this.stars;
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
        final Hotel other = (Hotel) obj;
        if (!Objects.equals(this.nameRU, other.nameRU)) {
            return false;
        }
        if (!Objects.equals(this.nameEN, other.nameEN)) {
            return false;
        }
        if (!Objects.equals(this.idRegion, other.idRegion)) {
            return false;
        }
        if (!Objects.equals(this.shortDescriptionRU, other.shortDescriptionRU)) {
            return false;
        }
        if (!Objects.equals(this.shortDescriptionEN, other.shortDescriptionEN)) {
            return false;
        }
        if (!Objects.equals(this.fullDescriptionRU, other.fullDescriptionRU)) {
            return false;
        }
        if (!Objects.equals(this.fullDescriptionEN, other.fullDescriptionEN)) {
            return false;
        }
        if (this.stars != other.stars) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id" + getId() + "Hotel{" + "nameRU=" + nameRU + ", nameEN=" + nameEN + ", idRegion=" + idRegion + ", shortDescriptionRU=" + shortDescriptionRU + ", shortDescriptionEN=" + shortDescriptionEN + ", fullDescriptionRU=" + fullDescriptionRU + ", fullDescriptionEN=" + fullDescriptionEN + ", stars=" + stars + '}';
    }

}    