
package entity;

import java.util.Date;
import java.util.Objects;

class Tour {
    private Long id;
    private String name;
    private String shortDescriptionRU;
    private String shortDescriptionEN;
    private String fullDescriptionRU;
    private String fullDescriptionEN;
    private Date dateOfStart;
    private Date dateOfEnd;
    private Long idRegion;

    public Tour() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(Date dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public Date getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(Date dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public Long getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Long idRegion) {
        this.idRegion = idRegion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.shortDescriptionRU);
        hash = 89 * hash + Objects.hashCode(this.shortDescriptionEN);
        hash = 89 * hash + Objects.hashCode(this.fullDescriptionRU);
        hash = 89 * hash + Objects.hashCode(this.fullDescriptionEN);
        hash = 89 * hash + Objects.hashCode(this.dateOfStart);
        hash = 89 * hash + Objects.hashCode(this.dateOfEnd);
        hash = 89 * hash + Objects.hashCode(this.idRegion);
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
        final Tour other = (Tour) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
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
        if (!Objects.equals(this.dateOfStart, other.dateOfStart)) {
            return false;
        }
        if (!Objects.equals(this.dateOfEnd, other.dateOfEnd)) {
            return false;
        }
        if (!Objects.equals(this.idRegion, other.idRegion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tour{" + "id=" + id + ", name=" + name + ", shortDescriptionRU=" + shortDescriptionRU + ", shortDescriptionEN=" + shortDescriptionEN + ", fullDescriptionRU=" + fullDescriptionRU + ", fullDescriptionEN=" + fullDescriptionEN + ", dateOfStart=" + dateOfStart + ", dateOfEnd=" + dateOfEnd + ", idRegion=" + idRegion + '}';
    }
    
    
}
