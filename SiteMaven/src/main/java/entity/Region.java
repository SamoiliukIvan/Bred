
package entity;

import dao.RegionDao;
import java.util.List;
import java.util.Objects;

public class Region extends Entity {
    
    private String name;
    private Long idCountry;

    public Region() {
    }

    public Region(String name, Long idCountry, Long id) {
        super(id);
        this.name = name;
        this.idCountry = idCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Long idCountry) {
        this.idCountry = idCountry;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.idCountry);
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
        final Region other = (Region) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.idCountry, other.idCountry)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "id=" + getId() + " Region{" + ", name=" + name + ", idCountry=" + idCountry + '}';
    }

}