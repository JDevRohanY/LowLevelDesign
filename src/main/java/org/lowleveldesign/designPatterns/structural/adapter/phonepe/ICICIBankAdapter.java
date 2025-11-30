package org.lowleveldesign.designPatterns.structural.adapter.phonepe;

public class ICICIBankAdapter implements BankApi{
    @Override
    public void transact(String from, String to, int amount) {
        //Call ICICI Bank Api method of transact
        System.out.printf("ICICI : Transferring %d from %s to %s.%n", amount, from, to);
    }

    @Override
    public void checkBalance(String accountId) {
        //Call ICICI bank check balance api
        System.out.printf("ICICI : Checking Balance for Account Id : %s.%n", accountId);
    }
}
