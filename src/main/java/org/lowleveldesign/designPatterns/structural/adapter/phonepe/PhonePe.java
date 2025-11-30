package org.lowleveldesign.designPatterns.structural.adapter.phonepe;

public class PhonePe {
    public static void main(String[] args) {
        BankApi bankApi = new ICICIBankAdapter();
        bankApi.transact("Rohan", "Rahul", 10000);
        bankApi.checkBalance("101");
    }
}
