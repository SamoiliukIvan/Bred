
package service;

import businesslogic.Util;
import dao.HotelDao;
import entity.Hotel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HotelService extends Util implements HotelDao{

    Connection connection = getConnection();
    
    @Override
    public void create(Hotel entity) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO HOTEL ("
                + "ID, "
                + "NAME_RU, "
                + "NAME_EN, "
                + "ID_REGION, "
                + "SHORT_DESCRIPTION_RU, "
                + "SHORT_DESCRIPTION_EN, "
                + "FULL_DESCRIPTION_RU, "
                + "FULL_DESCRIPTION_EN, "
                + "STARS) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, entity.getId());
            preparedStatement.setString(2, entity.getNameRU());
            preparedStatement.setString(3, entity.getNameEN());
            preparedStatement.setLong(4, entity.getIdRegion());
            preparedStatement.setString(5, entity.getShortDescriptionRU());
            preparedStatement.setString(6, entity.getShortDescriptionEN());
            preparedStatement.setString(7, entity.getFullDescriptionRU());
            preparedStatement.setString(8, entity.getFullDescriptionEN());
            preparedStatement.setLong(9, entity.getStars());
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
    public List<Hotel> findAll() throws SQLException {
        ArrayList<Hotel> arrayList = new ArrayList<>();
        Statement statement = null;
        String sql = "SELECT "
                + "ID, "
                + "NAME_RU, "
                + "NAME_EN, "
                + "ID_REGION, "
                + "SHORT_DESCRIPTION_RU, "
                + "SHORT_DESCRIPTION_EN, "
                + "FULL_DESCRIPTION_RU, "
                + "FULL_DESCRIPTION_EN, "
                + "STARS FROM HOTEL";
        
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Hotel hotel = new Hotel();
                hotel.setId(resultSet.getLong("ID"));
                hotel.setNameRU(resultSet.getString("NAME_RU"));
                hotel.setNameEN(resultSet.getString("NAME_EN"));
                hotel.setIdRegion(resultSet.getLong("ID_REGION"));
                hotel.setShortDescriptionRU(resultSet.getString("SHORT_DESCRIPTION_RU"));
                hotel.setShortDescriptionEN(resultSet.getString("SHORT_DESCRIPTION_EN"));
                hotel.setFullDescriptionRU(resultSet.getString("FULL_DESCRIPTION_RU"));
                hotel.setFullDescriptionEN(resultSet.getString("FULL_DESCRIPTION_EN"));
                hotel.setStars(resultSet.getInt("STARS"));
                
                arrayList.add(hotel);
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
    public Hotel findEntityById(Long id) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "SELECT "
                + "ID, "
                + "NAME_RU, "
                + "NAME_EN, "
                + "ID_REGION, "
                + "SHORT_DESCRIPTION_RU, "
                + "SHORT_DESCRIPTION_EN, "
                + "FULL_DESCRIPTION_RU, "
                + "FULL_DESCRIPTION_EN, "
                + "STARS "
                + "FROM HOTEL WHERE ID=?";
        
        Hotel hotel = new Hotel();
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            hotel.setId(resultSet.getLong("ID"));
            hotel.setNameRU(resultSet.getString("NAME_RU"));
            hotel.setNameEN(resultSet.getString("NAME_EN"));
            hotel.setIdRegion(resultSet.getLong("ID_REGION"));
            hotel.setShortDescriptionRU(resultSet.getString("SHORT_DESCRIPTION_RU"));
            hotel.setShortDescriptionEN(resultSet.getString("SHORT_DESCRIPTION_EN"));
            hotel.setFullDescriptionRU(resultSet.getString("FULL_DESCRIPTION_RU"));
            hotel.setFullDescriptionEN(resultSet.getString("FULL_DESCRIPTION_EN"));
            hotel.setStars(resultSet.getInt("STARS"));
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
        return hotel;
    }

    @Override
    public void update(Hotel entity) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "UPDATE HOTEL SET"
                + "NAME_RU=?, "
                + "NAME_EN=?, "
                + "ID_REGION=?, "
                + "SHORT_DESCRIPTION_RU=?=?, "
                + "SHORT_DESCRIPTION_EN=?, "
                + "FULL_DESCRIPTION_RU=?, "
                + "FULL_DESCRIPTION_EN=?, "
                + "STARS FROM HOTEL WHERE ID=?";
                
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, entity.getNameRU());
            preparedStatement.setString(2, entity.getNameEN());
            preparedStatement.setLong(3,entity.getIdRegion());
            preparedStatement.setString(4, entity.getShortDescriptionRU());
            preparedStatement.setString(5, entity.getShortDescriptionEN());
            preparedStatement.setString(6, entity.getFullDescriptionRU());
            preparedStatement.setString(7, entity.getFullDescriptionEN());
            preparedStatement.setLong(8, entity.getStars());
            preparedStatement.setLong(9, entity.getId());
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
        String sql = "DELETE FROM HOTEL WHERE ID=?";
        
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
    public void delete(Hotel entity) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM HOTEL WHERE NAME=?";
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, entity.getNameRU());
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
