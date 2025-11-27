package org.lowleveldesign.designPatterns.creational.factory;


import org.lowleveldesign.designPatterns.creational.factory.UIFactory.UIFactory;
import org.lowleveldesign.designPatterns.creational.factory.components.button.Button;
import org.lowleveldesign.designPatterns.creational.factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(Platform.IOS);

        //Create a button
        Button button = uiFactory.createButton();
        button.displayButton();

        //Create a menu
        Menu menu = uiFactory.createMenu();
        menu.displayMenu();
    }

}
