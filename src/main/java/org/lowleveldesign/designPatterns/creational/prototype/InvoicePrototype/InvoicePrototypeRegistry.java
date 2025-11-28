package org.lowleveldesign.designPatterns.creational.prototype.InvoicePrototype;

public interface InvoicePrototypeRegistry {

    void addPrototype(Invoice user);

    Invoice getPrototype(InvoiceType type);

    Invoice clone(InvoiceType type);
}
