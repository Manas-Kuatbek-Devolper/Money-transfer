package project.moneyTransfer.moneyTransfer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.moneyTransfer.moneyTransfer.entities.Account;
import project.moneyTransfer.moneyTransfer.entities.MoneyTransfer;
import project.moneyTransfer.moneyTransfer.services.AccountService;

@RestController
@RequestMapping("/api")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @PostMapping
    public Account addAccount(@RequestBody Account account){

        return accountService.createAccount(account);
    }
    @PutMapping
    public String transferMoney(@RequestBody MoneyTransfer moneyTransfer) {
        String fromAccountId = moneyTransfer.getFromAccountId();
        String toAccountId = moneyTransfer.getToAccountId();
        double amount = moneyTransfer.getAmount();

        return accountService.transferMoney(fromAccountId, toAccountId, amount);
    }

}
