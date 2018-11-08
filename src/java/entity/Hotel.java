
package entity;

import java.util.Objects;

public class Hotel {
    
    private Long id;
    private String nameRU;
    private String nameEN;
    private Long idRegion;
    private String shortDescriptionRU;
    private String shortDescriptionEN;
    private String fullDescriptionRU;
    private String fullDescriptionEN;
    private Stars countOfStars;

    public Hotel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Stars getCountOfStars() {
        return countOfStars;
    }

    public void setCountOfStars(Stars countOfStars) {
        this.countOfStars = countOfStars;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
        hash = 31 * hash + Objects.hashCode(this.nameRU);
        hash = 31 * hash + Objects.hashCode(this.nameEN);
        hash = 31 * hash + Objects.hashCode(this.idRegion);
        hash = 31 * hash + Objects.hashCode(this.shortDescriptionRU);
        hash = 31 * hash + Objects.hashCode(this.shortDescriptionEN);
        hash = 31 * hash + Objects.hashCode(this.fullDescriptionRU);
        hash = 31 * hash + Objects.hashCode(this.fullDescriptionEN);
        hash = 31 * hash + Objects.hashCode(this.countOfStars);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
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
        if (this.countOfStars != other.countOfStars) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hotel{" + "id=" + id + ", nameRU=" + nameRU + ", nameEN=" + nameEN + ", idRegion=" + idRegion + ", shortDescriptionRU=" + shortDescriptionRU + ", shortDescriptionEN=" + shortDescriptionEN + ", fullDescriptionRU=" + fullDescriptionRU + ", fullDescriptionEN=" + fullDescriptionEN + ", countOfStars=" + countOfStars + '}';
    }
    
    
    
}
