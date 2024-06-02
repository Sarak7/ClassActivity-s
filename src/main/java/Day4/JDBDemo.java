package Day4;

import java.sql.*;

public class JDBDemo {
    public static void main(String[] args) throws SQLException {

        String query = "select * from jobs" ;

       try (Connection conn = ConnPoolConfig.getConnection();){
           Statement st = conn.createStatement();
           ResultSet rs = st.executeQuery(query);

           while (rs.next()){
               Jobs j = new Jobs(rs);
               System.out.println(j);
           }


       }
       }
    }

