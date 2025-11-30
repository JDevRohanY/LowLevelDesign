package org.lowleveldesign.designPatterns.structural.adapter.phonepe;

public interface BankApi {
    void transact(String from, String to, int amount);
    void checkBalance(String accountId);
}
