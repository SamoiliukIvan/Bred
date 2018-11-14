
package service;

import businesslogic.Util;
import dao.CountryDao;
import entity.Country;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CountryService extends Util implements CountryDao{

    Connection connection = getConnection();
    
    @Override
    public void create(Country entity) throws SQLException{
        PreparedStatement preparedStatement = null;
        
        String sql = "INSERT INTO COUNTRY (ID, NAME) VALUES(?, ?)";
        
        try {
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setLong(1, entity.getId());
            preparedStatement.setString(2, entity.getName());
            
            preparedStatement.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
            if(preparedStatement != null) {
                preparedStatement.close();
            }
            if(connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public List<Country> findAll() throws SQLException {
        ArrayList<Country> arrayList = new ArrayList<>();
        
        String sql = "SELECT ID, NAME FROM COUNTRY";
        
        Statement statement = null;
        
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()) {
                Country country = new Country();
                country.setId(resultSet.getLong("id"));
                country.setName(resultSet.getString("name"));
                
                arrayList.add(country);
            }            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(statement != null) {
                statement.close();
            }
            if(connection != null) {
                connection.close();
            }
        }
        return arrayList;
    }

    @Override
    public Country findEntityById(Long id) throws SQLException {
        
        PreparedStatement preparedStatement = null;
        String sql = "SELECT ID, NAME FROM COUNTRY WHERE ID=?";
        Country country = new Country();
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            country.setId(resultSet.getLong("id"));
            country.setName(resultSet.getString("name"));
            
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        } finally{
            if(preparedStatement != null){
                preparedStatement.close();
            }
            if(connection != null) {
                connection.close();
            }
        }
        return country;
    }

    @Override
    public void update(Country entity) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "UPDATE COUNTRY SET NAME=? FROM COUNTRY WHERE ID=?";
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, entity.getName());
            preparedStatement.setLong(2, entity.getId());
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        } finally{
            if(preparedStatement != null){
                preparedStatement.close();
            }
            if(connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public void delete(Long id) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM COUNTRY WHERE ID=id";
        
        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        } finally{
            if(preparedStatement != null){
                preparedStatement.close();
            }
            if(connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public void delete(Country entity) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM COUNTRY WHERE NAME=?";
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, entity.getName());
        }catch(SQLException e){
            e.printStackTrace();
        } finally{
            if(preparedStatement != null){
                preparedStatement.close();
            }
            if(connection != null) {
                connection.close();
            }
        }
    }
    
}
