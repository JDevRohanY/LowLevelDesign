package org.lowleveldesign.designPatterns.creational.factory.UIFactory;

import org.lowleveldesign.designPatterns.creational.factory.UIFactory.UIFactory;
import org.lowleveldesign.designPatterns.creational.factory.components.button.AndroidButton;
import org.lowleveldesign.designPatterns.creational.factory.components.button.Button;
import org.lowleveldesign.designPatterns.creational.factory.components.menu.AndroidMenu;
import org.lowleveldesign.designPatterns.creational.factory.components.menu.Menu;

public class AndroidFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
