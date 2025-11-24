package org.lowleveldesign.designPatterns.creational.singleton;

public class Client {
    public static void main(String[] args) {
        //We cannot do this as constructor is private
        //DBConnection dbConnection1 = new DBConnection();

        //So we need to call the getInstance method which can give us the new object
        DBConnection dbConnection1 = DBConnection.getInstance();
        DBConnection dbConnection2 = DBConnection.getInstance();
        DBConnection dbConnection3 = DBConnection.getInstance();

        System.out.println("DEBUG");
    }
}
