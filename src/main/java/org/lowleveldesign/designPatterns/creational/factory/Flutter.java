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
        return UIFactoryFactory.getUIFactory(platform);
    }
}
