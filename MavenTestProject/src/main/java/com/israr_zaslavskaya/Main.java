package com.israr_zaslavskaya;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        JavaDBConnection db = new JavaDBConnection();
        //db.connectToDB();
        //db.implementActivity();
        db.getOrderDetails();
        db.updateExtensionNumber();
        db.selectLastNamesWithLength();
    }

}