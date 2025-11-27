package org.lowleveldesign.designPatterns.creational.factory.components.menu;

public class WindowsMenu implements Menu{
    @Override
    public void displayMenu() {
        System.out.println("Window Menu");
    }
}
