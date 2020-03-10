package Logic;

import java.sql.*;

public class DBController {

    private String sqlQuery;
    Connection SQLConn;

    public Connection createConnection() {
        // URL to server: "jdbc:mysql://localhost:port/DB"; port default = 3306
        String dbURL = "";
        String dbUserName = "";
        String dbPassword = "";

        try {
            Class.forName("com.mysql.jc.jdbc.Driver");
            SQLConn = DriverManager.getConnection(dbURL, dbUserName, dbPassword);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return SQLConn;
    }

    public void enterSQLQuery(String query) throws SQLException {
        sqlQuery = query;
        Statement stm = SQLConn.createStatement();
        ResultSet resultSet = stm.executeQuery(sqlQuery);
        ResultSetMetaData RSMD = resultSet.getMetaData();
        int count = RSMD.getColumnCount();

        while (resultSet.next()) {
            for (int i = 1; i <= count; i++) {
                System.out.println(resultSet.getString(i));
            }
        }
    }

    public void queryHistory() {
        // save all Strings from sqLQuery into a local file
    }

}
