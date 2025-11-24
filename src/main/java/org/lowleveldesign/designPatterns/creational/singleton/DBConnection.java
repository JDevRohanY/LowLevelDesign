package org.lowleveldesign.designPatterns.creational.singleton;

public class DBConnection {
    private static DBConnection instance = new DBConnection();
    String url;
    String username;
    String password;
    Long port;

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        //This is critical section which is not thread safe in multithreading environment
        /*if(instance == null){
            instance = new DBConnection();
        }*/
        return instance;
    }
}
