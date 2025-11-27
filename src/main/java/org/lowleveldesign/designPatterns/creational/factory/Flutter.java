package org.lowleveldesign.designPatterns.creational.factory;

import org.lowleveldesign.designPatterns.creational.factory.UIFactory.*;

public class Flutter {
    //Non builder methods
    public void refresh(){
        System.out.println("Screen Refreshed");
    }

    public void changeTheme(Theme theme){
        if(theme.equals(Theme.LIGHT)){
            System.out.println("Theme set to Light");
        }else if(theme.equals(Theme.DARK)){
            System.out.println("Theme set to Dark");
        }
    }

    // Now we will create factory
    public UIFactory getUIFactory(Platform platform){
        if(platform.equals(Platform.IOS)){
            return new IOSFactory();
        }else if (platform.equals(Platform.ANDROID)){
            return new AndroidFactory();
        }else if (platform.equals(Platform.WINDOWS)){
            return new WindowsFactory();
        }else if(platform.equals(Platform.MAC)){
            return new MacFactory();
        }
        return null;
    }


}
