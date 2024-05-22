package com.israr_zaslavskaya;

import java.sql.*;

public class JavaDBConnection {
    public void connectToDB(){
        String url = "jdbc:mysql://localhost:3306/classicmodels";

        String user = "root";
        String password = "root";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
//            String SelectSQL = "SELECT * FROM employees";
//            Statement stmt = connection.createStatement();
//            ResultSet result = stmt.executeQuery(SelectSQL);
//            while (result.next()) {
//                String EmployeeID = result.getString("employeeNumber");
//                String fname = result.getString("firstName");
//                String lname = result.getString("lastName");
//                System.out.println(EmployeeID + " | " + fname + "|" + lname);
//            }
//            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void implementActivity() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String user = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement stmt = conn.prepareStatement(SQLQueries.GET_EMPLOYEES_BY_OFFICE_CODE);
        stmt.setInt(1, 1);
        stmt.setInt(2, 4);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            String EmployeeID = rs.getString("employeeNumber");
            String fname = rs.getString("firstName");
            String lname = rs.getString("lastName");
            String officeCode = rs.getString("officeCode");
            System.out.println(EmployeeID + " | " + fname + "|" + lname + " | " + officeCode);
        }
    }

    public void getOrderDetails() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String user = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement stmt = conn.prepareStatement(SQLQueries.GET_ORDER_DETAILS);
        stmt.setInt(1, 10100);
        stmt.setInt(2, 10102);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            String orderID = rs.getString("orderNumber");
            String productCode = rs.getString("productCode");
            String quantityOrdered = rs.getString("quantityOrdered");
            String priceEach = rs.getString("priceEach");
            System.out.println(orderID + " | " + productCode + " | " + quantityOrdered + " | " + priceEach);
        }
    }

    public void updateExtensionNumber() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String user = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement stmt = conn.prepareStatement(SQLQueries.UPDATE_EXTENSION_NUMBER);
        stmt.setInt(1, 5698);
        stmt.setInt(2, 2);
        int numberLinesEffected = stmt.executeUpdate();
        System.out.println("Rows effected by update: " + numberLinesEffected);
    }

    public void selectLastNamesWithLength() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String user = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement stmt = conn.prepareStatement(SQLQueries.GET_LAST_NAME);
        stmt.setInt(1, 5);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            String EmployeeID = rs.getString("employeeNumber");
            String fname = rs.getString("firstName");
            String lname = rs.getString("lastName");
            String officeCode = rs.getString("officeCode");
            System.out.println(EmployeeID + " | " + fname + "|" + lname + " | " + officeCode);
        }
    }
}
