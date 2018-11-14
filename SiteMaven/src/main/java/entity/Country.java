
package entity;

import dao.CountryDao;
import java.util.List;
import java.util.Objects;

public class Country extends Entity {
    
    private String name;

    public Country() {
    }
    
    public Country(String name, Long id) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
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
        final Country other = (Country) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return " id: " + getId() + " Country{" + "name=" + name + '}';
    }
}
    
    