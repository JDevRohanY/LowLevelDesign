package org.lowleveldesign.designPatterns.creational.factory.UIFactory;

import org.lowleveldesign.designPatterns.creational.factory.UIFactory.UIFactory;
import org.lowleveldesign.designPatterns.creational.factory.components.button.Button;
import org.lowleveldesign.designPatterns.creational.factory.components.button.MacButton;
import org.lowleveldesign.designPatterns.creational.factory.components.menu.MacMenu;
import org.lowleveldesign.designPatterns.creational.factory.components.menu.Menu;

public class MacFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
