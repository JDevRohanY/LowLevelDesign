package org.lowleveldesign.designPatterns.creational.factory.UIFactory;

import org.lowleveldesign.designPatterns.creational.factory.UIFactory.UIFactory;
import org.lowleveldesign.designPatterns.creational.factory.components.button.Button;
import org.lowleveldesign.designPatterns.creational.factory.components.button.WindowsButton;
import org.lowleveldesign.designPatterns.creational.factory.components.menu.Menu;
import org.lowleveldesign.designPatterns.creational.factory.components.menu.WindowsMenu;

public class WindowsFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
