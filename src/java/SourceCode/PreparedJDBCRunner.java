
package SourceCode;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class PreparedJDBCRunner {
    
    public static void main(String[] args) {
        
        ArrayList<Abonent> list = new ArrayList<Abonent>() {
            {
            add(new Abonent(3, 1111111, "Кожух Дмитрий"));
            add(new Abonent(4, 8888888, "Буйкевич Александр"));
            }
        };
        
        DataBaseHelper helper = null;
        
        PreparedStatement statement = null;
        
        try {
            helper = new DataBaseHelper();
            statement = helper.getPreparedStatement();
            for(Abonent abonent : list) {
                helper.insertAbonent(statement, abonent);
            } 
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(helper != null) 
            helper.closeStatement(statement);
        }
    }
}
