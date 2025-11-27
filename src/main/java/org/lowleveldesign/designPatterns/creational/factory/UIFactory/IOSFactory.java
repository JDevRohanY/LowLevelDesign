package org.lowleveldesign.designPatterns.creational.factory.UIFactory;

import org.lowleveldesign.designPatterns.creational.factory.UIFactory.UIFactory;
import org.lowleveldesign.designPatterns.creational.factory.components.button.Button;
import org.lowleveldesign.designPatterns.creational.factory.components.button.IOSButton;
import org.lowleveldesign.designPatterns.creational.factory.components.menu.IOSMenu;
import org.lowleveldesign.designPatterns.creational.factory.components.menu.Menu;

public class IOSFactory implements UIFactory {

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
