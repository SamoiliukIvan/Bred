
package SourceCode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectorDB {
    public static Connection getConnection() throws SQLException {
        ResourceBundle resource = ResourceBundle.getBundle("testphones");
        String url = resource.getString("db.url");
        String user = resource.getString("db.user");
        String pass = resource.getString("db.password");
        return DriverManager.getConnection(url, user, pass);
        
        // в таком случае получение соединения с БД сводится к вызову
        // Connection cn = ConnectorDB.getConnection();
    }
}

// создаю класс без состояния - без полей
// создаю в нем единственный статический и общедоступный метод getConnection, который возвращает Connection и может выбрасить SQLException
// в этом методе создаю объект класса ResourceBundleвызвав статический метод класса ResourceBundle - getBundle("имя базы")
// тут же создаю строковую переменную url, в которую засовываю строку, полученную через resource.getString("имя базы.url")
// аналогичные строки для user и pass
// возвращаю соединение, вызвав стат. метод getConnection на классе DriverManager и передав в качестве параметров url, user и pass

// после этого можно создавать коннекшены путем вызова статического метода getConnection() на классе ConnectorDB

//для теста