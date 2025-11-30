package org.lowleveldesign.designPatterns.structural.adapter.phonepe;

public class YesBankAdapter implements BankApi{
    @Override
    public void transact(String from, String to, int amount) {
        //Call Yes Bank Api method of transact
        System.out.printf("YES Bank : Transferring %d from %s to %s.%n", amount, from, to);
    }

    @Override
    public void checkBalance(String accountId) {
        //Call Yes bank check balance api
        System.out.printf("YES Bank : Checking Balance for Account Id : %s.%n", accountId);
    }
}
