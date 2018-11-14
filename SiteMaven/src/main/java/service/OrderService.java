
package service;

import businesslogic.Util;
import dao.OrderDao;
import entity.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrderService extends Util implements OrderDao {

    Connection connection  = getConnection();
    
    @Override
    public void create(Order entity) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO ORDER ("
                + "ID, "
                + "CODE_OF_ORDER, "
                + "ID_TOUR, "
                + "FROM, "
                + "COUNT_OF_DAYS, "
                + "ID_USER)"
                + "VALUES (?,?,?,?,?,?)";
        
                try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, entity.getId());
            preparedStatement.setString(2, entity.getCodeOfOrder());
            preparedStatement.setLong(3, entity.getIdTour());
            preparedStatement.setDate(4, entity.getFrom());
            preparedStatement.setInt(5, entity.getCountOfdays());
            preparedStatement.setLong(6, entity.getIdUser());           
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
    public List<Order> findAll() throws SQLException {
        ArrayList<Order> arrayList = new ArrayList<>();
        Statement statement = null;
        String sql = "SELECT "
                + "ID, "
                + "CODE_OF_ORDER, "
                + "ID_TOUR, "
                + "FROM, "
                + "COUNT_OF_DAYS, "
                + "ID_USER)"
                + "FROM ORDER";
        
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Order order = new Order();
                order.setId(resultSet.getLong("ID"));
                order.setCodeOfOrder(resultSet.getString("CODE_OF_ORDER"));
                order.setIdTour(resultSet.getLong("ID_TOUR"));
                order.setFrom(resultSet.getDate("FROM"));
                order.setCountOfdays(resultSet.getInt("COUNT_OF_DAYS"));
                order.setIdUser(resultSet.getLong("ID_USER"));
                
                arrayList.add(order);
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
    public Order findEntityById(Long id) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "SELECT "
                + "ID, "
                + "CODE_OF_ORDER, "
                + "ID_TOUR, "
                + "FROM, "
                + "COUNT_OF_DAYS, "
                + "ID_USER)"
                + "FROM ORDER WHERE ID=?";
        
        Order order = new Order();
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            
            ResultSet resultSet = preparedStatement.executeQuery();
           
            order.setId(resultSet.getLong("ID"));
            order.setCodeOfOrder(resultSet.getString("CODE_OF_ORDER"));
            order.setIdTour(resultSet.getLong("ID_TOUR"));
            order.setFrom(resultSet.getDate("FROM"));
            order.setCountOfdays(resultSet.getInt("COUNT_OF_DAYS"));
            order.setIdUser(resultSet.getLong("ID_USER"));
            
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
        return order;
    }

    @Override
    public void update(Order entity) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "UPDATE ORDER SET"
                + "CODE_OF_ORDER=?, "
                + "ID_TOUR=?, "
                + "FROM=?, "
                + "COUNT_OF_DAYS=?, "
                + "ID_USER=?)"
                + "FROM ORDER WHERE ID=?";
                
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, entity.getCodeOfOrder());
            preparedStatement.setLong(2, entity.getIdTour());
            preparedStatement.setDate(3,entity.getFrom());
            preparedStatement.setInt(4, entity.getCountOfdays());
            preparedStatement.setLong(5, entity.getIdUser());
            preparedStatement.setLong(6, entity.getId());
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
        String sql = "DELETE FROM ORDER WHERE ID=?";
        
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
    public void delete(Order entity) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM ORDER WHERE CODE_OF_ORDER=?";
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, entity.getCodeOfOrder());
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
