package org.lowleveldesign.designPatterns.creational.factory.UIFactory;

import org.lowleveldesign.designPatterns.creational.factory.components.button.Button;
import org.lowleveldesign.designPatterns.creational.factory.components.menu.Menu;

public interface UIFactory {
    public Menu createMenu();
    public Button createButton();
}
