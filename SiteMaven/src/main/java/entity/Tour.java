
package entity;

import dao.TourDao;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Tour extends Entity {
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

    public Tour(String name, String shortDescriptionRU, String shortDescriptionEN, String fullDescriptionRU, String fullDescriptionEN, Date dateOfStart, Date dateOfEnd, Long idRegion, Long id) {
        super(id);
        this.name = name;
        this.shortDescriptionRU = shortDescriptionRU;
        this.shortDescriptionEN = shortDescriptionEN;
        this.fullDescriptionRU = fullDescriptionRU;
        this.fullDescriptionEN = fullDescriptionEN;
        this.dateOfStart = dateOfStart;
        this.dateOfEnd = dateOfEnd;
        this.idRegion = idRegion;
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
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.shortDescriptionRU);
        hash = 97 * hash + Objects.hashCode(this.shortDescriptionEN);
        hash = 97 * hash + Objects.hashCode(this.fullDescriptionRU);
        hash = 97 * hash + Objects.hashCode(this.fullDescriptionEN);
        hash = 97 * hash + Objects.hashCode(this.dateOfStart);
        hash = 97 * hash + Objects.hashCode(this.dateOfEnd);
        hash = 97 * hash + Objects.hashCode(this.idRegion);
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
        return "id=" + getId() + " Tour{" + ", name=" + name + ", shortDescriptionRU=" + shortDescriptionRU + ", shortDescriptionEN=" + shortDescriptionEN + ", fullDescriptionRU=" + fullDescriptionRU + ", fullDescriptionEN=" + fullDescriptionEN + ", dateOfStart=" + dateOfStart + ", dateOfEnd=" + dateOfEnd + ", idRegion=" + idRegion + '}';
    }
}
