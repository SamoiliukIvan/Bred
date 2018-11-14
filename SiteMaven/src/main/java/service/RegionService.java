
package service;

import businesslogic.Util;
import dao.RegionDao;
import entity.Region;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RegionService extends Util implements RegionDao{
    
    Connection connection = getConnection();
    
    @Override
    public void create(Region entity) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO REGION ("
                + "ID, "
                + "NAME, "
                + "ID_COUNTRY, "
                + "VALUES (?,?,?)";
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, entity.getId());
            preparedStatement.setString(2, entity.getName());
            preparedStatement.setLong(3, entity.getIdCountry());
            preparedStatement.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
            if(preparedStatement != null) {
                preparedStatement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
    }

    @Override
    public List<Region> findAll() throws SQLException {
        ArrayList<Region> arrayList = new ArrayList<>();
        Statement statement = null;
        String sql = "SELECT "
                + "ID, "
                + "NAME, "
                + "ID_COUNTRY, "
                + "FROM REGION";
        
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Region region = new Region();
                region.setId(resultSet.getLong("ID"));
                region.setName(resultSet.getString("NAME"));
                region.setIdCountry(resultSet.getLong("ID_COUNTRY"));
                
                arrayList.add(region);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
            if(statement != null) {
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
        return arrayList;
    }

    @Override
    public Region findEntityById(Long id) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "SELECT "
                + "ID, "
                + "NAME, "
                + "ID_REGION, "
                + "FROM REGION WHERE ID=?";
        
        Region region = new Region();
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            region.setId(resultSet.getLong("ID"));
            region.setName(resultSet.getString("NAME"));
            region.setIdCountry(resultSet.getLong("ID_COUNTRY"));
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            if(preparedStatement != null) {
                preparedStatement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
        return region;
    }

    @Override
    public void update(Region entity) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "UPDATE REGION SET"
                + "NAME=?, "
                + "ID_COUNTRY=?, "
                + "FROM HOTEL WHERE ID=?";
                
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, entity.getName());
            preparedStatement.setLong(2, entity.getIdCountry());
            preparedStatement.setLong(3, entity.getId());
            preparedStatement.executeUpdate();            
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) {
                preparedStatement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
    }

    @Override
    public void delete(Long id) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM REGION WHERE ID=?";
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            if(preparedStatement != null) {
                preparedStatement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
    }

    @Override
    public void delete(Region entity) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM REGION WHERE NAME=?";
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, entity.getName());
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            if(preparedStatement != null) {
                preparedStatement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
    }  
}
