
package SourceCode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHelper {
    
    private final static String SQL_INSERT = 
            "INSERT INTO phonebook(idphonebook, lastname, phone) VALUES(?,?,?)";
    
    private Connection connect;
    
    public DataBaseHelper() throws SQLException {
        connect = ConnectorDB.getConnection();
    }
    
    public PreparedStatement getPreparedStatement() {
        PreparedStatement ps = null;
        try {
            ps = connect.prepareStatement(SQL_INSERT);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ps;
    }
    
    public boolean insertAbonent(PreparedStatement ps, Abonent ab) {
        boolean flag = false;
        try {
            ps.setInt(1, ab.getId());
            ps.setString(2, ab.getLastname());
            ps.setInt(3, ab.getPhone());
            ps.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
    public void closeStatement(PreparedStatement ps) {
        if(ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

// 1. создаю приватную финальную статическую строку, которая содержит SQL запрос без конкретных значений
// 2. объявляю приватное соединение connect;
// 3. в конструкторе передаю переменной connect конкретное значение, полученное с помощью статического метода getConnection
//    класса ConnectorDB;
// 4. создаю метод getPreparedStatement(), в котором объявляю переменную ps класса PreparedStatement = null;
// 5. тут же пытаюсь получить конкретное подготовленное утверждение, вызвав метод preparedStatement(SQL_INSERT) на перменной connect 
//    и присвоить его переменной ps. В случае неудачи печатаем стектрейс ошибки. В случае успеха - возвращаю ps;
// 6. создаю публичный метод insertAbonent(), возвращающий булевое значение, 
//    куда передаю в качестве параметров PreparedStatement ps и объект класса Abonent ab;
// 7. тут же создаю булевую переменную flag со значением false;
// 8. тут же пытаюсь присвоить переменной ps значения, полученные из объекта ab - id, lastname и phone;
// 9. тут же выполняю обновление переменной ps;
// 10. тут же преревожу flag в положение true;
// 11. тут же в случае неудачи печатаю стектрейс ошибки, в случае успеха - возвращаю булевую переменную flag;
// 12. создаю публичный метод closeStatement(), куда передаю в качестве параметра ps;
// 13. пытаюсь закрыть ps. В случае неудачи печатаю стектрейс ошибки.