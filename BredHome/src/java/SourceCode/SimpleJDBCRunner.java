
package SourceCode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

public class SimpleJDBCRunner {
    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:mysql://localhost:3306/testphones";
        
        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "ptktysq10G");
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");
        
        Connection cn = null;
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        
        try { // 1 блок
            cn = DriverManager.getConnection(url, prop);
            Statement st = null;
            try { // 2 блок
                st = cn.createStatement();
                ResultSet rs = null;
                try { // 3 блок
                    rs = st.executeQuery("SELECT * FROM phonebook");
                    ArrayList<Abonent> lst = new ArrayList<>();
                    while(rs.next()) {
                        int id = rs.getInt(1);
                        int phone = rs.getInt(3);
                        String name = rs.getString(2);
                        lst.add(new Abonent(id, phone, name));                       
                    }
                    if(lst.size() > 0) {
                        System.out.println(lst);
                    }
                    else {
                        System.out.println("Not found");
                    }
                } finally { // для 3-го блока try
                    /*
                    * Закрыть ResultSet, если он был открыт
                    * или ошибка произошла во время
                    * чтения из него данных
                    */
                    if(rs != null) {
                        rs.close();
                    } else {
                        System.err.println("ошибка во время чтения из БД");
                    }
                }
            } finally {
                /*
                * закрыть Statement, если он был открыт или ошибка
                * произошла во время создания Statement
                */
                if (st != null) { // для 2-го блока try
                    st.close();
                } else {
                    System.err.println("Statement не создан");
                }
            }
        } catch (SQLException e) { // для 1-го блока try 
            System.err.println("DB connection error:" + e);
            /*
            * вывод сообщения обо всех SQLException
            */
        } finally {
            /*
            * закрыть Connection, если он был открыт
            */
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.err.println("Connection close error: " + e);
                }
            }
        } 
    }
}

/*
1. Создаем строку url, в которой прописан путь к базе данных
2. Создаем переменную Properties prop, и кладем туда данные об свойствах БД - имя юзера, пароль, и т.д.
3. Создаем Connection cn = null;
4. Регистрируем JDBC драйвер с помощью статического метода класса DriverManager;
5. В 1-м блоке try соединяем cn с БД, передавая ей url и prop;
6. Тут же создаем переменную Statement st =  null;
7. Во 2-м блоке try присваиваем переменной st реальный Statement через st = cn.createStatement();
8. Тут же создаем переменную ResultSet rs = null;
9. В 3-м блоке передаем переменной rs указание выполненить SQL запрос через rs = st.executeQuery("SQL выражение");
10. Тут же создаем пустой список абонентов;
11. Тут же в цикле while (rs.next()) получаем данные, возвратившиеся в ответ на посланный SQL запрос и в списке абонентов создаем
    нового абонента, которому передаются в конструкторе полученные от SQL запроса параметры;
12  Тут же если список абонентов не пустой, печатаем его. Если пустой, выводим сообщение об ошибке.
13. В блоке finally если rs != null, закрываем rs. Иначе выводим ошибку.
14. В новом блоке finally, если st != null, закрываем его. Иначе выводим ошибку.
15. В еще одном блоке finally через try/catch пытаемся закрыть соединение cn.
*/

// для проверки