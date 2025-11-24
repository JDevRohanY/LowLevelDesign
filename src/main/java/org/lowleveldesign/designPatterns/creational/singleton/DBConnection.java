package org.lowleveldesign.designPatterns.creational.singleton;

public class DBConnection {
    /* But this will increase the loading time of the application due to eager loading as this object
       Is initialised at compile time, and we cannot pass variable in constructor

    private static DBConnection instance = new DBConnection(); */

    private static DBConnection instance = null;
    String url;
    String username;
    String password;
    Long port;

    private DBConnection(){

    }

    /* public static DBConnection getInstance(){
        //This is critical section which is not thread safe in multithreading environment
        if(instance == null){
            instance = new DBConnection();
        }
        return instance;
    } */

    public synchronized static DBConnection getInstance(){
        //But this result in slow performance as thread need to wait,
        // also this is termed as lazy loading, and once created still thread need to wait
        // as this is synchronised function block
        if(instance == null){
            instance = new DBConnection();
        }
        return instance;
    }
}
