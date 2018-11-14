
package dao;

import entity.Entity;
import java.sql.SQLException;
import java.util.List;

public interface AbstractDao <K, T extends Entity>{
    
    // create
    
    public abstract void create(T entity) throws SQLException;
    
    // read
    
    public abstract List<T> findAll() throws SQLException;
    public abstract T findEntityById(K id)throws SQLException;
    
    // update
    
    public abstract void update(T entity) throws SQLException;
    
    // delete
    
    public abstract void delete(K id) throws SQLException;
    public abstract void delete(T entity) throws SQLException;
    
}
