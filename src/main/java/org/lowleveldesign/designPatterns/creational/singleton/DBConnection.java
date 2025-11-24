package org.lowleveldesign.designPatterns.creational.singleton;

public class DBConnection {
    private static DBConnection instance = null;
    String url;
    String username;
    String password;
    Long port;

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        if(instance == null){
            instance = new DBConnection();
        }
        return instance;
    }
}
