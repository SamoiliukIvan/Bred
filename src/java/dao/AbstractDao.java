
package dao;

import entity.Entity;
import java.util.List;

public interface AbstractDao <K, T extends Entity>{
    
    // create
    
    public abstract void create(T entity);
    
    // read
    
    public abstract List<T> findAll();
    public abstract T findEntityById(K id);
    
    // update
    
    public abstract void update(T entity);
    
    // delete
    
    public abstract void delete(K id);
    public abstract void delete(T entity);
    
}
