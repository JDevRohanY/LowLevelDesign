package org.lowleveldesign.designPatterns.creational.factory;

import org.lowleveldesign.designPatterns.creational.factory.UIFactory.*;

// This is a common file
public class UIFactoryFactory {
    public static UIFactory getUIFactory(Platform platform){
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
