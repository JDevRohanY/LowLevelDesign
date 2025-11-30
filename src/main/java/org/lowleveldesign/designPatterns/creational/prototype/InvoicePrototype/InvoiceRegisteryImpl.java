package org.lowleveldesign.designPatterns.creational.prototype.InvoicePrototype;

import java.util.HashMap;
import java.util.Map;

public class InvoiceRegisteryImpl implements InvoicePrototypeRegistry {
    private Map<InvoiceType, Invoice> invoiceRegistery = new HashMap<>();

    public void addPrototype(Invoice user) {
        invoiceRegistery.put(user.getType(), user);
    }
    public Invoice getPrototype(InvoiceType type) {
        return invoiceRegistery.get(type);
    }

    public Invoice clone(InvoiceType type) {
        return invoiceRegistery.get(type).cloneObject();
    }

}
