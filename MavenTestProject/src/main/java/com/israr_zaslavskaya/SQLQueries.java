package com.israr_zaslavskaya;

public class SQLQueries {
    public final static String GET_EMPLOYEES_BY_OFFICE_CODE = "select * from employees where officecode   = ? or officecode = ?";
    public final static String GET_ORDER_DETAILS = "select * from orderDetails where orderNumber = ? or orderNumber = ?";
    public final static String UPDATE_EXTENSION_NUMBER = "update employees set extension = ? where officeCode = ?";
    public final static String GET_LAST_NAME = "select * from employees where LENGTH(lastName) < ?";
}
