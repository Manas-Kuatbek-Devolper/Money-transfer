package project.moneyTransfer.moneyTransfer.services;
import project.moneyTransfer.moneyTransfer.entities.Account;
import project.moneyTransfer.moneyTransfer.entities.MoneyTransfer;

public interface AccountService {
    Account createAccount(Account account);
    String transferMoney(String fromAccountId, String toAccountId, double amount);
}
